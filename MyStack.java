import java.util.*;
public class MyStack{
	private int maxsize;
	private int[] stackArray;
	private int top;
	MyStack(int s){
	maxsize=s;
	stackArray=new int[maxsize];
	top=-1;
	}
	public void push(int num){
		stackArray[++top]=num;

	}
	public int pop(){
		return stackArray[top--];

	}
	public  int peek(){
		return stackArray[top];
	}
	public  boolean ifEmpty(){
		if(top==-1)
			return true;
		return false;

	}
	public boolean ifFull(){
		if(top==(maxsize-1))
			return true;
		return false;


	}
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		MyStack obj=new MyStack(n);	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		while(!obj.ifFull()){
			int x=sc.nextInt();
			obj.push(x);
		}
		if(!obj.ifEmpty()){
		System.out.println("Peek="+obj.peek());
		System.out.println("Popping out");
		while(!obj.ifEmpty()){
			System.out.println(obj.pop());
		}
	}


	}
}