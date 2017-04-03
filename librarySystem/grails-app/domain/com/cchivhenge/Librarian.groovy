package com.cchivhenge

class Librarian {

String fullName
String email
String office
String userName
String password
String telephone
Library library
String toString(){
return fullName}

    static constraints = {

fullName blank:false, nullable:false
email blank:false, nullable:false, unique:true, email:true
office blank:false, nullable:false, unique:true
userName blank:false, nullable:false, unique:true
password blank:false, nullable:false, password:true
telephone blank:false, nullable:false
library blank:false, nullable:false
    }
}
