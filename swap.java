import java.io.*;
public class swap
{
public static void main(String args[])throws IOException
{
int a,b;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the values of a and b");
a = Integer.parseInt(br.readLine());
b= Integer.parseInt(br.readLine());
a =a +b;
b= a-b;
a=a-b;
System.out.println("after swaping a =" +a + "and b = "+b);
}
}

 