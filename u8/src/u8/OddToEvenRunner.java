package u8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner {
	public static void main(String args[]) {

		int[] arr = { 7, 1, 5, 3, 11, 5, 6, 7, 8, 9, 10, 12345, 11 };
		System.out.println(RayOddToEven.go(arr) + "\n");

		int[] arr1 = { 11, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99, 7 };
		System.out.println(RayOddToEven.go(arr1) + "\n");

		int[] arr2 = { 10, 20, 30, 40, 5, 41, 31, 20, 11, 7 };
		System.out.println(RayOddToEven.go(arr2) + "\n");

		int[] arr3 = { 32767, 70, 4, 5, 6, 7 };
		System.out.println(RayOddToEven.go(arr3) + "\n");

		int[] arr4 = { 2, 7, 11, 21, 5, 7 };
		System.out.println(RayOddToEven.go(arr4) + "\n");

		int[] arr5 = { 7, 255, 11, 255, 100, 3, 2 };
		System.out.println(RayOddToEven.go(arr5) + "\n");

		int[] arr9 = { 9, 11, 11, 11, 7, 1000, 3 };
		System.out.println(RayOddToEven.go(arr9) + "\n");

		int[] arr6 = { 7, 7, 7, 11, 2, 7, 7, 11, 11, 2 };
		System.out.println(RayOddToEven.go(arr6) + "\n");

		int[] arr7 = { 2, 4, 6, 8, 8 };
		System.out.println(RayOddToEven.go(arr7) + "\n");
	}
}