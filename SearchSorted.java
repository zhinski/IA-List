
public class SearchSorted {

	public static void main(String[] args) {
		int[] a = new int[1_000_000];
		for(int i = 1; i < 1_000_000; i++) {
			a[i] = a[i - 1] + (int)(Math.random() * 3);
		}
		
		// searching for the values between [0, 10,000) in a
		long start = System.currentTimeMillis();
		for(int x = 0; x < 100_000; x++) {
			for(int i = 0; i < a.length; i++) {
				if(a[i] == x) {
					System.out.println(i);
					break;
				}
				else if(a[i] > x) break; // x wasn't there
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
