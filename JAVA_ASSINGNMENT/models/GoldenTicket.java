package models;


import java.util.Date;

public class GoldenTicket{
	
private String code;
private Date raffled;

//Constructors:
public GoldenTicket(){
	this.code = "0000";
	this.raffled = new Date();
};
public GoldenTicket(String code, Date raffled){
	this.code = code;
	this.raffled = raffled;
}

// Getters and Setters
public void SetCode(String a){
	this.code = a;
};
public void SetRaffled(Date b){
	this.raffled = b;
};

public String GetCode(){
	return this.code;
}
public Date GetRaffled(){
	return this.raffled;
}
// If the current ticket has been already raffled
//boolean isRaffled(){
	// to be completed...
//}
}