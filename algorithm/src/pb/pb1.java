package pb;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("/home/maro/eclipse-workspace/pt1/src/pt1/input.txt"));

		int T = sc.nextInt();
		
		for(int test_case = 0; test_case < T; test_case++) {
			int numCount = sc.nextInt();
			Map<Integer, Integer> countMap = new HashMap<>();
			
			for(int i = 0; i < numCount; i++) {
				int number = sc.nextInt();
				Integer count = countMap.get(number);
			    countMap.put(number, count == null ? 1 : count + 1);
			}
			
			ArrayList<Integer> resultList = new ArrayList<Integer>();
			countMap.forEach((k, v) -> {
				if(v%2 == 1) {
					resultList.add(k);
				}
			});
			
			Answer = 0;
			resultList.forEach((value) -> {
				Answer=Answer^value;
			});
		
			 //Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}