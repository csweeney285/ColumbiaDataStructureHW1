
public class Rectangle  implements Comparable<Rectangle>  {
	 
	 private double width;
	 private double length;
	 
	 public Rectangle(double width, double length) {
		 this.width = width;
		 this.length = length;
		 }
	 public double getLength() {
		 return length;
	    }
	 public double getWidth() {
		 return width;
	    }
	 
	 public double getPerimeter() {
		 return 2*width+2*length;
		 }

	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return Double.compare(this.getPerimeter(), o.getPerimeter());
	}

}
