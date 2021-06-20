package randomNumber;

//import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.Random;

public class randomNumberIntoAnArray {

	public static void randomStatValue(){
		HashMap <String, Integer> statValueList = new HashMap <String, Integer>();
//	ArrayList statValueList = new ArrayList();
	Random statArrayInt = new Random();
	
	for(int i = 0; i < 5; i++) {
		int a = statArrayInt.nextInt(10) + 25;
		statValueList.put("a", a);
		statValueList.values();
		System.out.println(statValueList.values());
		}
//	System.out.println("not working");
		
	}
	

}
