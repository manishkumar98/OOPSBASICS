class Rectangle {
int length, width;
Rectangle(int i) {
//fill your code
	length=i;
	width=i;
}
Rectangle(int i, int j) {
//fill your code
	length=i;
	width=j;

}
Rectangle(Rectangle obj) {
//fill your code
	obj.length=length;
	obj.width=width;
}
int calcArea() {
return length * width;
}
public static void main(String[] args) {
Rectangle obj = new Rectangle(5,6);
// print obj’s area
System.out.println(obj.calcArea());
Rectangle obj2 = new Rectangle(obj);
System.out.println(obj2.calcArea());
// print obj2’s area
}
}