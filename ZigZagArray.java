import java.util.Scanner;
class ZigZagArray
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the array size");
		int n1=scr.nextInt();
		int[] a=new int[n1];
		System.out.println("enter the second array size");
		int n2=scr.nextInt();
		int[] b=new int[n2];
		int[] c=new int[n1+n2];
		System.out.println(c.length);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter elements in ist array");
			a[i]=scr.nextInt();
		}
			
		for(int i=0; i<b.length; i++) {
			System.out.println("enter elements in second array ");
			b[i]=scr.nextInt();
		}
			
		int m=0;
		for(int i=0, j=0; m<=c.length;) {
			if(i<a.length || j<b.length) {
			if(m%2==0) {
				c[m]=a[i];
				System.out.print(c[m] + " ");
				m++; i++;
				
			} else {
				c[m]=b[j];
				System.out.print(c[m] + " ");
				m++; j++;
				
			}
		}
			
		}
		System.out.println("final array\n");
		for(int i=0; i<c.length; i++) {
			
		}
		
}
}

