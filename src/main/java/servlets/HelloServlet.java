package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException {
		String kwota = request.getParameter("kwota");
		String ilosc = request.getParameter("ilosc");
		String oprocentowanie = request.getParameter("oprocentowanie");
		String oplata = request.getParameter("oplata");
		String rodzaj = request.getParameter("rodzaj");
		response.setContentType("text/html");
		response.getWriter().println("<table>\r\n" + 
				"  <tr>\r\n" + 
				"    <th>nr.raty |</th>\r\n" + 
				"    <th>kwota kapitalu |</th>\r\n" + 
				"    <th>kwota odsetek |</th>\r\n" + 
				"    <th>oplaty stale |</th>\r\n" + 
				"    <th>calkowita kwota raty |</th>\r\n" + 
				"  </tr>");		
		Integer il = Integer.parseInt(ilosc);
		Double kw = Double.parseDouble(kwota);
		Double opr = Double.parseDouble(oprocentowanie)/100;
		Double opl = Double.parseDouble(oplata);
		if (rodzaj.contentEquals("malejaca"))
		{
			
		
			double kapit = kw/il;
			
			for(int i=1;i<=il;i++)
			{
				
			double ods =(kw-(i-1)*kapit)*opr;
			double calk = kapit+ods+opl;
		    response.getWriter().println("<tr>\r\n" + 
		    		"    <td>" + i  + "</td>\r\n" + 
		    		"    <td>" + kapit +"</td>\r\n" + 
		    		"    <td>" + ods + " </td>\r\n" + 
		    		"    <td>"+ opl +"</td>\r\n" + 
		    		"    <td>"+calk+"</td>\r\n" + 
		    		"  </tr>");  
				
			}
			response.getWriter().println("</table>");
		}
		else if (rodzaj.contentEquals("stala"))
		{
			/*
			 * for(int i=1;i<=il;i++) {
			 * 
			 * double ods =(kw-(i-1)*kapit)*opr; double calk = kapit+ods+opl;
			 * response.getWriter().println("<tr>\r\n" + "    <td>" + i + "</td>\r\n" +
			 * "    <td>" + kapit +"</td>\r\n" + "    <td>" + ods + " </td>\r\n" +
			 * "    <td>"+ opl +"</td>\r\n" + "    <td>"+calk+"</td>\r\n" + "  </tr>");
			 * 
			 * } response.getWriter().println("</table>");
			 */	
			//stala(ilosc,kwota,oprocentowanie,oplata);
		}
		else response.getWriter().println("</table><br> Blad - nie podano parametru, wypelnij formularz");
		
	}
}
