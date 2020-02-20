public class Equalsums
{
	public static void main(String[] args) {
	int p ; 
	int i = 0 , j = 0 , flag = 0 ;
	int A[] = new int[args.length];
	int sum = Integer.parseInt(args[0]); 
	for(i=1 ; i < args.length ; i ++){
	    A[i]=Integer.parseInt(args[i]); 
	}
	for(i=1 ; i < args.length ; i ++){
	   for(j=i ; j <args.length ; j++){
	       if(sum==A[i]+A[j]){
	           System.out.println(A[i]+" "+A[j]);
	           flag++ ;  }
	   }}
	    if(flag==0){
	        System.out.println("Not Found ");
	    }
	}
}
