<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>New Worker</title>
</head>

<body>
<div>
    <form method="post" action="/add">
        <p>
            <label>Имя: </label>
            <input type="text" name="userName"/>
        </p>
        <p>
            <label>Адрес: </label>
            <input type="text" name="userAddress"/>
        </p>
        <p>
            <label>Город: </label>
            <input type="text" name="userCity"/>
        </p>
        <input type="submit"/>
    </form>
</div>
<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>

</html>