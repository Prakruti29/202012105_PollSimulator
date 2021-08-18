package com.PollSimulator.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.PollSimulator.model.Candidate;
import com.PollSimulator.service.CandidateService;

/**
 * Servlet implementation class WinnerController
 */
@WebServlet("/WinnerController")
public class WinnerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WinnerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Candidate> c=CandidateService.showWinner();
		if(c!=null) {
			response.sendRedirect("displayWinner.jsp");
		}
	}

}
