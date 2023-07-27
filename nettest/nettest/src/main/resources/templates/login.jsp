
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form th:action="@{/login}" method="get">
  <label for="fname">name:</label><br>
  <input type="text" id="userid" name="userid" ><br>
  <label for="lname">password:</label><br>
  <input type="text" id="password" name="password" ><br><br>
  <input type="submit" value="Submit">
</form> 
</body>
</html>