import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SmallNumberNotInArray {
	public static int solution(int[] A) {
		int number = 1;
		for(int i = 0; i < A.length; i++) {
			if(A[i] == number) {
				number++;
			}else return number;
		}
		return number;
	}
	public static void main(String[] args) {
		int [] A = {1, 3, 6, 4, 1, 2}; 
		System.out.println(solution(A));
	}
}
