import java.util.Scanner;
class Example4 {
public static void main(String args[]){
int n;
double d;
String s1, s2;
Scanner in = new Scanner(System.in);
System.out.println("Enter an integer: ");
n = in.nextInt(); //reads an int from keyboard
System.out.println("You entered: " + n);
System.out.println("Enter a double: ");
d = in.nextDouble(); //reads a double
System.out.println("You entered: " + d);
System.out.println("Enter your full name ");
s1 = in.next(); //read till first space
System.out.println("Your first name is " + s1);
in.nextLine() //consume the remaining newline
System.out.println("Enter your full name");
s2 = in.nextLine();
System.out.println("Your full name is " + s2);
in.close();
}
}