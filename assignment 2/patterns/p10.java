class p10{
public static void main (String args[]){
  
  for(int i=1;i<=5;i++)
  {  
	   
	  for(int j=4;j>=i;j--)
		  System.out.print(" ");
		  
	  for(int j=1;j<=i;j++){
		  char ch ='A';
       int uni = (int)ch;
			 int k = 4-(i-j);
			 uni=uni+k;
			 ch = (char)uni;
		  System.out.print(ch+" ");
	      
	     
	  }
 System.out.println();
    
	}
 
 





}
}