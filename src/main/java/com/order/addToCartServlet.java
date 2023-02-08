package com.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addToCartServlet
 */
@WebServlet("/addToCartServlet")
public class addToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addToCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cusID = request.getParameter("cusID");
		String foodName = request.getParameter("foodName");
		String PID = request.getParameter("productID");
		int quantity = Integer.parseInt(request.getParameter("QTY"));
		double price = Double.parseDouble(request.getParameter("unitPrice"));
		double totPrice = price*quantity;
		
		System.out.println(foodName);
		
		
		boolean isTrue;
		
		isTrue = cartDBUtil.AddCart(cusID,foodName, PID, quantity,totPrice);
		
		RequestDispatcher dis = request.getRequestDispatcher("Index.jsp");
		dis.forward(request, response);
	}

}
