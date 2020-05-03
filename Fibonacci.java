public class Fibonacci{
public static void main(String args[]){
	int n=Integer.parseInt(args[0]);
	for(int i=1;i<=n;i++){
		int x=fib(i);
		System.out.println(x+" ");
	}
}
public static int fib(int n){
	if(n==1)
		return 1;
	if(n==2)
		return 1;
	
		return fib(n-1)+fib(n-2);
}
}