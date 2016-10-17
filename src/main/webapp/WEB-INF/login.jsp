<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		<link href="<c:url value="/css/login_styles.css"/>" rel="stylesheet">
	</head>
	<body>
		<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="register-form-link">Registration</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<c:url value="/j_spring_security_check" var = "loginUrl" />
								<form id="login-form" action="${loginUrl}" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="j_login" id="username" tabindex="1" class="form-control" placeholder="Login" value="">
										<span id="userEnterError">Wrong login/password.</span>
									</div>
									<div class="form-group">
										<input type="password" name="j_password" id="password" tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
										<label for="remember"> Remember</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Login">
											</div>
										</div>
									</div>

								</form>
								<form id="register-form" action="" method="post" role="form" style="display: none;">
									<div class="form-group">
										<input type="text" name="usernameReg" id="usernameReg" tabindex="1" class="form-control" placeholder="Username" value="">
										<span id="nameErr">Enter username</span>
									</div>
									<div class="form-group">
										<input type="text" name="emailReg" id="emailReg" tabindex="1" class="form-control" placeholder="Your Email" value="">
										<span id="emailErr">Enter your email</span>
										<span id="validEmail">Enter valid email</span>
										<span id="sameEmail">User with such Email is already exists</span>
									</div>
									<div class="form-group">
										<input type="password" name="passwordReg" id="passwordReg" tabindex="2" class="form-control" placeholder="Password">
										<span id="passErr">Enter password</span>
										<span id="shortPass">The password should contain minimum 8 symbols</span>
									</div>
									<div class="form-group">
										<input type="password" name="confirm-passwordReg" id="confirm-passwordReg" tabindex="2" class="form-control" placeholder="Re-enter password">
										<span id="rpassErr">Your passwords don't match</span>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register">
											</div>
										</div>
									</div>
								</form>
								<div id="modal" class="modalwindow">
									<!-- Modal window Title -->
									<h2>Thank you for registration!</h2>
									<!-- close button is defined as close class -->
									<a href="#" class="close">X</a>
									<div class="content">
										The message has been sent on your email.
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="<c:url value="/js/login_scripts.js"/>"></script>
	</body>
</html>
