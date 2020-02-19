public class Fibbinoacci
{
	public static void main(String[] args) {
	int i =Integer.parseInt(args[0]);  
	int k ; 
	 int A[]= new int[i]; 
	 A[0]=0 ; 
	 A[1]=1 ; 
	 for(k=2 ; k < i  ; k ++){
	     A[k]=A[k-1]+A[k-2]; 
	     }
	     for(k=0 ; k < i ; k++){
	 System.out.println(A[k]);
	     }
	}
}
