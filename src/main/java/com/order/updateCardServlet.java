package com.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateCardServlet
 */
@WebServlet("/updateCardServlet")
public class updateCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateCardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cusID = request.getParameter("cusID");
		String number = request.getParameter("number");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String cvv = request.getParameter("cvv");
		
		System.out.println(cusID);
		System.out.println("aaaaaaaaaaaaaaaaaa");
		boolean isTrue;
		
		isTrue = cardDBUtil.updateCard(cusID, number, name, date, cvv);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("Index.jsp");
		dis.forward(request, response);
		
	}

}
