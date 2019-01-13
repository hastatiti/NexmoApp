import java.util.Arrays;
import java.util.List;

class PermutingArray {
	 int count;
	 int permutingArray(List<Integer> arrayList, int element) {
		 
		for (int i = element; i < arrayList.size(); i++) {
			java.util.Collections.swap(arrayList, i, element);
			permutingArray(arrayList, element + 1);
			java.util.Collections.swap(arrayList, element, i);
		
		}
		if (element == arrayList.size() - 1) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		PermutingArray p = new PermutingArray();
System.out.println(p.permutingArray(java.util.Arrays.asList(1, 2, 3), 0));
	}
}