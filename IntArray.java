
public class IntArray {
	private int[] a;
	private int length;
	
	public IntArray() {
		a = new int[8];
		length = 0;
	}
	
	public int get(int index) {
		if(index < 0 || index >= length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return a[index];
	}
	
	// O(1)
	public int size() {
		return length;
	}
	
	public void set(int index, int value) {
		if(index < 0 || index >= length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		a[index] = value;
	}
	
	public void add(int value) {
		if(length >= a.length) { // if a is full
			//int[] b = new int[a.length + 1]; // create room for one more (SLOW!)
			int[] b = new int[a.length * 2];
			// O(n)
			for(int i = 0; i < a.length; i++) {
				b[i] = a[i]; // copying from a to b
			}
			a = b; // a now refers to the new array
		}
		a[length] = value; // adding the new value
		length++; // updating the length
	}
}
