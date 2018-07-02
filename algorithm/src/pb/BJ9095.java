package pb;

import java.util.Scanner;

public class BJ9095 {

	public static void main(String[] args) {
		int[] arr = new int[11];
		int n, value;
		Scanner scanner = new Scanner(System.in);

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			value = scanner.nextInt();
			for (int j = 4; j <= value; j++) {
				if (arr[j] == 0)
					arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
			}
			System.out.println(arr[value]);
		}
		scanner.close();
	}
}
