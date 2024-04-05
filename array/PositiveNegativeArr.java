package array;

public class PositiveNegativeArr {

	public static void main(String[] args) {
		int a[] = {5,3,0,4,-2,0,-1,0,8};
		int p=0,n=0,zero=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
				p++;
			else if(a[i]<0)
				n++;
			else zero++;
		}
System.out.println("positive number"+p);
System.out.println("negative number"+n);

	}
}
