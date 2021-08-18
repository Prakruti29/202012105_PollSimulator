package com.PollSimulator.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.PollSimulator.model.Candidate;
import com.PollSimulator.service.CandidateService;


/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Candidate c=new Candidate();
		c.setId(Long.parseLong(request.getParameter("id")));
		c.setName(request.getParameter("name"));
		c.setVotes(0);
		boolean status=CandidateService.register(c);
		if(status==true){
		  HttpSession session = request.getSession(true);	    
	      session.setAttribute("message","Candidate registered successfully"); 
	    }
		else {
			HttpSession session = request.getSession(true);	    
	        session.setAttribute("message","Candidate is already registered"); 
		}
		response.sendRedirect("RegistrationStatus.jsp"); 
	}


}
