package dpattern;
/*
 * This class is for Diamond pattern 
 */

public class Dpattern {
	
	public static void main(String[] args) {
		
	

	int a,b,c;
	
	for(a=1;a<=5;a++)  // this loop is for upper part of dimond
    {
 for(b=1;b<=5-a;b++)
     
             {
                    System.out.print(" " );
             }

           for(c=1;c<=a*2-1;c++)
     
             {
                    System.out.print("a");
             }
        System.out.println();
}    
	
	
	  
	for(a=5-1;a>0;a--)  // this loop is for lower part
    {
 for(b=1;b<=5-a;b++)
     
             {
                    System.out.print(" ");
             }
           for(c=1;c<=a*2-1;c++)
     
             {
                    System.out.print("a");
             }
       System.out.println();
    }          
    	
	}
}