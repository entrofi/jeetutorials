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
package net.entrofi.tutorials.jee.jsfwithjpa.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Book<br/>
 * 
 * TODO Please document the type definition<br/>
 *
 * <p>In order to see the history of changes, please see the header on package
 * definition above.</p>
 *
 * @author hasan
 * @created Jun 12, 2014
 * @version TODO insert version number
 * @since TODO insert the product line in which file was created
 * @modified $LastChangedDate$
 */
@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	private String author;

	/**
	 * The getter method of the field id
	 * TODO Give field description
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * setId is the setter method of the field id
	 * TODO document the method
	 * @param id the id to set
	 */
	public void setId(long id) {
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
		return author;
	}

	/**
	 * setAuthor is the setter method of the field author
	 * TODO document the method
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

}
