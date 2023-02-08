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
 * Servlet implementation class menuServlet
 */
@WebServlet("/menuServlet")
public class menuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public menuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<menu> allMenu = menuDBUtil.getMenu();
		List<menu> breakfastMenu = menuDBUtil.getBreakFastMenu();
		List<menu> lunchMenu = menuDBUtil.getlunchMenu();
		List<menu> dinnerMenu = menuDBUtil.getDinnerMenu();
		
		System.out.println("aaaaaaaaaaaaaaaaa");
		request.setAttribute("allMenu", allMenu);
		request.setAttribute("breakfastMenu", breakfastMenu);
		request.setAttribute("lunchMenu", lunchMenu);
		request.setAttribute("dinnerMenu", dinnerMenu);
		
		RequestDispatcher dis = request.getRequestDispatcher("menu.jsp");
		dis.forward(request, response);
		
	}

}
