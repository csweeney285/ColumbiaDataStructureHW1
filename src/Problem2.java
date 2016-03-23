import java.util.Arrays;

public class Problem2 {
	public static int low = 0;
	public static int high = 0;
	public static <AnyType extends Comparable<AnyType>>
    	int binarySearch(AnyType[] a, AnyType x){
		if (high == 0){
			high = a.length;
		}
		if (low > high){
			return -1;
		}
		int mid = (low + high)/2;
	      if (a[mid] == x) 
	    	  return mid;
	      else if (a[mid].compareTo(x) < 0){
	    	  low = mid + 1;
	         return binarySearch(a, x);
	      }
	      else{ // last possibility: a[mid] > x
	    	  high = mid -1;
	         return binarySearch(a, x);
	      }
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(5,4);
		Rectangle rect2 = new Rectangle(1,4);
		Rectangle rect3 = new Rectangle(5,20);
		Rectangle rect4 = new Rectangle(11,6);
		Rectangle[] rectArray = new Rectangle[4];
		rectArray[0] = rect2;
		rectArray[1] = rect4;
		rectArray[2] = rect3;
		rectArray[3] = rect1;
		Arrays.sort(rectArray);
		int index = binarySearch(rectArray,rect4);
		System.out.print("The Rectangle being searched for is at Array index "+ index + " after being sorted");

	}

}
