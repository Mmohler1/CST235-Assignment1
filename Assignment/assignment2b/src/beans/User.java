package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class User {

		//Initializing the values 
		String firstName ="";
		String lastName = "";
		
		//Default Constructor
		public User()
		{
			firstName ="Michael";
			lastName ="Mohler";
			
		}

		//Get for first name
		public String getFirstName() {
			return firstName;
		}
		
		//Set for first name
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		//Get for last name
		public String getLastName() {
			return lastName;
		}

		//Set for last name
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
}
