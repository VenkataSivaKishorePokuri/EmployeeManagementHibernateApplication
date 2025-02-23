package com.jsp.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.entity.Employee;
import com.jsp.service.EmployeeService;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {

	private final EmployeeService service = new EmployeeService();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			String email = request.getParameter("email");
			double salary = Double.parseDouble(request.getParameter("salary"));

			service.updateEmployee(new Employee(id, name, age, email, salary));

			response.sendRedirect("welcome.jsp");

		} catch (NumberFormatException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}