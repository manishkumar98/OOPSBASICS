class squ extends rect{
	 void printsquare(){
		System.out.println("Square is a rectangle");
	}
	public  static void main(String args[]){
		squ obj=new squ();
		
		obj.printrect();
		obj.printshape();
		obj.printsquare();

	}
}