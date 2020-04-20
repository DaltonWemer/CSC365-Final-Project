<!doctype html>
<html lang="en">
<%@ include file="/WEB-INF/layouts/include.jsp" %>
<%@ include file="/WEB-INF/layouts/head.jsp" %>
<body id="demo-body">
	<div id="demo-main-div" class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<h1>Example Page</h1>
				<%@ include file="/WEB-INF/layouts/message.jsp" %>
				${message}		
				
				<c:forEach var="example" items="${exampleList}">
				    <c:out value="${example}"/><br/> 
				</c:forEach>

			</div>
		</div>
	</div>
</body>
</html>