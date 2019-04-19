<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Info about workers</title>
</head>

<body>
<div>
    <div>
        <%
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