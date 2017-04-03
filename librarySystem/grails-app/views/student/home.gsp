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
			<h2>Submit a Book Review</h3>
		<p>Want to share or review a recent book you have read? Click here to submit a book review.</p>
			<button type="button" class="btn btn-success">
				<g:link controller="BookReview" action="create">Book Reviews</g:link>
			</button>
		</div>

			<div class="second">
				<h2>View Book Reviews</h3>
			<p>Click here to view the list of books</p>
				<button type="button" class="btn btn-success">
					<g:link controller="BookReview" action="index">Book Reviews</g:link>
				</button>
			</div>

				<div class="first">
					<h2>View Books</h3>
				<p>blah blah blah content content content</p>
					<button type="button" class="btn btn-success">
						<g:link controller="Book" action="index">books</g:link>
					</button>
				</div>

					<div class="second">
						<h2>Search for a Book</h3>
					<p>Click here to search for a book</p>
						<button type="button" class="btn btn-success">
							<g:link controller="student" action="search">Search a Book</g:link>
						</button>
					</div>
						<div class="second">
							<h3>Index Action</h3>
						<p></p>
							<button type="button" class="btn btn-success">
								<g:link controller="book" action="indexView">show</g:link>
							</button>
						</div>
							<div class="second">
								<h3>Show Action</h3>
							<p></p>
								<button type="button" class="btn btn-success">
									<g:link controller="book" action="showView">show</g:link>
								</button>
							</div>
							

		</div>
	</div>
</body>
</html>
