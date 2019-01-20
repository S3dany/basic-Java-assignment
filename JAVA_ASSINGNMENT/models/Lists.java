package models;


import java.util.ArrayList;
import java.util.Date;


public class Lists{
	private ArrayList<Kid> kids = new ArrayList<Kid>();
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<GoldenTicket> PrizeTickets = new ArrayList<GoldenTicket>();
	private ArrayList<GoldenTicket> RaffledTickets = new ArrayList<GoldenTicket>();
	public Lists(){
	// kids
	 kids.add(new Kid("John", "k1",new Date(1993,3,23),"Budapest" ));
	 kids.add(new Kid("Mark", "k2",new Date(1998,10,4),"Budapest" ));
	 kids.add(new Kid("Mike", "k3",new Date(1996,3,2),"Budapest" ));
	 kids.add(new Kid("Andrea", "k4",new Date(1994,5,6),"Budapest" ));
	 kids.add(new Kid("Louis", "k5",new Date(2000,8,20),"Budapest" ));
	// products
	 products.add(new Product("chocolate", 111 ,"p1" ));
	 products.add(new Product("chocolate", 111 ,"p2" ));
	 products.add(new Product("chocolate", 111 ,"p3" ));
	 products.add(new Product("cookies", 222 ,"p4" ));
	 products.add(new Product("cookies", 222 ,"p5" ));
	 products.add(new Product("cookies", 222 ,"p6" ));
	 products.add(new Product("iceream", 333 ,"p7" ));
	 products.add(new Product("iceream", 333 ,"p8" ));
	 products.add(new Product("iceream", 333 ,"p10" ));
	 products.add(new Product("iceream", 333 ,"p11" ));
	 products.add(new Product("biscuts", 444 ,"p12" ));
	 products.add(new Product("biscuts", 444 ,"p13" ));
	 products.add(new Product("biscuts", 444 ,"p14" ));
	 products.add(new Product("biscuts", 444 ,"p15" ));
	 
	
	//Prize Tickets
	PrizeTickets.add(new GoldenTicket("124", new Date()));
	PrizeTickets.add(new GoldenTicket("534", new Date()));
	PrizeTickets.add(new GoldenTicket("546", new Date()));
	PrizeTickets.add(new GoldenTicket("364", new Date()));
	PrizeTickets.add(new GoldenTicket("347", new Date()));
	PrizeTickets.add(new GoldenTicket("766", new Date()));
	PrizeTickets.add(new GoldenTicket("645", new Date()));
	PrizeTickets.add(new GoldenTicket("648", new Date()));
	PrizeTickets.add(new GoldenTicket("657", new Date()));
	PrizeTickets.add(new GoldenTicket("754", new Date()));
	// Raffled Tickets
	}
	
	
	
	public ArrayList<Kid> getKids(){
    return kids;
  }
  
  public ArrayList<Product> getProducts(){
    return products;
  }
  
  public ArrayList<GoldenTicket> getPrizeTickets(){
    return PrizeTickets;
  }
  public ArrayList<GoldenTicket> getRaffledTickets(){
    return RaffledTickets;
  }
  
  
  public void raffel(int n){
		for (int i=0; i<n; i++){
			boolean not = true;
			while(not){
			int b = (int )(Math.random() * (this.getPrizeTickets().size()));
			if(! this.getRaffledTickets().contains(this.getPrizeTickets().get(b))){
			this.getRaffledTickets().add(this.getPrizeTickets().get(b));
			not = false;
			}
			}
		}
		
			for (int i=0; i< this.getRaffledTickets().size(); i++){
			
			boolean not = true;
			while(not){
			int b = (int )(Math.random() * (this.getProducts().size()));
			if( this.getProducts().get(b).getPrizeTicket() == null){
			this.getProducts().get(b).setPrizeTicket(this.getRaffledTickets().get(i));
			not = false;
			}
			}
			}
		}
		
	public void RegisterSale(String kid, long prod){
		Product sold = new Product();
		
		
		for (int i=0; i<this.getProducts().size();i++){
			if(this.getProducts().get(i).getBarcode() == prod){
				sold = this.getProducts().get(i);
				this.getProducts().remove(i);
			}
		}
		for (int i=0; i<this.getKids().size();i++){
			if(this.getKids().get(i).getCode().equals(kid)){
				 this.getKids().get(i).getProductList().add(sold);
				
			}
		}
		
	}
}  