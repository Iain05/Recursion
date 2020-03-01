import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	public static int fibSequence(int z) {
		if (z < 2) {
			return z;
		} else {
			return fibSequence(z - 1) + fibSequence(z - 2);
		}
	}
	public static void main(String[] args) throws IOException {
    	System.out.println("Which index of FibSequence do you want to get?");
		int i = Integer.parseInt(cin.readLine());
		System.out.println("The number at index" + i + " of the FibSequence is " + fibSequence(i));
	}
}
