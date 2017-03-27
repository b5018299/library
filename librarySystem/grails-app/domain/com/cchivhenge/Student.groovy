package com.cchivhenge

class Student {

String name
String email
String username
String password
String studentID
Course course
Library library

static hasMany=[bookReviews:BookReview, books:Book]


    static constraints = {

name blank:false, nullable:false
email blank:false, nullable:false, unique:true, email:true
username blank:false, nullable:false, unique:true
password blank:false, nullable:false
studentID blank:false, nullable:false, unique:true
    }
}
