package Method.java;

public class Recta  
	{
		 double length;
		 double width;
		
		public void set( double l, double w)
		{
			length = l ;
			width = w ;	
		}
		public double getArea()
		{
			double area = length * width ;
			return area;
		}
		public double getPerimeter()
		{
			double perimeter = 2*(length + width);
			return perimeter;
			
		}
	}


