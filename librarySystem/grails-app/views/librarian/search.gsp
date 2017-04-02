<!doctype html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Sreda Enrolment Systems - Advanced Search</title>

		<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	</head>
		<body>
			<div class="row">
				<h1>Library System</h1>
				<formset>
					<legend>Advanced Search for Books</legend>
					<table>
						<g:form action="results">
						<tr>
							<td>Full Name</td>
							<td><g:textField name="fullName"/></td>
						</tr>
						<tr>
							<td>Student ID</td>
							<td><g:textField name="studentID"/></td>
						</tr>
						<tr>
							<td>Email</td>
							<td><g:textField name="email"/></td>
						</tr>
						<tr>
							<td>Query Type:</td>
							<td><g:radioGroup name="queryType" label="['And','Or','Not']"
							values="['and','or','not']"value="and">
							${it.radio}${it.label}
						</g:radioGroup>
					</td>
				</tr>
				<tr>
					</td>
					<td>
					<g:submitButton name="search"value="Search"/></td>
				</tr>
				</g:form>
				</table>
			</formset>
		</div>
	</body>
</html>
