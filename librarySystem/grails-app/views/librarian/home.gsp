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
			<h1>Add Students</h1>
		<p>Click here to manage the students in a library.</p>
			<button type="button" class="btn btn-success">
				<g:link controller="student" action="create">Add Students</g:link>
			</button>
		</div>

			<div class="second">
				<h3>Add Books</h3>
			<p>Click here to add books.</p>
				<button type="button" class="btn btn-success">
					<g:link controller="book" action="create">Add Books</g:link>
				</button>
			</div>

				<div class="first">
					<h3>Create Course</h3>
				<p>Click here to manage the courses.</p>
					<button type="button" class="btn btn-success">
						<g:link controller="student" action="create">Create Course</g:link>
					</button>
				</div>

					<div class="second">
						<h3>Register a Librarian</h3>
					<p>Click here to register other librarians.</p>
						<button type="button" class="btn btn-success">
							<g:link controller="lecturer" action="create">Lecturer</g:link>
						</button>
					</div>
						<div class="first">
							<h3>Search</h3>
							<p>Click here to search for students by their name.</p>
							<button type="button" class="btn btn-success">
								<g:link controller="librarian" action="search">Search</g:link>
							</button>

		</div>
	</div>
</body>
</html>
