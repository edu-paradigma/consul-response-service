package es.paradigmadigital.consulresponse.controller;

public class ResponseDTO {
private String response;

public ResponseDTO(String response) {
	super();
	this.response = response;
}

public String getResponse() {
	return response;
}

public void setResponse(String response) {
	this.response = response;
} 
}
