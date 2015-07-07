import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.sun.corba.se.spi.orbutil.fsm.Input;


public class App {

	public static void main(String[] args) {
		Test test = new Test();
		
		/*
		try {
			test.run();
		} catch (IOException e) {
			System.out.println("IOException thrown");
		} catch (ParseException e) {
			System.out.println("Couldn't parse whatever");
		}
		*/
		
		/*
		// the below is a try multicatch
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			test.run();
		} catch (Exception e) { // since Exception is a parent class, I can just use 'Exception e' so it would throw any error -- IOException or ParseException are children of Exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// because FileNotFoundException is a child class of IOException, I will need the separate catches
		try {
			test.input();
		} catch (FileNotFoundException e) {  // the child exception has to test first, if the parent is tested first then it would never reach the child exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
