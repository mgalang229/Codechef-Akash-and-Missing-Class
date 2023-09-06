import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int ans = n / 7;
			if (n % 7 == 6) {
				ans += 1;
			}
			System.out.println(ans);
		}
		fs.close();
	}
}
