import java.util.*;

public class grade{
	public static void main(String args[]){
		int arr[]={87,68,94,100,83,78,85,91,76,87};
		int g[]=new int[11];
		for(int i=0;i<arr.length;i++){
			int x=arr[i]/10;
			g[x]++;

		}
		for(int i=0;i<g.length;i++){
			if(i!=g.length-1)
			System.out.printf( "%02d-%02d: ",10*i, 10*i+9);
		else
			System.out.printf( "  %02d:  ",10*i);
			for(int j=0;j<g[i];j++)
			System.out.print("*");
		System.out.println();
		}
	}
}