package com.order;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewCartServlet
 */
@WebServlet("/viewCartServlet")
public class viewCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cusID = request.getParameter("cusID");
		
		List<cart> cartDetails =cartDBUtil.getCart(cusID);
		double total=200;
		for(int i=0;i<cartDetails.size();i++) {
			total=total+cartDetails.get(i).price;
		}
		
		
		request.setAttribute("cartDetails", cartDetails);
		request.setAttribute("cartTotal", total);
		
		RequestDispatcher dis = request.getRequestDispatcher("cart.jsp");
		dis.forward(request, response);
	}

}
