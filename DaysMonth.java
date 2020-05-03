import java.util.*;
public class DaysMonth{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		sc.nextLine();
		int month_day[]=new int[12];
		int k=31;
		for(int i=0;i<12;i++){
			month_day[i]=k;
			if(i==7)
				continue;
			if(k==31)
				k=30;
			else
				k=31;
		}
		

		if(year%4==0&&year%400!=0){
			month_day[1]=29;
		}
		else
			month_day[1]=28;
		for(int i=0;i<12;i++){
			if(i!=11)
			System.out.print(month_day[i]+",");
		else
			System.out.print(month_day[i]);
		}

	}

}