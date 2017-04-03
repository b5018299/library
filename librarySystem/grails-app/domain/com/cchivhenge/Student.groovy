package com.cchivhenge

class Student {

String fullName
String email
String userName
String password
String studentID
Course course
Library library
String toString(){
return fullName}

static hasMany=[bookReviews:BookReview, books:Book]

    static constraints = {

fullName blank:false, nullable:false
email blank:false, nullable:false, unique:true, email:true
userName blank:false, nullable:false, unique:true
password blank:false, nullable:false, password:true
studentID blank:false, nullable:false, unique:true
    }
}
