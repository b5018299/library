<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

	<div class="navbar-default navbar-static-top" role=navigation">
		<div class="container">
			<div class="navbar-header">
				<a class-"navbar-brand" href="/#">
					<i class="fa grails-icon">
						<asset:image src="sheffield_hallam_logo.png" style="width: 250px"/>
					</i> Library System
					<br>
				</a>
			</div>

    		</div>
		<g:loginToggle/>
	</div>
	<asset:image src="libraryHeader2.jpg" style="width: 100%"/>
    <g:layoutBody/>

    <div class="footer" role="contentinfo"></div>

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <asset:javascript src="application.js"/>

</body>
</html>
