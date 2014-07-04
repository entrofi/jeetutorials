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
package net.entrofi.tutorials.jee.ecollector.view;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.entrofi.tutorials.jee.ecollector.persistence.Book;





/**
 * BookManagedBean<br/>
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
@ManagedBean(name="bookManagedBean", eager=true)
public class BookManagedBean {
	
	private EntityManagerFactory emf;
	
	private Book book;
	
	
	public BookManagedBean(){
		System.out.println("BookManagedBean started");
	}
	
	
	public String createNewBook(){
		book = new Book();
		return "createbook";
	}
	
	
	public String saveBook(){
		EntityManager entityManager = getEntityManagerFactory().createEntityManager();
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(book);
			entityManager.getTransaction().commit();
			return "index";
		}finally{
			entityManager.close();
		}
	}
	
	private EntityManagerFactory getEntityManagerFactory(){
		if(emf == null){
			emf = Persistence.createEntityManagerFactory("jsfwithjpa");
		}
		return emf;
	}
	
	
	public void create(Book book){
		EntityManager entityManager = getEntityManagerFactory().createEntityManager();
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(book);
			entityManager.getTransaction().commit();
		}finally{
			entityManager.close();
		}
	}
	
	public Book read(long id){
		EntityManager entityManager = getEntityManagerFactory().createEntityManager();
		try{
			return entityManager.find(Book.class, id);
		}finally{
			entityManager.close();
		}
	}
	
	public String getHello(){
		return "Hello JSF";
	}


	/**
	 * The getter method of the field book
	 * TODO Give field description
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}


	/**
	 * setBook is the setter method of the field book
	 * TODO document the method
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	

}
