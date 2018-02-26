import java.util.Scanner;
class TwoBiggest
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter array size");
		int n=scr.nextInt();
		int[] a=new int[n];
		for(int i=0; i<a.length; i++) {
			System.out.println("enter array elements");
		a[i]=scr.nextInt();
		}
		System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " " );
		}
		int max=a[0];
		int index=0;;	
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
				index=i;
			}
		}	
		System.out.println("maximum element " + max + " present at  " + (index+1));
		for(int i=index; i<a.length-1; i++) {
			a[index]=a[i+1];
		}
		System.out.println("array after deleting one element " );
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int index1=0;
		int max1=a[0];
		int j;	
		for(j=0; j<a.length; j++) {
			if(a[j]>max1) {
				max1=a[j];
				index1=j;
			}
		}	
		System.out.println("second maximum element " + max1 + " present at  " + (index1+1));
	
	}
}	