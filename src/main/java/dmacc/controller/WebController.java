/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Movie;
import dmacc.repository.MovieRepository;

@Controller
public class WebController {
	@Autowired
	MovieRepository repo;
	
	@GetMapping("{ \"/\", \"viewAll\" }")
	public String viewAllMovies(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewMovie(model);
		}
		model.addAttribute("movies", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputMovie")
	public String addNewMovie(Model model) {
		Movie m = new Movie();
		model.addAttribute("newMovie", m);
		return "input";
	}
	
	@PostMapping("/inputMovie")
	public String addNewMovie(@ModelAttribute Movie m, Model model) {
		repo.save(m);
		return viewAllMovies(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateMovie(@PathVariable("id") long id, Model model) {
		Movie m = repo.findById(id).orElse(null);
		model.addAttribute("newMovie", m);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseMovie(Movie m, Model model) {
		repo.save(m);
		return viewAllMovies(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Movie m = repo.findById(id).orElse(null);
		repo.delete(m);
		return viewAllMovies(model);
	}
}