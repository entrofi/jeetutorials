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
package net.entrofi.tutorials.jee.ecollector.scopes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * ViewScopedManagedBean<br/>
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
@ManagedBean(name="viewScopedManagedBean")
@ViewScoped
public class ViewScopedManagedBean extends AbstractBeanScopesBase{
	public ViewScopedManagedBean() {
		super();
	}

}
