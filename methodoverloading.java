import java.io.*;
class methodoverloading
{
void area(int r)
{
System.out.println("the area of the circle is"+(3.14*r*r));
}
void area(int l , int w)
{
System.out.println("the area is "+(l*w));
}
public static void main(String args[])throws IOException
{
int r,l,w;
methodoverloading ob = new methodoverloading();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the radius");
 r = Integer.parseInt(br.readLine());
 System.out.println("enter the length and breadth");
 l= Integer.parseInt(br.readLine());
 w = Integer.parseInt(br.readLine());
 ob.area(r);
 ob.area( l,w);
 
}
}