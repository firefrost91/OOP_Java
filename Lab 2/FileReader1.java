import java.io.* ; 
public class FileReader1 {
    public static void main (String args[]) throws Exception{
        FileReader f1 = new FileReader("a.txt"); 
        BufferedReader br = new BufferedReader(f1); 
         int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          f1.close();    

    }
  
}    
