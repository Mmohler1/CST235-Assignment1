//Michael Mohler 

package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped
public class formController 
{
	//Submit by initializing the user in the method 
	public String onSubmit()
	{
		//Get the User Managed bean
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		//Forward to Test Response View along with the user Managed Bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	
	
	//Submit by the user in the test form using the methods parameters.
	public String onSubmit(User user)
	{
		//Forward to test response view with the user managed bean.
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "TestResponse.xhtml";
	}
	
	//Submit by the user in the test form using the methods parameters and then redirects them.
	public String onFlash(User user)
	{
		//Forward to the test response 2 to by redirecting them. 
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "TestResponse2.xhtml?faces-redirect=true";
	}
}
