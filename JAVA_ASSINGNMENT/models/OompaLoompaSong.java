package models;
import java.util.Random;
import java.util.ArrayList;
import java.io.*;

public class OompaLoompaSong extends Being {

//Constructors:
    private int height;
	private String FavoriteFood;
	private ArrayList<String> song;
	
	public OompaLoompaSong(String code, String name, int height, String FavoriteFood){
	super(code, name);
	
	 this.height = height;
	 this.FavoriteFood = FavoriteFood; 
	}
	
// define how many lines  the song shall have

public OompaLoompaSong(int height){
	super();
	 this.height = height;
	 String fileName = "OompaLoompaSong.txt";
     String line = null;
	 ArrayList<String> fullsong;
	 fullsong = new ArrayList<String>();
	 song = new ArrayList<String>();

        try {
            
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                fullsong.add(line);
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "can't open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "can't read file '" 
                + fileName + "'");                  
            
        }
		
		for(int i =0; i< height; i++){
			song.add(fullsong.get((int )(Math.random() * fullsong.size())));
		
		}
		
    }
	
	

// Return a String with the song
 public void sing(){
		for (int i=0; i<song.size();i++){
			System.out.println(song.get(i));
		}
}
}