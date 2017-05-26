package com.pavan.conversation.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pavan.conversation.service.Appointment;
import com.pavan.conversation.service.DoctorService;

/**
 * Servlet implementation class DoctorsDisplay
 */
@WebServlet("/DoctorsDisplay")
public class DoctorsDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoctorsDisplay() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		// String toolfirst = request.getParameter("tname");
		// String toolsecond = request.getParameter("tname2");
		// String toolvalue = request.getParameter("tvalue");
		DoctorService ds = new DoctorService();
		Appointment app=ds.getAppointment(1);
	    System.out.println("New" + app.getExperience());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
