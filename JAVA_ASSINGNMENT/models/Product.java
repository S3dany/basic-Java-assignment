package models;

public class Product{
	private String description;
	private long barcode;
	private String serialNumber;
	private GoldenTicket prizeTicket;
	
	public Product(){
	}
	
	public Product(String description, long barcode,String serialNumber){
	 this.description = description;
	 this.barcode = barcode;
	 this.serialNumber = serialNumber;
	 this.prizeTicket = null;
	}
	
	public String getSerialNumber(){
    return serialNumber;
	}
	
	public long getBarcode(){
    return barcode;
	}
	
	public String getDescription(){
    return description;
	}
	
	public GoldenTicket getPrizeTicket(){
    return prizeTicket;
	}
	
	public void setPrizeTicket(GoldenTicket PrizeTicket){
		this.prizeTicket = PrizeTicket;
	}
	
}