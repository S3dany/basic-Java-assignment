package models;

import java.util.Date;
import java.util.ArrayList;

public class Kid extends Being{
	private Date birthday;
	private ArrayList<Product> productsList;
	private String PlaceOfBirth;
	
	public Kid(String name, String code, Date birthday, String PlaceOfBirth){
	super(name, code);
	
	 this.birthday = birthday;
	 this.productsList = new ArrayList<Product> ();
	 this.PlaceOfBirth = PlaceOfBirth; 
	}

	public ArrayList<Product> getProductList(){
		return this.productsList;
	}
}