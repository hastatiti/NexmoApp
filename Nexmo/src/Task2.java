import java.util.ArrayList;
import java.util.List;

public class Task2 {
	
	public  int solution(int N) {
		int a;

		List<Integer> myList = new ArrayList<Integer>();
		while (N > 0) {
			a = N % 10;
			N = N / 10;
			myList.add(a);
		}

		int[] myArray = new int[myList.size()];
		
		for (int i = 0; i < myList.size(); i++) {
			myArray[i] = myList.get(i);
		}

		return heapPermutation(myArray, myArray.length, myArray.length);
	}

	public  int heapPermutation(int a[], int size, int n) {
		 int counter = 0;
		 if (size == 1) return n;
	
		for (int i = 0; i < size; i++) {
			heapPermutation(a, size - 1, n);
			counter++;
			
			if (size % 2 == 1) {
				int temp = a[0];
				a[0] = a[size - 1];
				a[size - 1] = temp;
			} else {
				int temp = a[i];
				a[i] = a[size - 1];
				a[size - 1] = temp;
			}
		}
		
		return counter;
	}

	public static void main(String args[]) {
		Task2 t = new Task2();
		System.out.println(t.solution(1234));
	}
}
