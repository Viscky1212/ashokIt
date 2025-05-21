package com.example.exception;


public class CustomerNotFoundException extends RuntimeException {
	
	public CustomerNotFoundException(){
	  super();	
	}
	
	public CustomerNotFoundException(String msg) {
		super(msg);
	}

}
/*
==============================
REST ArchiTecture Principal
==============================

Rest : Representation State Transfer
1. Client Server Architecture(B2B Communication)
2.No state/ Session Management
3.Unique Addressbility
4.Map restAPI endpoint to Http Mathod 
5. MediaType Representation(consume , produce, & content- type , accept)
6.HATEOS (Hypermedia )

===========
HATEOS
===========

1. Its one of the REST Architectural Principal 
2.Its used to send response along with the hyperlinks for related data

 ex  {
  "content":"Hello, World!",
  "_links":{
    "self":{
      "href":"http://localhost:8080/greeting?name=World"
    }
  }
}

=============>
In springboot we have HAREOS starter to develop REST API with HATEOS concept;



























*/