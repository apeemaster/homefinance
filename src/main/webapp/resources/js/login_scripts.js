$(document).ready(function(){
	;$(function() {
	    $('#login-form-link').click(function(e) {
			$("#login-form").delay(100).fadeIn(100);
	 		$("#register-form").fadeOut(100);
			$('#register-form-link').removeClass('active');
			$(this).addClass('active');
			e.preventDefault();
		});
		$('#register-form-link').click(function(e) {
			$("#register-form").delay(100).fadeIn(100);
	 		$("#login-form").fadeOut(100);
			$('#login-form-link').removeClass('active');
			$(this).addClass('active');
			e.preventDefault();
		});
	});

	//Валидация регистрации
	$("#register-form").submit(function(e){
		e.preventDefault();
		 registerNewUser();
	});

	function registerNewUser() {
		var username = $("#usernameReg").val();
		var email = $("#emailReg").val();
		var pass = $("#passwordReg").val();
		var rpass = $("#confirm-passwordReg").val();
		var filter = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

		if(username == "") {
			$("#nameErr").slideDown();
			return false;
		}
		if(email == "") {
			$("#emailErr").slideDown();
			return false;
		}
		if(pass == "") {
			$("#passErr").slideDown();
			return false;
		}
		if(pass.length < 8) {
			$("#shortPass").slideDown();
			return false;
		}
		if(pass != rpass) {
			$("#rpassErr").slideDown();
			return false;
		}
		if(!filter.test(email)) {
			$("#validEmail").slideDown();
			return false;
		}
		//Новый пользователь
		var userReg = {
			"username" : username,
			"email" : email,
			"password" : pass,
			"role" : "ROLE_USER",
			"accounts" : null
		};

			//Отправка
			$.ajax({
				url: 'User/addUser',
				type: 'POST',
				dataType: 'json',
				data: JSON.stringify(userReg),
				contentType: 'application/json',
				mimeType: 'application/json',
				succes: function(){
					console.log("Отправили....");
					showModal();
				},
				error: function(){
					console.log("Не отправили...")
					for (key in userReg) {
						console.log(key + " = " + userReg[key]);
					}
				}
			});
			//Обнуляем поля
			$("#usernameReg").val("");
			$("#emailReg").val("");
			$("#passwordReg").val("");
			$("#confirm-passwordReg").val("");
	}) //end registerNewUser

	$("#usernameReg").change(function(){
		$("#nameErr").slideUp();
	});
	$("#emailReg").change(function(){
		$("#emailErr, #validEmail").slideUp();
	});
	$("#passwordReg").change(function(){
		$("#passErr, #shortPass").slideUp();
	});
	$("#confirm-passwordReg").change(function() {
		$("#rpassErr").slideUp();
	});

	function showModal() {
		var winH = $(window).height();
	  var winW = $(window).width();
		var id = $("#modal");
	  id.css('top', winH/2-id.height()/2);
	  id.css('left', winW/2-id.width()/2);
	  id.fadeIn(500);
	}

		$('.modalwindow .close').click(function (e) {
			e.preventDefault();
			$('.modalwindow').fadeOut(500);
		});

	//Логин
	$("#login-form").submit(function(e) {
		e.preventDefault();
		userLogIn();
	});

	function userLogIn() {
		var username = $("#username").val();
		var pass = $("#password").val();
		var user = {
			"name" : username,
			"password" : pass
		};
		//Отправка
		$.ajax({
			url: 'jsonservlet',
			type: 'POST',
			dataType: 'json',
			data: JSON.stringify(user),
			contentType: 'application/json',
			mimeType: 'application/json',
			succes: function(){
				console.log("Отправили....");
				for (key in user) {
					console.log(key + " = " + user[key]);
				}
			},
			error: function(){
				console.log("Не отправили...");
				for (key in user) {
					console.log(key + " = " + user[key]);
				}
			}
		});
	}
}); //emd document ready
