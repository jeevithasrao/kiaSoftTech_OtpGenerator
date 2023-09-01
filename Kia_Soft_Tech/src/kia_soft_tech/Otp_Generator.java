package kia_soft_tech;
import java.util.Random;
public class Otp_Generator {
	public static void main(String[] args) {
		int length = 6;
		System.out.println("Your otp is: ");
		System.out.println(getOtp(length));
	}
	static char[] getOtp(int length) {
		char otp[] = new char[length];
		String numbers = "021115";
		Random random_method = new Random();
		for(int i=0; i<length; i++)
		{
			otp[i] = numbers.charAt(random_method.nextInt(length));
		}
		return otp;
	}
}