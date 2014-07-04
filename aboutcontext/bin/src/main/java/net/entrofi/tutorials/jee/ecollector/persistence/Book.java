package net.entrofi.tutorials.jee.ecollector.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * 
 * Book<br/>
 * 
 * TODO Please document the type definition<br/>
 *
 * <p>In order to see the history of changes, please see the header on package
 * definition above.</p>
 *
 * @author hcomak
 * @created Jul 4, 2014
 * @version TODO insert version number
 * @since TODO insert the product line in which file was created
 * @modified $LastChangedDate$
 */
@Entity

public class Book implements Serializable {

	   
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable=false)
	private String title;
	
	private String author;
	
	private String isbn;
	
	private float price;
	
	private static final long serialVersionUID = 1L;

	public Book() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
   
}
