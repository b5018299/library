package com.cchivhenge

import grails.converters.*

class BookController {

static allowedMethods = [index: "GET",show: "GET"]

	def scaffold= Book

	def indexView(Book book){
	
		render Book.list()as JSON
	}
	def showView(Book book){

		if(params.id && Book.exists(params.id)){
			render Book.findById(params.id) as JSON
		}
		else{

			render Book.list() as JSON
		}
	}
}
