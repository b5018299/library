package com.cchivhenge

class Library {

String buildingName
String address
String openingHours
String location
int studySpaces

static hasMany=[books:Book, students:Student, librarians:Librarian]

    static constraints = {

buildingName blank:false, nullable:false
address blank:false, nullable:false, unique:true
openingHours blank:false, nullable:false
location blank:false, nullable:false
studySpaces blank:false, nullable:false
    }
}
