package tutoringWebsite.servlets;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutoringWebsite.model.*;
import tutoringWebsite.controllers.*;

public class ScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("schedule Servlet: doGet");	 
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/schedule.jsp").forward(req, resp); 
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("schedule Servlet: doPost");
		

		String errorMessage = null;


		Schedule model = null;

		

		
		ScheduleController controller = new ScheduleController();

		controller.setModel(model);
		
		ArrayList<session> sessions = new ArrayList<session>();
		
		// decode POSTed form parameters and dispatch to controller
		try {
			//String date = getInitParameter(req.getParameter("date"));
			
			
			// check for errors in the form data before using is in a calculation
			if (req.getParameter("Submit") != null) {
				sessions = (ArrayList<session>) controller.getScheduleWithDate("Submit");
			}
			else if(req.getParameter("SubmitW") != null){
				sessions = (ArrayList<session>) controller.getScheduleWithDate("SubmitW");
			}
			else if(req.getParameter("SubmitM") != null) {
				sessions = (ArrayList<session>) controller.getScheduleWithDate("SubmitM");
			}
		
		} catch (NumberFormatException e) {
			errorMessage = "Try failed";
		}
		
	
		
		
		// add result objects as attributes
		// this adds the errorMessage text and the result to the response
		req.setAttribute("errorMessage", errorMessage);
		req.setAttribute("sessions", sessions);
		
		System.out.println("Session Size: " + sessions.size() + ", Session Tutor for First Session: " + sessions.get(0).getTutor());
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/schedule.jsp").forward(req, resp);
	}

	// gets double from the request with attribute named s

	}