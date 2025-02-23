package com.jsp.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.EmployeeService;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {

	private final EmployeeService service = new EmployeeService();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			
			int id = Integer.parseInt(request.getParameter("id"));

			service.deleteEmployee(id);
			response.sendRedirect("displayEmployees");

			

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	
	
}