import java.util.*;
class Main {
  	public static void main(String[] args) {
		//Scanner num = new Scanner(System.in);
  	}
	
	public static long factorial(int num) {
		if (num >= 1) {
			 return num * factorial(num - 1);
		} else {
			return 1;
		}
	}
}
