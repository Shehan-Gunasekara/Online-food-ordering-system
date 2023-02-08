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
 * Servlet implementation class viewCardServlet
 */
@WebServlet("/viewCardServlet")
public class viewCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewCardServlet() {
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
		request.setAttribute("cardDetails", cardDetails);
		
		if(cardDetails.size()>0) {
		RequestDispatcher dis = request.getRequestDispatcher("viewCard.jsp");
		dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("addCard.jsp");
			dis.forward(request, response);
		}
	}

}
