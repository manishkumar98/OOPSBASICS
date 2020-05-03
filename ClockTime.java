public class ClockTime
{
	int h,m,s;
	void setTime(int h,int m,int s){
		this.h=h;
		this.m=m;
		this.s=s;
	}
	void displayTime(String s1){
		if(s1.equals("24")){
			
			System.out.println(h+"hours"+m+"minutes"+s+"seconds");
		}
		else
		displayTime();
			
			
			

		
	}
	void displayTime(){
		if(h>12){
			h=h-12;
		}
		if(h==0)
			h=12;
			
		System.out.println(h+"hours"+m+"minutes"+s+"seconds");
	}
	public static void main(String args[]){
		
		ClockTime obj=new ClockTime();
		obj.setTime(22,10,10);
		obj.displayTime("24");
		obj.displayTime("12");
		obj.displayTime();
	}
}