package pb;

import java.io.FileInputStream;
import java.util.*;

class pb3 {
	static int Answer;

	public static void main(String args[]) throws Exception {

		// Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("/home/maro/다운로드/input3.txt"));

		int T = sc.nextInt();

		for (int test_case = 0; test_case < T; test_case++) {
			int numCount = sc.nextInt();
			int select = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();

			for (int i = 0; i < numCount; i++) {
				int number = sc.nextInt();
				list.add(number);
			}
			Collections.sort(list, new AscendingInteger());
			Answer = 0;
			
			for(int i=0; i<select; i++) {
				Answer += list.get(i);
			}

			// Print the answer to standard output(screen).
			 System.out.println("Case #"+(test_case+1));
			 System.out.println(Answer);
		}
	}
}

class AscendingInteger implements Comparator<Integer> {
	@Override
	public int compare(Integer a, Integer b) {
		return b.compareTo(a);
	}
}