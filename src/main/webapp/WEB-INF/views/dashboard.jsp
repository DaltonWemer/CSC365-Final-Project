<!doctype html>
<html lang="en">
<%@ include file="/WEB-INF/layouts/include.jsp" %>
<%@ include file="/WEB-INF/layouts/head.jsp" %>
<body id="demo-body">
	<div id="demo-main-div" class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<h1>Dashboard</h1>
				<%-- Add out JSP to handle messages to the user --%>
				<%@ include file="/WEB-INF/layouts/banner.jsp" %>
				<%@ include file="/WEB-INF/layouts/message.jsp" %>
				
				<%-- This is a "JSP Comment" that IS NOT visible to the user when 
				     viewing the page source --%>
			    <!-- This is an "HTML Comment" that IS visible to the user when 
			         viewing the page source -->
			         
				<!-- Welcome message in a "12 unit-wide" div -->
				<div class="row">
					<div class="col-sm-12">
						${customMessage}
					</div>
				</div>
				<hr />
				<!-- Some Bootstrap Magic 2 rows & 4 cols-->
				<p>
					<h2>Some Bootstrap Magic:</h2>
					
					<h3>2 rows &amp; 4 cols</h3>
					<div class="row">
						<div class="col-sm-3 border">
							Row 1 Col 1
						</div>
						<div class="col-sm-3 border">
							Row 1 Col 2
						</div>
						<div class="col-sm-3 border">
							Row 1 Col 3
						</div>
						<div class="col-sm-3 border">
							Row 1 Col 4
						</div>
					</div>
					<div class="row">
						<div class="col-sm-3 border">
							Row 2 Col 1
						</div>
						<div class="col-sm-3 border">
							Row 2 Col 2
						</div>
						<div class="col-sm-3 border">
							Row 2 Col 3
						</div>
						<div class="col-sm-3 border">
							Row 2 Col 4
						</div>
					</div>
				</p>
				<hr />
				<%-- Form wrapped in a Bootstrap "Card" --%>
				<h2>Form wrapped in a Bootstrap &quot;Card&quot;:</h2>
				<div class="card" id="checkPassswordForm">
					<div class="card-body">
						<form method="post" action="<c:url value='/checkCredentials' />">
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> 
								<input type="text" class="form-control" id="id" name="id"
									aria-describedby="emailHelp" placeholder="Enter email" />
								<small id="emailHelp" class="form-text text-muted">
									We'll never share your email with anyone else.
								</small>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label>
								<input type="password" class="form-control" id="password" name="password" 
									placeholder="Password" />
							</div>
							<div class="form-group form-check">
								<input type="checkbox" class="form-check-input" id="exampleCheck1">
								<label class="form-check-label" for="exampleCheck1"> Check me out </label>
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>