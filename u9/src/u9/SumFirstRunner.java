package u9;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Arrays;

public class SumFirstRunner {
	public static void main(String args[]) {
		ArrayList<Integer> obj = new ArrayList<Integer>(Arrays.asList(-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5));
		System.out.println(ListSumFirst.go(obj));

		ArrayList<Integer> test1 = new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99));
		System.out.println(ListSumFirst.go(test1));

		ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, -11818, 40, 30, 20, 10));
		System.out.println(ListSumFirst.go(test2));

		ArrayList<Integer> test3 = new ArrayList<Integer>(Arrays.asList(32767));
		System.out.println(ListSumFirst.go(test3));

		ArrayList<Integer> test4 = new ArrayList<Integer>(Arrays.asList(255, 255));
		System.out.println(ListSumFirst.go(test4));

		ArrayList<Integer> test5 = new ArrayList<Integer>(Arrays.asList(9, 10, -88, 100, -555, 2));
		System.out.println(ListSumFirst.go(test5));

		ArrayList<Integer> test6 = new ArrayList<Integer>(Arrays.asList(10, 10, 10, 11, 456));
		System.out.println(ListSumFirst.go(test6));

		ArrayList<Integer> test7 = new ArrayList<Integer>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 0, -2, 6));
		System.out.println(ListSumFirst.go(test7));

		ArrayList<Integer> test8 = new ArrayList<Integer>(Arrays.asList(12, 15, 18, 21, 23, 1000));
		System.out.println(ListSumFirst.go(test8));

		ArrayList<Integer> test9 = new ArrayList<Integer>(
				Arrays.asList(250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455));
		System.out.println(ListSumFirst.go(test9));

		ArrayList<Integer> test10 = new ArrayList<Integer>(Arrays.asList(9, 10, -8, 10000, -5000, -3000));
		System.out.println(ListSumFirst.go(test10));
	}
}