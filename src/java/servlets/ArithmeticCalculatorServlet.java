package servlets;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String number1 = request.getParameter("number1");
        String number2 = request.getParameter("number2");
        String button = request.getParameter("button");
        request.setAttribute("number1", number1);
        request.setAttribute("number2", number2);
        
        if (number1.equals("")&&number2.equals("")){
            request.setAttribute("message1", "---");
        }
        else if (number1 == null || number2 == null || number1.equals("") || number2.equals("") || 
                !number1.matches("[0-9]+") || !number2.matches("[0-9]+")){
                request.setAttribute("message1", "Invalid");
        }
        else{
        int ans = 0;
        int num1 = parseInt(number1);
        int num2 = parseInt(number2);
        switch(button){
            case "+":
                ans = num1 + num2;
                request.setAttribute("message1", ans);
                break;
            case "-":
                ans = num1 - num2;
                request.setAttribute("message1", ans);
                break;
            case "*":
                ans = num1 * num2;
                request.setAttribute("message1", ans);
                break;
            case "%":
                ans = num1 % num2;
                request.setAttribute("message1", ans);
                break;        
        }
        }
        
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }


}
