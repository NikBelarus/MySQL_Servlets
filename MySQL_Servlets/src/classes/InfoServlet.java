package classes;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * This <b>servlet</> shows information about population in each city in the database
 * @author Dashchynski Nikita
 * @version 1.0
 * @see HttpServlet
 */
public class InfoServlet extends HttpServlet {
    /**
     * This is doGet method
     * @param req request parametr
     * @param resp response parametr
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MyModel model = MyModel.getInstance();
        HashMap<String, Integer> info = model.countPeople();
        req.setAttribute("info", info);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/info.jsp");
        requestDispatcher.forward(req, resp);
    }
}
