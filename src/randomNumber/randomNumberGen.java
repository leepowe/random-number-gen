package randomNumber;

import java.util.Random;

public class randomNumberGen {
	
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int a = randomNumber.nextInt(6) + 1;

		System.out.println(a);
	}

}
