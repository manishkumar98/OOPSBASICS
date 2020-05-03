class Exercise{
	public static void main(String args[]){
		Employee emp=new Employee();
		emp.printInfo();
		emp.printWork();
		Teaching tech=new Teaching();
		tech.printWork();
		NonTeaching nontech=new NonTeaching();
		nontech.printWork();
	}
}