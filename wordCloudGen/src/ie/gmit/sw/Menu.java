package ie.gmit.sw;

import java.util.*;

	public class Menu {
	Boolean keepGoing;
	public Scanner s;
	String option;
	
	
	
		public void show(){
		boolean keepGoing = true;
		
			while (keepGoing != false)
			{
				
				System.out.println("select your option:");
				option = s.next();
			handle(option);
			}
		//	keepGoing = false;
		
		}

		public void  printMenu() {
				
			System.out.println("**word web**");
			System.out.println("1 select file or URL");
			System.out.println("2 enter number of words to display");
			System.out.println("3 enter image name");
			System.out.println("4 Quit");
			
				
		}
		public void handle (String option){
			if(option.equals("4"))
			{
			keepGoing = false;
			}
			else if (option.equals("1"))
			{
				System.out.println("in 1");
			}
			else if (option.equals("2"))
			{
				System.out.println("in 2");
			}
			else if (option.equals("3"))
			{
				System.out.println("in 3");
			}
		}//handle
									
}//EOF