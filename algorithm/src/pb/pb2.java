package pb;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class pb2 {
	static int Answer;

	public static void main(String args[]) throws Exception {

		// Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("/home/maro/eclipse-workspace/pt2/src/pt2/input2.txt"));

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int numCount = sc.nextInt();
			int[] arr = new int[numCount];

			for (int i = 0; i < numCount; i++) {
				int number = sc.nextInt();
				//arr.add(number);
				arr[i] = number;
			}
			Arrays.sort(arr);
			
			int people = 0;
			int max = 0;
			for (int i = 0; i < numCount; i++) {
				int tmp = arr[i] + numCount - i;
				if (tmp > max)
					max = tmp;
			}

			for (int i = 0; i < numCount; i++) {
				if (arr[i] + numCount >= max)
					people++;
			}

			System.out.println("Case #" + test_case + 1);
			System.out.println(people);
		}
	}
}