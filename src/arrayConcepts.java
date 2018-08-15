
public class arrayConcepts {

	void arrayConc() {
		int a[] = { 1, 2, 3, 4, 5 };
		int aa[] = new int[5];
		int bb = a.length;
		int v = a[4];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[2]);
		}

		char c[] = { 'a', 'b', 'c', 'd', 'e' };
		char cc[] = new char[8];

		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.print(c1 + " ");
		}
	}

	void twoDimentionalArray() {
		int twoG[][] = new int[2][3];
		int twoGImpl[][] = { { 1, 2,3 }, { 4, 5,6 } };

		for (int i = 0; i < twoGImpl.length; i++) {
			for (int j = 0; j < twoGImpl.length+1; j++) {
				System.out.print(twoGImpl[i][j]+" ");
			}
			System.out.println();
		}
	}

	@Override
	protected void finalize() throws Throwable{
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Inside Finally");
	}
	
	
	void last()
	{
		System.out.println("Last");
	}
	
	public static void main(String a[]) throws Throwable {
		arrayConcepts ad = new arrayConcepts();
		// ad.arrayConc();
		ad.twoDimentionalArray();
		ad.finalize();
		ad.last();

	}

}
