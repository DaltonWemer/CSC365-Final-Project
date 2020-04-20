<!doctype html>
<html lang="en">
<%@ include file="/WEB-INF/layouts/include.jsp" %>
<%@ include file="/WEB-INF/layouts/head.jsp" %>
<body id="demo-body">
	<div id="demo-main-div" class="container-fluid">
		<div class="row">
			<div class="col-sm-12">

				<h1>Demo Page</h1>
				<div class="row mt-3">
					<div class="col-sm-12">	
						<h2>Fontawesome Icons (fa/far/fas fa-user)</h2>
						<div>
							<a target="_blank" href="https://fontawesome.com/icons?d=gallery&m=free">
								https://fontawesome.com/icons?d=gallery&m=free
							</a>
						</div>
				
						<div>Default icon (fa fa-user) -&gt; <i class="fa fa-user"></i></div>
						<div>Regular icon (far fa-user) -&gt; <i class="far fa-user"></i></div>
						<div>Solid icon (fas fa-user) -&gt; <i class="fas fa-user"></i></div>
						
						<!-- Brand Icon-->
						<h2 class="mt-3">Brand Icon (e.g. fab fa-github-square)</h2>
						<i class="fab fa-github-square"></i><i class="fab fa-github"></i>
						<i class="fab fa-facebook"></i><i class="fab fa-facebook-square"></i>
						<i class="fab fa-pinterest"></i><i class="fab fa-pinterest-square"></i>
						<i class="fab fa-twitter"></i><i class="fab fa-twitter-square"></i>
						
						<!-- Bootstrap Buttons -->
						<h2 class="mt-3">Bootstrap Buttons</h2>
						<button type="button" class="btn btn-primary">Primary</button>
						<button type="button" class="btn btn-secondary">Secondary</button>
						<button type="button" class="btn btn-success">Success</button>
						<button type="button" class="btn btn-danger">Danger</button>
						<button type="button" class="btn btn-warning">Warning</button>
						<button type="button" class="btn btn-info">Info</button>
						<button type="button" class="btn btn-light">Light</button>
						<button type="button" class="btn btn-dark">Dark</button>
						<button type="button" class="btn btn-link">Link</button>
						
						<!-- Bootstrap Dropdown -->
						<h2 class="mt-3">Bootstrap Dropdown</h2>
						<div class="dropdown">
						  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						    Dropdown button
						  </button>
						  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
						    <a class="dropdown-item" href="#">Action</a>
						    <a class="dropdown-item" href="#">Another action</a>
						    <a class="dropdown-item" href="#">Something else here</a>
						  </div>
						</div>
						
						<!-- Bootstrap Alerts -->
						<h2 class="mt-3">Bootstrap Alerts</h2>
						<div class="alert alert-primary" role="alert">
						  A simple primary alert-check it out!
						</div>
						<div class="alert alert-secondary" role="alert">
						  A simple secondary alert-check it out!
						</div>
						<div class="alert alert-success" role="alert">
						  A simple success alert-check it out!
						</div>
						<div class="alert alert-danger" role="alert">
						  A simple danger alert-check it out!
						</div>
						<div class="alert alert-warning" role="alert">
						  A simple warning alert-check it out!
						</div>
						<div class="alert alert-info" role="alert">
						  A simple info alert-check it out!
						</div>
						<div class="alert alert-light" role="alert">
						  A simple light alert-check it out!
						</div>
						<div class="alert alert-dark" role="alert">
						  A simple dark alert-check it out!
						</div>
						
						<!-- Bootstrap Modal -->
						<h2 class="mt-3">Bootstrap Modal</h2>
						<!-- Button trigger modal -->
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
						  Launch demo modal
						</button>
						<!-- Actual Modal -->
						<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
						          <span aria-hidden="true">&times;</span>
						        </button>
						      </div>
						      <div class="modal-body">
						        Modal Body Text Goes Here
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						        <button type="button" class="btn btn-primary">Save changes</button>
						      </div>
						    </div>
						  </div>
						</div>
						
						
						<!-- Bootstrap Toast -->
						<h2 class="mt-3">Bootstrap Toast</h2>
						<div aria-live="polite" aria-atomic="true" style="position: relative; min-height: 200px;">
						  <!-- Position it -->
						  <div style="position: absolute; top: 0; right: 0;">
						
						    <!-- Then put toasts within -->
						    <div class="toast" role="alert" aria-live="assertive" aria-atomic="true">
						      <div class="toast-header">
						        <img src="https://www.oreillyauto.com/favicon.ico" class="rounded mr-2" alt="ico">
						        <strong class="mr-auto">Bootstrap</strong>
						        <small class="text-muted">just now</small>
						        <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
						          <span aria-hidden="true">&times;</span>
						        </button>
						      </div>
						      <div class="toast-body">
						        See? Just like this.
						      </div>
						    </div>
						
						    <div class="toast" role="alert" aria-live="assertive" aria-atomic="true">
						      <div class="toast-header">
						        <img src="https://www.oreillyauto.com/favicon.ico" class="rounded mr-2" alt="ico">
						        <strong class="mr-auto">Bootstrap</strong>
						        <small class="text-muted">2 seconds ago</small>
						        <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
						          <span aria-hidden="true">&times;</span>
						        </button>
						      </div>
						      <div class="toast-body">
						        Heads up, toasts will stack automatically
						      </div>
						    </div>
						  </div>
						</div>
						
						<div class="mb-5"></div>
					</div>
				</div>
				
			</div>
		</div>
	</div>
</body>
</html>