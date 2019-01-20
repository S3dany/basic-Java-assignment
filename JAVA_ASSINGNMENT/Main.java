
import models.*;
import java.util.Random;
import java.util.Scanner; 
import java.util.ArrayList;

public class Main{
	private ArrayList<Kid> winners; 
	public static void main (String args[]){
		Lists x = new Lists();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the song hight [[[MAXIMUM 23 LINES]]]");
		int h = sc.nextInt();
		OompaLoompaSong y = new OompaLoompaSong(h);
		y.sing();
		
		System.out.println("How many Golden Tickets? [[[MAXIMUMs 10]]]");
		int n = sc.nextInt();
		
		x.raffel(n);
		
		System.out.println("Kids: ");
		
		for (int i =0; i <x.getKids().size(); i++){
		System.out.println("Kid " + i);
		System.out.println("name: " + x.getKids().get(i).getName());
		System.out.println("CODE: " + x.getKids().get(i).getCode());
		System.out.println("_______");
		}
		System.out.println("___________________________________");
		
		
		for (int i =0; i < x.getProducts().size();i++){
			
				System.out.println("Type: " + x.getProducts().get(i).getDescription());
				System.out.println("BARCODE: " + x.getProducts().get(i).getBarcode());
				System.out.println("Serial Number: " + x.getProducts().get(i).getSerialNumber());
				System.out.println("_____");
		}
		
		System.out.println("Enter How many pruchases?");
		int m = sc.nextInt();
		for(int i =0; i< m; i++){
			
System.out.print("[[[CHECK THE KIDS CODES ABOVE, A KID CAN BUY MORE THAN ONCE]]]" +'\n' +"Enter kid code: ");
			String k = sc.next();
			
			System.out.print("[[[CHECK THE PRODUCTS BARCODES ABOVE, A PRODUCT CAN BE SOLD MORE THAN ONCE IF IT'S REPEATED WITH DIFFRENT SERIAL NUMBERS]]]" + '\n' + "Enter product Barcode: ");
			long p = sc.nextLong();
		
			x.RegisterSale(k,p);
	
		}
		
		ArrayList<Kid> winners = new ArrayList<Kid> ();
		for(int i =0; i< x.getKids().size(); i++){
			for(int j =0; j< x.getKids().get(i).getProductList().size(); j++)
				if(x.getKids().get(i).getProductList().get(j).getPrizeTicket() != null && ! winners.contains( x.getKids().get(i))){
					winners.add( x.getKids().get(i));
				}
		}
		System.out.print("The number of Winners is: ");
		System.out.println(winners.size());
		
		for(int i = 0; i<winners.size(); i++){
			System.out.println("Name: " + winners.get(i).getName());
			System.out.println("Code: " + winners.get(i).getCode());
			for(int j =0; j< winners.get(i).getProductList().size(); j++)
				if(winners.get(i).getProductList().get(j).getPrizeTicket() != null){
					System.out.println("The Golden Ticket code: " + winners.get(i).getProductList().get(j).getPrizeTicket().GetCode());
					

				}
				System.out.println("_____________________");
			
		}
		
	}
	
	  
	
	
	
}