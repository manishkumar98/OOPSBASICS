import java.util.Scanner;
class Example4 {
public static void main(String args[]){
int n;
double d;
String s1, s2;
Scanner in = new Scanner(System.in);

System.out.println("Enter your full name ");
s1 = in.next(); //read till first space
s2 = in.nextLine();
System.out.println("Your full name is " + s1+" "+s2);
in.close();
}
}