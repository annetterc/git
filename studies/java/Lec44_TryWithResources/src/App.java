
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		
		System.out.println("Closing!");
		throw new Exception("Ohh no!");
		
	}
	
}

public class App {
	
	public static void main(String[] args) {
		
//		Temp temp = new Temp();
//		
//		try {
//			temp.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// Instead of doing the above, we can do the below, because we are Implementing AutoClosable
		try ( Temp temp = new Temp() ) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
