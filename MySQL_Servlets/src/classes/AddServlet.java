package classes;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * This is <b>servlet</> adding a new person into database
 * @author Dashchynski Nikita
 * @version 1.0
 * @see HttpServlet
 */
public class AddServlet extends HttpServlet {
    /**
     * This is doGet method
     * @param req request parametr
     * @param resp response parametr
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    /**
     * This is doPost method
     * @param req request parametr
     * @param resp response parametr
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person(req.getParameter("userName"), req.getParameter("userAddress"), req.getParameter("userCity"));
        MyModel model = MyModel.getInstance();
        model.add(person);
        doGet(req, resp);
    }
}
