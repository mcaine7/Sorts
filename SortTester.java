package sortpack;

import java.util.concurrent.ThreadLocalRandom;

public class SortTester {

	public static void main(String[] args) {
		int min = 0;
		int max = 100;

		int Arr[] = new int[25];

		for (int i = 0; i < 25; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			Arr[i] = randomNum;
		}
		for (int i = 0; i < 25; i++) {
			System.out.println(Arr[i]);
		}
		System.out.println("_______________");
		System.out.println("Sorted List");
		System.out.println("_______________");

		AllSorts.mergeSort(Arr, 1, 54);
		for (int i = 0; i < 25; i++) {
			System.out.println(Arr[i]);
		}

	}
}
