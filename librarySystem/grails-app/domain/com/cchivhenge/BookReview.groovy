package com.cchivhenge

class BookReview {

Date datePublished
String review
Student student
Book book
String toString(){
return book}

    static constraints = {

book blank:false, nullable:false
datePublished blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false, widget:'textarea'

    }
}
