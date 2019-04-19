package classes;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * This <b>servlet</> shows the information about all workers
 * @author Dashchynski Nikita
 * @version 1.0
 * @see HttpServlet
 */
public class ListServlet extends HttpServlet {
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
        ArrayList<Person> persons = model.show();
        req.setAttribute("persons", persons);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
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
        String st = req.getParameter("radio");
        if(st != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(st);
            String name = stringTokenizer.nextToken();
            String address = stringTokenizer.nextToken();
            String city = stringTokenizer.nextToken();
            MyModel model = MyModel.getInstance();
            model.delete(name, address, city);
        }
        doGet(req, resp);
    }
}