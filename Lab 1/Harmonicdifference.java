public class Main
{
	public static void main(String[] args) {
	int n = 5000 ; 
	double  k= 0 , k1=0  ;  
	double i ; 
	for(i=1 ; i <50001 ; i++){
	    k=k+(1/i);
	}
	System.out.println(k); 
		for(i=50000 ; i >0  ; i--){
	    k1=k1+(1/i);
	}
		System.out.println(k1); 
		System.out.println("Difference is : " + (k1-k));
}
}
