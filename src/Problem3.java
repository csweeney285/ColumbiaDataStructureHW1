
public class Problem3 {
	
	public static int Function1(int n){
		int sum = 0;
		for ( int i = 0; i < 23; i ++)
		    for ( int j = 0; j < n ; j ++)
		        sum = sum + 1;
		return sum;
	}
	public static int Function2(int n){
		int sum = 0;
		for ( int i = 0; i < n ; i ++)
		    for ( int k = i ; k < n ; k ++)
		        sum = sum + 1;
		return sum;
	}
	public static int foo(int n, int k) {
		if(n<=k)
			return 1;
		else
			return foo(n/k,k) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  long starTime = System.nanoTime();
		  int sum = foo(10000,2);
		  long endTime = System.nanoTime();
		  long difference = endTime - starTime;
		  System.out.print(difference+" nanoseconds");		  
	}

}
