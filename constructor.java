public class constructor{
	int x;
	public constructor(int y){
		x=y;
	}
	public static void main(String args[]){
		constructor obj=new constructor(1);
		System.out.println(obj.x);
		obj.x=2;
		System.out.println(obj.x);
	}
}