<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Page</title>
</head>
<body>
<form action="/login" method="post">
    Name : <input type="text" name="username"> <br>
    Password : <input type="password" name="password"><br>
    <input type="submit" value="Submit"><br>
</form>
<p style="color:red">${error}</p>
</body>
</html>