import java.io.*; 
class BufferedReader{
public static void main(String args[])throws IOException{
InputStreamReader isr = new InputStreamReader(System.in); 
BufferedReader b1 = new BufferedReader(isr); 
int i ,sum= 0  ; 
System.out.println("Enter ten numbers");
String A[]= new String[10];
int A1[]= new int[10]; 
for( i =0 ; i < 10 ;i ++){
    A[i]=b1.readLine();
    A1[i]=Integer.parseInt(A[i]); 
    }  
    for( i =0 ; i < 10 ;i ++){
    sum=sum+A1[i];  
    }
    System.out.println("Sum is : " + sum);

} // End of main
}// End of class Example1
