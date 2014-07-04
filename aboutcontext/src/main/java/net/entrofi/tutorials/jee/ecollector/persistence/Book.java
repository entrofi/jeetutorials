/** 
 *	$Id$
 *
 * <p>Copyright (c) 2014</p>
 * 
 * <b>Latest revision summary:</b><br/>
 * $LastChangedBy$<br/>
 * $LastChangedRevision$<br/>
 * $LastChangedDate$<br/>
 */
package net.entrofi.tutorials.jee.ecollector.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Book<br/>
 * 
 * TODO Please document the type definition<br/>
 * 
 * <p>
 * In order to see the history of changes, please see the header on package
 * definition above.
 * </p>
 * 
 * @author hcomak
 * @created Jul 1, 2014
 * @version TODO insert version number
 * @since TODO insert the product line in which file was created
 * @modified $LastChangedDate$
 */
@Entity
public class Book {
	@Id
	@GeneratedValue
	private int id;

	private String title;

	private String Author;

	private String Description;

	/**
	 * The getter method of the field id
	 * TODO Give field description
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * setId is the setter method of the field id
	 * TODO document the method
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	

	/**
	 * The getter method of the field title
	 * TODO Give field description
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * setTitle is the setter method of the field title
	 * TODO document the method
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * The getter method of the field author
	 * TODO Give field description
	 * @return the author
	 */
	public String getAuthor() {
		return Author;
	}

	/**
	 * setAuthor is the setter method of the field author
	 * TODO document the method
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		Author = author;
	}

	/**
	 * The getter method of the field description
	 * TODO Give field description
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * setDescription is the setter method of the field description
	 * TODO document the method
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}

}
