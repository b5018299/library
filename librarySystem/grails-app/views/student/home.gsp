<!doctype html>
<html>
<head>
	<asset:stylesheet src="home.css"/>
    <meta name="layout" content="main"/>
    <title>Welcome to the best Grails Bruh in home gsp</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

    <div id="content" role="main">
	
	<div class="row">
		
		<div class="first">
			<h2>Course Management</h3>
		<p>blah blah blah content content content</p>
			<button type="button" class="btn btn-success">
				<g:link controller="course" action="create">Course</g:link>
			</button>
		</div>

			<div class="second">
				<h2>Module Management</h3>
			<p>blah blah blah content content content</p>
				<button type="button" class="btn btn-success">
					<g:link controller="module" action="create">Module</g:link>
				</button>
			</div>

				<div class="first">
					<h2>Student Management</h3>
				<p>blah blah blah content content content</p>
					<button type="button" class="btn btn-success">
						<g:link controller="student" action="create">Student</g:link>
					</button>
				</div>

					<div class="second">
						<h2>Lecturer Management</h3>
					<p>blah blah blah content content content</p>
						<button type="button" class="btn btn-success">
							<g:link controller="lecturer" action="create">Lecturer</g:link>
						</button>
					</div>
						<div class="first">
							<h3>Search</h3>
							<p></p>
							<button type="button" class="btn btn-success">
								<g:link controller="student" action="search">Courses</g:link>
							</button>
						</div>
							<div class="second">
								<h3>Advanced Search</h3>
								<p></p>
								<button type="button" class="btn btn-success">
									<g:link controller="student" action="advSearch">Courses</g:link>
								</button>
							</div>
								<div class="first">
									<h3>Display Modules</h3>
									<p></p>
									<button type="button" class="btn btn-success">
										<g:link controller="module" action="index">Index</g:link>
									</button>
								</div>
									<div class="second">
										<h3>Show</h3>
										<p></p>
										<button type="button" class="btn btn-success">
											<g:link controller="module" action="index">show</g:link>
										</button>
									</div>

		</div>
	</div>
</body>
</html>
