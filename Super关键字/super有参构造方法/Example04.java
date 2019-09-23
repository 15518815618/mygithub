class Animal
{
	public Animal(String name){
	System.out.println("我是一只"+name);
	}
}
class Dog extends Animal
{
public Dog(){
super("二哈");
}
}
class Example04
{
	public static void main(String[] args){
	Dog dog=new Dog();
	}
}