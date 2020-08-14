package com.michael.aulamc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
 private static final long serialVersionUID = 1l;
 //excessoes para quando informar campos inexistentes no banco
 public ObjectNotFoundException(String msg) {
	 
	 super(msg);
 }
 public ObjectNotFoundException(String msg, Throwable cause){
	 super(msg, cause);
	 
 }
}
