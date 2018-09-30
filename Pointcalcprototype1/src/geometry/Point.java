package geometry;
/**Point Class,which holds all the operations related to a Point object**/
public class Point
{
	protected double x;
	protected double y;
	final public static double inf=Double.MAX_VALUE;
	private static double number=0;
	/**Default Constructor**/
	public Point()
	{
		this.x=0;
		this.y=0;
	}
	/**Method which performs subtraction of two points**/
	public Point sub(Point q)
	{
		return new Point(this.x-q.x,this.y-q.y);
	}
	/**Constructor**/
	public Point(double x,double y) 
	{
		this.x=x;
		this.y=y;
		number++;
	}
	/**Converting Point object to a string**/
	public String toString()
	{
		return "("+this.x+","+this.y+")";
	}
	/**Method for setting both x-coordinate and y-coordinate of a point**/
	public void setXY(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	/**Method to set x-coordinate of a point**/
	public void setX(double x) 
	{
		this.x=x;
	}
	/**Method to set y-coordinate of a point**/
	public void setY(double y)
	{
		this.y=y;
	}
	/**Method to obtain the x-coordinate of a point**/
	public double getX()
	{
		return this.x;
	}
	/**Method to obtain the y-coordinate of a point**/
	public double getY()
	{
		return this.y;
	}
	public void prdouble()
	{
		System.out.println("Value of x "+this.getX()+" Value of y "+this.getY());
	}
	/**Method that checks whether the point is origin**/
	public boolean isorgin()
	{
		if(this.x==0 && this.y==0)
			return true;
		else
			return false;
			
	}
	/**Method that implements scalar multiplication of a point**/
	public void mutableScalarMuliply(double c)
	{
		this.x=x*c;
		this.y=y*c;
	}
	/**Method that implements scalar multiplication of a point but immutable**/
	public Point immutableScalarMultiply(double c)
	{
		return new Point(this.x*c,this.y*c);
	}
	/**Method that calculates the sum of two points**/
	public Point sum(Point q)
	{
		Point p=new Point(this.x+q.x,this.y+q.y);
		return p;
	}
	/**Method to check whether two points are equal**/
	public boolean equals(Point q)
	{
		if(this.x==q.getX()&&this.y==q.getY())
			return true;
		else
			return false;
	}
	/**Method to obtain the equation of the line formed by two points**/
	public String equation(Point q)
	{
		double m=this.slope(q);
		if(absolute(m)==0)
			m=0;
		double c=this.y-m*this.x;
		return "y = "+m+"*"+"x"+" + "+c;
	}
	/**Method that calculates the slope between two points**/
	public double slope(Point q)
	{
		if(q.x==this.x)
		{
			if(q.y>this.y)
			return Double.MAX_VALUE;
			else
			return -1*Double.MAX_VALUE;
		}
		else
		return (q.y-this.y)/(q.x-this.x);
	}
	/**Method that gives out which quadrant or axis the point belongs to**/
	public int quadrant()
	{
		if(this.x==0 && this.y==0)
			return 0;
		else if(this.x==0&&this.y!=0)
			return -1;
		else if(this.y==0&&this.x!=0)
			return -2;
		else if(this.x>0 && this.y>0)
			return 1;
		else if(this.x<0 && this.y>0)
			return 2;
		else if(this.x<0&&this.y<0)
			return 3;
		else
			return 4;
	}
	/**Method that gives projection of the points on the x-axis**/
	public Point projectionX()
	{
		Point p=new Point(this.x,0);
		return p;
	}
	/**Method that gives projection of the points on the y-axis**/
	public Point projectionY()
	{
		Point p=new Point(0,this.y);
		return p;
	}
	public static void showc()
	{
		System.out.println("Count:"+number);
	}
	/**Method that returns the absolute value of a value**/
	public double absolute(double y)
	{
		if(y<0)
			return y*-1;
		else
			return y;
	}
	/**Method that calculates the euclidean distance between two points**/
	public double euclidDistance(Point q)
	{
		return Math.sqrt(Math.pow(q.getX()-this.getX(), 2)+Math.pow(q.getY()-this.getY(),2));
	}
	/**Method that calculates the Manhatten distance between two points**/
	public double distance(Point p)
	{
		return absolute(p.x-this.x)+absolute(p.y-this.y);
	}
	
	
}


