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
import javax.faces.bean.SessionScoped;

/**
 * IndexManagedBean<br/>
 * 
 * TODO Please document the type definition<br/>
 *
 * <p>In order to see the history of changes, please see the header on package
 * definition above.</p>
 *
 * @author hasan
 * @created Jul 5, 2014
 * @version TODO insert version number
 * @since TODO insert the product line in which file was created
 * @modified $LastChangedDate$
 */
@ManagedBean
@SessionScoped
public class IndexManagedBean {

	
	public String showBeanScopes(){
		return "scopes/scopes.xhtml";
	}
	
	public String showCollections(){
		return "collections/booklist.xhtml";
	}
}
