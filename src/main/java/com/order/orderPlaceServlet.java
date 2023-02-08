package com.order;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class orderPlaceServlet
 */
@WebServlet("/orderPlaceServlet")
public class orderPlaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public orderPlaceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cusID = request.getParameter("cusID");
		List<customerCard> cardDetails =cardDBUtil.getCard(cusID);
		
		if(cardDetails.size()==0) {
			RequestDispatcher dis = request.getRequestDispatcher("addCard.jsp");
			dis.forward(request, response);
		}else {
			boolean isTrue;
			isTrue = orderDBUtil.Addorder(cusID);
			cartDBUtil.deleteAllCart(cusID);
			RequestDispatcher dis = request.getRequestDispatcher("Index.jsp");
			dis.forward(request, response);
		}
	}

}
