package net.entrofi.tutorials.jee.ecollector.scopes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

/**
 * 
 * NoneScopedManagedBean<br/>
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
@NoneScoped
public class NoneScopedManagedBean extends AbstractBeanScopesBase{

	public NoneScopedManagedBean() {
	super();
	}
}
