public class Main
{   
	public static void main(String[] args) {
		System.out.println("Hello World");
		Integer A[]= {2,3,1};
		int i ; 
		Bubblesort b1 = new Bubblesort(); 
		b1.Sort(A); 
		for(i=0 ; i < A.length ; i ++){
		    System.out.println(A[i]);}
		
	}
}

class Bubblesort{
     public <T extends Comparable<T>> void Sort(T A[] ){
        int i =0 , j = 0 ; 
        int n= A.length;
        for(i=0 ; i < n ; i ++ ){
            for(j=0 ; j < n-1-i ; j ++ ){
                if(A[j+1].compareTo(A[j]) < 0 ){
                    T var = A[j]; 
                    A[j]=A[j+1];
                    A[j+1]=var ; 
                    
                }
            }
        
    }
}}
