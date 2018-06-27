package pb;

import java.io.FileInputStream;
import java.util.*;

class pb4 {
	static int Answer;

	public static void main(String args[]) throws Exception {

		// Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("/home/maro/다운로드/input4.txt"));
		int[] score = {6,13,4,18,1,20,5,12,9,14,11,8,16,7,19,3,17,2,15,10};
		int T = sc.nextInt();

		for (int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
	
			
			int numCount = sc.nextInt();
			
			for (int i=0; i<numCount; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				double m = 0;
				int total = 0;
				
				double r = Math.sqrt(x*x + y*y);
				
				if(r < a) {
					Answer += 50;
					continue;
				}
				else if(r > b && r < c) {
					m = 3;
				}
				else if(r > d && r < e) {
					m = 2;
				}
				else if(r > e) {
					continue;
				}
				else  {
					m = 1;
				}
				
				double angle = Math.atan(y/(double)x) * (180/Math.PI);
				if(x < 0.0) {
			        angle += 180.0;
			    }
				angle += 9;
				angle = (angle + 360) % 360;
				
				int idx = (int)(angle/18);
				
				total += m*score[idx];
				System.out.println(m + " / " + angle + " / " + r + " / " + total);
				Answer += total;
			}
			

			// Print the answer to standard output(screen).
			 System.out.println("Case #"+(test_case+1));
			 System.out.println(Answer);
		}
	}
}