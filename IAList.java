// Michael Dobrzanski

public class IAList { //add at least one more variable (start + length for addBefore?)
	private int[] a; // Underlying array
	private int length; // Number of added elements in a
	private int start;

	public IAList() {
		length = 0; // Start with no added elements in a
		a = new int[4]; // A little room to grow
		start = 0;
	}

	public int get(int i) { // Retrieve an added element, O(1); the new data field(s) may change the way "add" works
		if (i < 0 || i >= length) {
			throw new IndexOutOfBoundsException(i+"");
		}
		//System.out.println("i = " + i + " start: " + start + " length: " + length + " a.length: " + a.length);
		return a[start + i]; // Retrieve the element at position i
	}

	public int size() { // Number of added elements, O(1); the new data field(s) may change the way "add" works
		return length; // The number of added elements
	}

	public void set(int i, int x) { // Modify an existing element, O(1); the new data field(s) may change the way "add" works
		if (i < 0 || i >= length) {
			throw new IndexOutOfBoundsException(i+"");
		}
		a[start + i] = x; // Change the existing element at position i to x
	}

	public void add(int x) { // Add an element to the end, O(n) for n; the new data field(s) may change the way "add" works
		if (start + length == a.length) {
			//System.out.println("duplicating array");
			int[] b = new int[a.length * 2]; // Create new array of double the length
			for (int i = 0; i < a.length; i++) {
				b[i] = a[i]; // Copy the elements of a to the corresponding indexes of b
			}
			a = b; // Reassign a reference to b
		}
		//System.out.println("Adding " + x + "to position length " + length);
		a[start + length] = x; // Place x at the end of the IAList
		length++; // Increase length by 1
	}

	public void addBefore(int x) {
		if (start == 0) {
			int[] b = new int[a.length * 2]; // Create new array of double the length
			for (int i = a.length; i < b.length; i++) {
				b[i] = a[i - a.length]; // Copy the elements of a to the corresponding indexes of b
			}
			start = a.length - 1;
			a = b; // Reassign a reference to b
			a[start] = x; // Place x at the end of the IAList
			length++; // Increase length by 1
//			System.out.println(a.length);
//			System.out.println(length);
//			System.out.println(start);
		}
		else {
		start--;
		a[start] = x; // Place x at the end of the IAList
		length++; // Increase length by 1
		}
	}
	
//	public void addBefore(int x) {
//		if (length >= a.length) {
//			int[] b = new int[a.length * 2];
//			b[0] = x;
//			for (int i = 1; i < a.length; i++) {
//				b[i] = a[i];
//			}
//			a = b;
//		} else {
//			int[] b = new int[a.length];
//			b[0] = x;
//			for (int i = 1; i < a.length; i++) {
//				b[i] = a[i];
//			}
//			a = b;
//		}
//		length++;
//		start--;
//		
//	}

	
//	public void addBefore(int x) {
//		System.out.println(a.length);
//		System.out.println(length);
//		System.out.println(start);
//		
//		if (start <= 0 && a[0] != 0) {
//			int[] b = new int[a.length * 2];  // Create new array of double the length
//			for (int i = a.length; i < b.length; i++) {
//				b[i] = a[i - a.length]; // Copy the elements of a to the corresponding indexes of b
//			}
//			start = a.length - 1;
//			a = b; // Reassign a reference to b
//		}
//		
//		System.out.println(a.length);
//		System.out.println(length);
//		System.out.println(start);
//		
//		a[start] = x;  // Place x at the end of the IAList
//		if (start != 0) {
//			start = start - 1;// Increase length by 1
//		}
//		length += 1;
//	}
	
}

