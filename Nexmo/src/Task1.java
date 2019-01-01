import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
	public static int solution(int N) {
		if (N < 0)
			throw new IllegalArgumentException("Negative number");
		
		int a;
		
		List<Integer> myList = new ArrayList<Integer>();
		while (N > 0) {
			a = N % 10;
			N = N / 10;
			myList.add(a);
		}
		Collections.sort(myList);
		Collections.reverse(myList);
		
		int number = 0;
		for (int i : myList) {
			number *= 10;
			number += i;
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(solution(2443));
		//System.out.println(solution(-2443));
	}
}
