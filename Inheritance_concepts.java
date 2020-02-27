package inheritance;

public class practice {
int i=0  ; 
	practice(){
	
	i= i +5 ; }
	public static void main(String[] args){
		p1 p = new p1();
		System.out.print(p.i);
		p.print();
		practice p3 = new p1(); 
		System.out.print(p3.i);
		practice p4 = new practice(); 
		System.out.print(p4.i);
		
	}
}

class p1 extends practice{
//	int i=5; 
	p1(){ 
	super(); 
		i++ ; 
	}
	void print(){
		System.out.print(super.i);
}
}
