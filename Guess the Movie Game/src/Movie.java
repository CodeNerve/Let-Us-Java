import java.util.*;
import java.io.*;
public class Movie {
	public String name;
	public int length;
	
	public Movie(){
		File movieList = new File("movies.txt");
		try {
			Scanner s = new Scanner(movieList);
			int totalMovies = 0;
			int rnd = (int)(Math.random()*26);
			for (int i = 0; i < 26; i++) {
		        String line = s.nextLine();
		        if (i == rnd) {
		            name = line;
		            length = line.length();
		            break;
		        }
			}
			s.close();
		}
		catch( Exception e) {
			
		}
		
	}
	
}

