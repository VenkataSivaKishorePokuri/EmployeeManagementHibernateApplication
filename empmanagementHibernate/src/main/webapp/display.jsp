<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.jsp.entity.Employee" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee List</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Employee List</h2>
        
        <!-- Check if the employees list is not empty -->
        <%
            List<Employee> employees = (List<Employee>) request.getAttribute("employees");
            if (employees != null && !employees.isEmpty()) {
        %>
            <table border="1" cellpadding="5" cellspacing="0">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Email</th>
                        <th>Salary</th>
                    </tr>
                </thead>
                <tbody>
                    <!-- Loop through the employees list and display each employee's details -->
                    <%
                        for (Employee employee : employees) {
                    %>
                        <tr>
                            <td><%= employee.getId() %></td>
                            <td><%= employee.getName() %></td>
                            <td><%= employee.getAge() %></td>
                            <td><%= employee.getEmail() %></td>
                            <td><%= employee.getSalary() %></td>
                        </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        <%
            } else {
        %>
            <p>No employees found.</p>
        <%
            }
        %>

        <!-- Link back to the home page -->
        <div class="home-link-container">
            <a class="home-link" href="welcome.jsp">Home</a> <!-- Link to your home page -->
        </div>
    </div>
</body>
</html>
