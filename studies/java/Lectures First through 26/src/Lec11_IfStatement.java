
public class Lec11_IfStatement {
	public static void main(String[] args) {
		//boolean cond = 1 < 6;	//true
		//boolean cond = 3 > 6;  //false
		//boolean cond = 5 != 2;   //true
		//boolean cond = 5 != 5;   //false
		//boolean cond = 4 == 4;   //true
		//boolean cond = 4 == 3;   //false
		
		int myInt = 20;
		
		if(myInt < 10) {
			System.out.println("Yes, this is true");
		}
		else if(myInt == 20) {
			System.out.println("Yes, this is true: " + myInt + " = 20");
		}
		else {
			System.out.println("No, this is false");
		}
		
		
//		if(4 == 4) {
//			System.out.println("Yes, this is true");
//		}
		
		//System.out.println(cond);
	}
}
