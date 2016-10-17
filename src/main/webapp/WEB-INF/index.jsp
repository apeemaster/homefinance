<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Control Panel</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<script type="text/javascript" src = "js/jquery.min.js"></script>
		<script type="text/javascript" src="<c:url value="/js/jquery.min.js"/>"></script> <!--DELETE THIS-->

		<script type="text/javascript" src="js/moment-with-locales.min.js"></script> <!--DELETE THIS-->
		<script type="text/javascript" src="<c:url value="/js/moment-with-locales.min.js"/>"></script>

		<script type="text/javascript" src = "js/bootstrap.min.js"></script> <!--DELETE THIS-->
		<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"></script>

		<script type="text/javascript" src="js/bootstrap-datetimepicker.min.js"></script> <!--DELETE THIS-->
		<script type="text/javascript" src="<c:url value="/js/bootstrap-datetimepicker.min.js"/>"></script>

		<link rel="stylesheet" href="css/bootstrap.min.css"> <!--DELETE THIS-->
		<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">

		<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css" /> <!--DELETE THIS-->
		<link rel="stylesheet" href="<c:url value="/css/bootstrap-datetimepicker.min.css"/>">

		<link rel="stylesheet" href="css/main_styles.css"> <!--DELETE THIS-->
		<link rel="stylesheet" href="<c:url value="/css/main_styles.css"/>">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<div id="accountName"></div>
				</div>
				<dov class="col-sm-6">
					<div id="logout"><a href="#">Logout</a></div>
				</dov>
			</div>
			<div class="row">
				<div class="col-md-3">
					<div id="cash">
						<div><h3>Balance:</h3></div>
						<input type="button" class="btn btn-success" value="Add account">
					</div>
				</div>
				<div class="col-md-9">
					<div>
						<ul class="nav nav-tabs" role="tablist">
							<li class="active"><a href="#income" aria-controls="income" role="tab" data-toggle="tab">Income</a></li>
							<li><a href="#expense" aria-controls="expense" role="tab" data-toggle="tab">Expense</a></li>
							<li><a href="#transfer" aria-controls="transfer" role="tab" data-toggle="tab">Transfer</a></li>
							<li><a href="#analysis" aria-controls="analysis" role="tab" data-toggle ="tab">Reports</a></li>
						</ul>
						<div class="tab-content">
							<div role="tabpanel" class="tab-pane active" id="income">
								<form action="" method="post" id="incomeTab">
									<div class="row">
										<div class="col-md-7">
											<div class="form-group">
												<label for="accountIn">To acccount:</label>
												<select class="form-control" name="" id="accountIn">
													<option value="">1</option>
													<option value="">2</option>
												</select>
											</div>
											<div class="form-group">
												<label for="categoryIn">Category:</label>
												<select class="form-control" name="" id="categoryIn">
													<option value="sallary">Salary</option>
													<option value="otherCat">Other</option>
													<!-- <option value="">Добавить свою категорию</option> -->
												</select>
											</div>
										</div>
										<div class="col-md-5">
											<div class="form-group">
												<label for="summIn">Summ:</label>
												<input type="text" class="form-control" id="summIn" >
											</div>
											<div class="form-group">

												<div class="input-group date" id="datetimepicker1">
													<input type="text" class="form-control" />
													<span class="input-group-addon">
														<span class="glyphicon glyphicon-calendar"></span>
													</span>
												</div>

											</div>
										</div>
									</div>
									<input type="submit" class="btn btn-primary" value="Add">
								</form>
							</div><!--Income ends here-->
							<div role="tabpanel" class="tab-pane" id="expense">
								<form action="" method="post" id="expenseTab">
									<div class="row">
										<div class="col-md-7">
											<div class="form-group">
												<label for="accountEx">From account:</label>
												<select class="form-control" name="" id="accountEx">
													<option value="">1</option>
													<option value="">2</option>
												</select>
											</div>
											<div class="form-group">
												<label for="categoryEx">Category:</label>
												<select class="form-control" name="" id="categoryEx">
													<option value="accomodation">Accomodation</option>
													<option value="communication">Telecomunication</option>
													<option value="entertainment">Entertainment</option>
													<option value="food">Food</option>
													<option value="shopping">Shopping</option>
													<option value="transport">Transport</option>
													<option value="noCategory">No category</option>
													<!-- <option value="">Добавить свою категорию</option> -->
												</select>
											</div>
										</div>
										<div class="col-md-5">
											<div class="form-group">
												<label for="summEx">Summ:</label>
												<input type="text" class="form-control" id="summEx" >
											</div>
											<div class="form-group">

												<div class="input-group date" id="datetimepicker2">
													<input type="text" class="form-control" />
													<span class="input-group-addon">
														<span class="glyphicon glyphicon-calendar"></span>
													</span>
												</div>

											</div>
										</div>
									</div>
									<input type="submit" class="btn btn-success" value="Add" id="expensBTN">
								</form>
							</div><!--Expense ends here-->
							<div role="tabpanel" class="tab-pane" id="transfer"></div>
							<div role="tabpanel" class="tab-pane" id="analysis"></div>
						</div>
					</div>
				</div>
			</div>
		<script type="text/javascript" src = "js/main_script.js"></script>
	</body>
