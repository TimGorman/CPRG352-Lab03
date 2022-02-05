package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
    if( age == null || age.equals("")){
        String message = "You must give your current age";
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }
    //  else if(age = )
      //String messageInvalidAge = "You must enter a number";
    //else age++;
        
       // System.out.println(age);
    }

