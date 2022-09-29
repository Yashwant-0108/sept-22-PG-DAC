class p13{
public static void main (String args[]){
		char ch ='A';
       int uni = (int)ch;
			
  for(int i=1;i<=5;i++)
  {    
	   
	  for(int j=4;j>=i;j--)
		  System.out.print(" ");
		  
	  for(int j=1;j<=i;j++){
		
			 
		  System.out.print(ch+" ");
	      
	     
	  }
	  uni++;
	  ch=(char)uni;
 System.out.println();
    
	}
 
 





}
}