package Test;

public class Demo {
	
public static void main(String[] args) {
		
	int[] a= {1,2,3,4};
	int big = a[0];
	for(int k:a)
	{
	if(big<k)
	{
		big=k;
	}
			
	}
System.out.println("Biggest number in array is " +big);

	}

}
