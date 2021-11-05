/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;
import lombok.Data;

/**
 * @author AnthonT
 *
 */
@Data
@Embeddable
public class Movie {
	private String movieTitle;
	
	public Movie() {
		// spaceholder
	}

	public Movie(String movieTitle) {
		// spaceholder
	}

	/**
	 * @return the movieTitle
	 */
	public String getMovieTitle() {
		return movieTitle;
	}

	/**
	 * @param movieTitle the movieTitle to set
	 */
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
}
