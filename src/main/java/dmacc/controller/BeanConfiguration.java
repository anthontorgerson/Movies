/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.controller;

/**
 * @author AnthonT
 *
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Details;
import dmacc.beans.Movie;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Movie movie() {
		Movie bean = new Movie("The Beach");
		return bean;
	}

	@Bean
	public Details details() {
		Details bean = new Details("Drama/Thriller", "R", "2000");
		return bean;
	}
}
