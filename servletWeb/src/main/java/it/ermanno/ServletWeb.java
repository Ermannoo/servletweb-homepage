package it.ermanno;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletWeb extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	          
	        Writer w = resp.getWriter();
	        
	        w.write("<!DOCTYPE HTML>\r\n"
	        		+ "<html>\r\n"
	        		+ "    \r\n"
	        		+ "    \r\n"
	        		+ "<style>\r\n"
	        		+ "div {\r\n"
	        		+ "  background-color: white;\r\n"
	        		+ "}\r\n"
	        		+ "\r\n"
	        		+ ".center div {\r\n"
	        		+ "  margin: auto;\r\n"
	        		+ "  width: 50%;\r\n"
	        		+ "  border: 3px solid green;\r\n"
	        		+ "  padding: 10px;\r\n"
	        		+ "}\r\n"
	        		+ "\r\n"
	        		+ "body {\r\n"
	        		+ "  background-image: url('https://c4.wallpaperflare.com/wallpaper/49/509/318/network-binary-binary-code-web-wallpaper-thumb.jpg');\r\n"
	        		+ "  background-repeat: no-repeat;\r\n"
	        		+ "  background-attachment: fixed;\r\n"
	        		+ "  background-size: cover;\r\n"
	        		+ "}\r\n"
	        		+ "    \r\n"
	        		+ ".center {\r\n"
	        		+ "  display: block;\r\n"
	        		+ "  margin-left: auto;\r\n"
	        		+ "  margin-right: auto;\r\n"
	        		+ "  width: 16%;\r\n"
	        		+ "}\r\n"
	        		+ "</style>\r\n"
	        		+ " \r\n"
	        		+ " \r\n"
	        		+ "<head>\r\n"
	        		+ "    <p style=\"background-image: url('https://c4.wallpaperflare.com/wallpaper/49/509/318/network-binary-binary-code-web-wallpaper-thumb.jpg');\">\r\n"
	        		+ "</head>\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "<body>\r\n"
	        		+ "    <div>Welcome to my own portfolio, here you can read some stuff about me!</div>\r\n"
	        		+ "    \r\n"
	        		+ "    <br>\r\n"
	        		+ "    \r\n"
	        		+ "    <img src=\"https://redteam360.com/wp-content/uploads/2021/09/ethical-hacker-junior.png\" alt=\"Baby Hacker... ;)\" class=\"center\">\r\n"
	        		+ "</body>\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "</html>");		 
	        w.flush();
	        w.close();
	    }

}
