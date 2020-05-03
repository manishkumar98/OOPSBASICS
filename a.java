abstract class Bike{
abstract void run();
Bike(){
System.out.println("Constuctor");
}
void changeGear(){
System.out.println("gear changed");
}
}
class Hero extends Bike {
void run(){
System.out.println("avg speed 70 kmph");
}
}
class KTM extends Bike {
void run(){
System.out.println("avg speed 100 kmph");
}
}
class TestBike {
public static void main(String[] args){
Bike obj;
obj = new Hero();
obj.changeGear();
obj.run();
obj = new KTM();
obj.run();
}
}