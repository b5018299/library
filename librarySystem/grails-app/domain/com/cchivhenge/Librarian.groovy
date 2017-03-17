package com.cchivhenge

class Librarian {

String name
String email
String office
String username
String password
int telephone
String library

    static constraints = {

name blank:false, nullable:false
email blank:false, nullable:false, unique:true
office blank:false, nullable:false, unique:true
username blank:false, nullable:false, unique:true
password blank:false, nullable:false
telephone blank:false, nullable:false
library blank:false, nullable:false
    }
}
