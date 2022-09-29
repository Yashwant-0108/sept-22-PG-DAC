class p9{
public static void main (String args[]){
  
  for(int i=1;i<=5;i++)
  {  
	   char ch ='A';
       int uni = (int)ch;
	  for(int j=4;j>=i;j--)
		  System.out.print(" ");
		  
	  for(int j=1;j<=i;j++){
		  
			
		  System.out.print(ch+" ");
	       uni++;
	       ch = (char)uni;
	  }
 System.out.println();
    
	}
 
 





}
}