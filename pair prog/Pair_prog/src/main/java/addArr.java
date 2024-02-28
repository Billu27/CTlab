
public class addArr {
	public int[] addAr(int[] x,int[] y) {
		int c [] = new int[5];
		int i;
		for(i=0; i<5; i++) {
			c[i]=x[i]*y[i];
		}
		return c;
	}
	
//	public static void main(String[] args) {
//		addArr m = new addArr();
//		int [] a = new int[] {1,6,3,4,5};
//		int [] b = new int[] {1,2,3,4,5};
//		int [] n = new int[5];
//		
//		n = m.add(a, b);
//		System.out.print("\narray n :\n");
//		for (int i=0;i<5;i++) {
//			System.out.print(" | "+n[i]);
//		}
//	}
}
