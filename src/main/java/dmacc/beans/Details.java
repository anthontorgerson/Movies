/**
 * @author AnthonT - atorgerson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.beans;

/**
 * @author AnthonT
 *
 */
import javax.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Details {
	private String genre;
	private String rating;
	private String year;

	public Details() {
		super();
	}

	public Details(String genre, String rating, String year) {
		super();
		this.genre = genre;
		this.rating = rating;
		this.year = year;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
}
