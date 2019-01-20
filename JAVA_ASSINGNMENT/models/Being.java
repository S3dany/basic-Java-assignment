package models;

public class Being{
	private String code;
	public	String name;
	
	public Being(){
	}
	public Being( String name, String code){
		this.name = name;
		this.code = code;
	}
	
	public void setName(String name){
    this.name = name;
	}
	public void setCode(String code){
    this.code = code;
	}
  
	public String getCode(){
	return code;
	}
  
	public String getName(){
    return name;
	}
}