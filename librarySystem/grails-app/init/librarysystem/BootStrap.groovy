package com.cchivhenge

class BootStrap {

    def init = { servletContext ->
/*
//Test data for the library class ------------------------------------------------------------

def library1=new Library(buildingName: 'Adsettes Learning Centre',
	address:'Sheffield S1 1WB',
	openingHours:'24/7',
	location:'City Campus',
	studySpaces:500).save()

def library2=new Library(buildingName: 'Collegiate Library',
	address:'Collegiate Cres, Sheffield S10 2BP',
	openingHours:'24/7',
	location:'Collegiate Campus',
	studySpaces:500).save()

//Test data for the Course class ------------------------------------------------------------

	def course1=new Course(title: 'Computing BSc',
		code:'CBSC55',
		leader:'Marcus Brownlee',
		department:'Computing',
		description:'computing course',
		studyMode:'Full-time',
		sandwichDegree:true).save()

	def course2=new Course(title: 'Sport Science',
		code:'SS345',
		leader:'George Orwel',
		department:'Sports',
		description:'Sports science course',
		studyMode:'Full-time',
		sandwichDegree:true).save()

//Test data for the Student class -----------------------------------------------------------

		def student1=new Student(fullName: 'Chisha Chivhenge',
			email:'cchivhenge@gmail.com',
			userName:'chisha101',
			password:'password',
			studentID:'b5018299',
			course:course1,
			library:library1).save()

		def student2=new Student(fullName: 'Keith Marshall',
			email:'kmarshall@gmail.com',
			userName:'keith101',
			password:'password',
			studentID:'b50184329',
			course:course2,
			library:library2).save()

//Test data for the Book class --------------------------------------------------------------

			def book1=new Book(title:'C# 6.0 and the .NET 4.6 Framework',
				subject:'Computing',
				author:'Andrew Troelsen',
				isbn:'0-19-437445-9',
				dateBorrowed:new Date('20/04/2017'),
				returnDate:new Date('27/04/2017'),
				student:student1,
				overdue:false,
				library:library1).save()

			def book2=new Book(title:'Research Methods in Sport Studies and Sport MAnagement',
				subject:'Sport Science',
				author:'A.J. Veal',
				isbn:'9781317691143',
				dateBorrowed:new Date('20/03/2017'),
				returnDate:new Date('27/03/2017'),
				student:student2,
				overdue:true,
				library:library2).save()


			def book3=new Book(title:'Wordpress Basics',
				subject:'Computing',
				author:'Steve Moss',
				isbn:'234-3737322-43',
				dateBorrowed:new Date('20/03/2017'),
				returnDate:new Date('27/03/2017'),
				student:student1,
				overdue:true,
				library:library1).save()

//Test data for the Book Review class ------------------------------------------------------

			def bookReview1=new BookReview(datePublished:new Date ('26/04/2017'),
				review:'I learned a lot about C#',
				student:student1,
				book:book1).save()

			def bookReview2=new BookReview(datePublished:new Date ('27/03/2017'),
				review:'A lot of information on different research methods',
				student:student2,
				book:book2).save()

//Test data for the Librarian class -------------------------------------------------------
			
				def librarian1=new Librarian(fullName:'Julie Roberts',
					email:'jroberts@gmail.com',
					office:'233-2',
					userName:'julie101',
					password:'password',
					telephone:'48827448275',
					library:library1).save()

				def librarian2=new Librarian(fullName:'Donald Wesley',
					email:'dwesley@gmail.com',
					office:'133-7',
					userName:'Donny101',
					password:'password',
					telephone:'01327448275',
					library:library2).save()
*/
    }
    def destroy = {
    }
}
