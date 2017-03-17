package com.cchivhenge

class Course {

String title
String code
String leader
String department
String description
String studyMode
Boolean sandwichDegree

    static constraints = {

title blank:false, nullable:false
code blank:false, nullable:false, unique:true
leader blank:false, nullable:false
department blank:false, nullable:false
description blank:false, nullable:false, widget:'textarea'
studyMode blank:false, nullable:false
sandwichDegree blank:false, nullable:false

    }
}
