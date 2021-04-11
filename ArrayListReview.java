import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReview {

	public static void main(String[] args) {
		int[] array = new int[4];
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
		
		ArrayList<Integer> list = new ArrayList<>(4);
		for(int i = 0; i < array.length; i++) {
			list.add(i);
		}
		System.out.println(list);
		System.out.println(list.size());
		
		array = copyAndAdd(array, 4);
		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
		
		list.add(4);
		System.out.println(list);
		System.out.println(list.size());
		
		array = remove(array, 2);
		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
		
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());
	}
	
	public static int[] copyAndAdd(int[] array, int element) {
		int[] result = new int[array.length + 1];
		for(int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}
		result[result.length - 1] = element;
		return result;
	}

	public static int[] remove(int[] array, int index) {
		if(index < 0 || index >= array.length) {
			return array;
		}
		
		int[] result = new int[array.length - 1];
		for(int i = 0; i < index; i++) {
			result[i] = array[i];
		}
		for(int i = index + 1; i < array.length; i++) {
			result[i - 1] = array[i];
		}
		return result;
	}
}
