package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author howar
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age1 = request.getParameter("age");
        request.setAttribute("age", age1);
        
        if (age1.equals("") || age1==null){
            request.setAttribute("message", "You must give your current age");
        }
        else if (!age1.matches("[0-9]+$")){
            request.setAttribute("message", "You must enter only numbers");   
        }
        else {
            int age = Integer.parseInt(age1);
            age++;
            request.setAttribute("message", "Your age next birthday will be " + age);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }



}
