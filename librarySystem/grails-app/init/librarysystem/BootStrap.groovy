package com.cchivhenge

class BootStrap {

    def init = { servletContext ->

def library1=new Library(buildingName: 'Adsettes',
	address:'City Campus',
	openingHours:'12:00 - 12:00',
	location:'City Campus',
	studySpaces:500).save()

def course1=new Course(title: 'Computing BSc',
	code:'CBSC55',
	leader:'Marcus Brownlee',
	department:'Computing',
	description:'computing course',
	studyMode:'Full-time',
	sandwichDegree:true).save()

def student1=new Student(name: 'Chisha Chivhenge',
	email:'cchivhenge@gmail.com',
	username:'chisha101',
	password:'password',
	studentID:'b5018299',
	course:course1,
	library:library1).save()


def book1=new Book(title:'Defining Issues in English Language Teaching',
	subject:'English',
	author:'H. G. Widowson',
	isbn:'0-19-437445-9',
	dateBorrowed:new Date('20/03/2017'),
	returnDate:new Date('27/03/2017'),
	student:student1,
	overdue:false,
	library:library1).save()

def bookReview1=new BookReview(datePublished:new Date ('01/01/2010'),
	review:'This is a book review',
	student:student1,
	book:book1).save()


def librarian1=new Librarian(name:'Julie Roberts',
	email:'jroberts@gmail.com',
	office:'233-2',
	username:'julie101',
	password:'password',
	telephone:'48827448275',
	library:library1).save()

    }
    def destroy = {
    }
}
