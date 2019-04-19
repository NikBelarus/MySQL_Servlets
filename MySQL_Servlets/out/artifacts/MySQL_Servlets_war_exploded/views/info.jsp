<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: Nik Belarus
  Date: 08.04.2019
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info about workers</title>
</head>
<body>
<div>
    <div>
        <%
            //ArrayList<String> info = (ArrayList<String>) request.getAttribute("info");
            HashMap<String, Integer> info = (HashMap<String, Integer>) request.getAttribute("info");
            out.println("<table>");
            out.println("<tr><th>City</th><th>Population</th></tr>");
            for(Map.Entry<String, Integer> pair : info.entrySet())
            {
                out.println("<tr>");
                out.println("<td>" + pair.getKey() + "</td><td>" + pair.getValue() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        %>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>