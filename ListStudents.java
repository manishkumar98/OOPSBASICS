import java.util.*;
public class ListStudents{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");

		int n=sc.nextInt();
		Student[] stud=new Student[n];
		
		for(int i=0;i<n;i++){
			String a=sc.next();
			
			String b=sc.next();
			
			int c=sc.nextInt();
			stud[i]=new Student(a,b,c);
			
		}

		for(int i=0;i<n;i++){
		System.out.println("Student"+(i+1)+" "+stud[i].name+" "+stud[i].id+" "+stud[i].year);
		
		}
		
	}
}