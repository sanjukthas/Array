import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList; 

public class Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	      ArrayList<String> movies=new ArrayList<String>();
		   String movie;
		   
			while(1>0)
		    {
				
		        System.out.println("Enter list of movies");
		          movie= input.next(); 
		         
		        if (movie.equals("-1"))
		        	break;
		         movies.add(movie);		        
		    }
			/*for (int i=0; i<movies.size();i++)
			{
				System.out.println("List of movies are:"+movies.get(i));
			}*/
			for(String myMovie: movies) {
				System.out.println("List of movies are:"+myMovie);
			}
		
	}
}


