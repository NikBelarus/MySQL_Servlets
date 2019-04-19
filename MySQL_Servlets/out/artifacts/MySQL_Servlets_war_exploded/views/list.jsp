<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="classes.Person" %>
<%@ page import="classes.MyModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Workers list</title>
</head>
<body>
<div>
    <h1>All workers</h1>
</div>

<div>
    <div>
        <%
            ArrayList<Person> persons = (ArrayList<Person>) request.getAttribute("persons");
            if (persons != null && !persons.isEmpty()) {
                out.println("<form method='post' action='/list'>");
                out.println("<table>");
                out.println("<tr>");
                out.println("<th></th><th>Name</th><th>Address</th><th>City</th>");
                out.println("</tr>");
                for (int i = 0; i < persons.size(); i++) {
                    out.println("<tr>");
                    out.println("<td><input type='radio' name='radio' value='" + persons.get(i).getName() + " " +
                            persons.get(i).getAdress() + " " + persons.get(i).getCity() + "'/></td>");
                    out.println("<td>" + persons.get(i).getName() + "</td><td>"
                            + persons.get(i).getAdress() + "</td><td>" + persons.get(i).getCity() + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                out.println("<input type='submit' value='delete'/>");
                out.println("</form>");
            } else out.println("<p>There are no users yet!</p>");
        %>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>