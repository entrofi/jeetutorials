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

/**
 * AbstractBeanScopesBase<br/>
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
public abstract class AbstractBeanScopesBase {

	
	private int firstNum;
	
	private int secondNum;
	
	private int sum;
	

	public int getFirstNum() {
		return firstNum;
	}



	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}



	public int getSecondNum() {
		return secondNum;
	}



	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}



	public final int getSum(){
		return firstNum + secondNum;
	}
	
	public final void setSum(){
		System.out.println("Sum is now: " + getSum());
	}
}
