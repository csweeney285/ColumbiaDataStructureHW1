
public class Problem1 {
	
	public static <AnyType extends Comparable<AnyType>>  AnyType findMax(AnyType[] arr) {
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++)
			if ( arr[i].compareTo(arr[maxIndex]) > 0 )
				maxIndex = i;
		return arr[maxIndex];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rectArray = new Rectangle[4];
		Rectangle rect1 = new Rectangle(4,8);
		Rectangle rect2 = new Rectangle(105,170);
		Rectangle rect3 = new Rectangle(3,6);
		Rectangle rect4 = new Rectangle(40,23);

		rectArray [0] = rect1;
		rectArray [1] = rect2;
		rectArray [2] = rect3;
		rectArray [3] = rect4;
		Double perimiterMax = findMax(rectArray).getPerimeter();
		System.out.print("The largest Rectangle perimeter in the array is "+ perimiterMax);
	

	}

}
