/**
 * This file is part of the IoTLab project
 * For further information, check out our github page 
 * https://github.com/AnthonyDeroche/iotlab/
**/

package iotlab.apps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Anthony Deroche - Thierry Duhal
 *
 */
@WebServlet("/mapTN")
public class MapTN extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapTN() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/WEB-INF/index.jsp?page=mapTN";
		

		if(request.getParameter("option")!=null){
			String option = request.getParameter("option");
				request.setAttribute("option", option);
		}else{
			request.setAttribute("option", "none");
		}

		this.getServletContext().getRequestDispatcher(view)
		.forward(request, response);
	}
}
