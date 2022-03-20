 
public class Point
{
int x,y;
public Point()
{
	System.out.println("Welcome to Constructor");
	x=100;
	y=200;
}
public Point(int x1, int y1)
{
	System.out.println("Welcome to Para Constructor");
	x=x1;
	y=y1;
}


public String toString()
{
	return "x="+x+"y="+y;
}
}
