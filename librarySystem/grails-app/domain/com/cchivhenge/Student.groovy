package com.cchivhenge

class Student {

String name
String email
String username
String password
String studentID
String course

    static constraints = {

name blank:false, nullable:false
email blank:false, nullable:false, unique:true
username blank:false, nullable:false, unique:true
password blank:false, nullable:false
studentID blank:false, nullable:false, unique:true
course blank:false, nullable:false
    }
}
