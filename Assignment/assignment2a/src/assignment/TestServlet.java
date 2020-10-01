package assignment;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 * Activates when server starts.
	 */
	public void init(ServletConfig config) {
		// TODO Auto-generated method stub
		
		//A print statement to show when the method activates
		System.out.println("This is the init.");
	}

	/**
	 * @see Servlet#destroy()
	 * Activates when server is shut down.
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
		//A print statement to show when the method activates
		System.out.println("This is the Destroy..");
	}

	
	//Makes Strings from one JSP's parameters to be check for Null or Empty, then sets that as attributes in another JSP.
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Sets strings for first at last name to parameters of a similar name.
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		
		//Checks if either the parameters are null and void, if so send user to error page. 
		if (firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty())
		{
			request.getRequestDispatcher("TestError.jsp").forward(request, response);
		}
		else	
		{
			
		//Sets attributes from TR.jsp as the string after it has been checked for no input
		request.setAttribute("firstname", firstName);
		request.setAttribute("lastname", lastName);
		
		//Forwards it to the JSP.
		request.getRequestDispatcher("TestResponse.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
}
