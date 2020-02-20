import java.io.* ; 
public class Main {
    public static void main (String args[]) throws Exception{
        FileReader f1 = new FileReader("a.txt"); 
        BufferedReader br = new BufferedReader(f1); 
      
         int i;    
          while((i=br.read())!=-1){  
            long l = br.skip(1); 
          System.out.print((char)i);  
          
              
          }  
          br.close();    
          f1.close();    

    }
    // public static void main(String args[])throws Exception{    
    //       FileReader fr=new FileReader("a.txt");    
    //       BufferedReader br=new BufferedReader(fr);    
  
    //       int i;    
    //       while((i=br.read())!=-1){  
    //       System.out.print((char)i);  
    //       }  
    //       br.close();    
    //       fr.close();    
    // }   
}    
