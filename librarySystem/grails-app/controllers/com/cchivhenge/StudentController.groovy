package com.cchivhenge

class StudentController {

	def scaffold= Student

	def login() {
	}
		
		def validate() {
		def user = Student.findByUserName(params.username)
		if(user && user.password == params.password){
	
		session.user = user
		session.role = 'student'
		render view:'home'

		}

		else{

			flash.message = "invalid username and password."

			render view:'login'
		}
		}
		
			def logout = {
				session.role = null
				session.user = null
				redirect(uri:'/')
				}

	def search(){

		}
	def results(){
		def bookProps = Book.metaClass.properties*.name
		def books = Book.withCriteria{
			"${params.queryType}"{
				params.each{field,value ->
				
				if(bookProps.grep(field)&& value){
					ilike(field, value)
				}
			}
		}
	}
	[books:books]



}
}
