
<html>
<head>
<title>Login page</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<p>${errorMsg}</p>
		<form method="post">
			Name : <input type="text" name="name"> Password : <input
				type="password" name="password">
			<button>submit</button>
		</form>
	</div>
</body>
</html>