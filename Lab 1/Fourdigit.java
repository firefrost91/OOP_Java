public class FourDigit
{
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]); 
		
		int A[]=new int[4] ; 
		A[0]=i/1000 ; 
// 		System.out.println(A[0]);
		A[1]=(i%1000)/100 ; 
// 		System.out.println(A[1]);
			A[2]=(i%100)/10 ; 
				// System.out.println(A[2]);
				A[3]=(i%10); 
				// 	System.out.println(A[3]);
					int j , k , l ; 
					for(j=0 ; j < 4 ; j++){
					    for(k=0 ; k < 4 ; k ++){
					        for(l=0 ; l<4 ; l ++){
					            if(j!=k && k!=l && l!=j){
					                System.out.println(A[j]+""+ A[k] +""+ A[l]);
					            }
					        }
					    }
					}
	}
}
