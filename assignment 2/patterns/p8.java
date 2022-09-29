class p8{
public static void main (String args[]){
for( int i=1;i<=5;i++)
   { 
      for(int j=4;j>=i;j--)
 {
 System.out.print(" ");
 }
  
      for(int j=1;j<=i;j++)
 {
	 int k = 5-(i-j);
 System.out.print(k+" ");
 }


 System.out.println();
	}
 
 





}
}