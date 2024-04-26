class first 
{
public static void main(String arg [])
{
System.out.println("This is our first code...");
System.out.println(arg[0]);
System.out.println(arg[0] + "\n" + arg[1]);
System.out.println(Integer.parseInt(arg[0]) + Integer.parseInt(arg[1]));
int num=Integer.parseInt(arg[0]);
if (num%2 == 0)
 System.out.println("Even:" +num);
else 
 System.out.println("Odd:" +num);
}
}