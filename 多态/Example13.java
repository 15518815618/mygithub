interface Animal
{
	void shout();
}
class Dog implements Animal
{
	public void shout(){
	System.out.println("ÍôÍô¡¤¡¤¡¤");
	}
}
class Cat implements Animal
{
	public void shout(){
	System.out.println("ß÷ß÷¡¤¡¤¡¤");
	}
}
class Example13
{
	public static void main(String[] args){
	Animal an1=new Dog();
	Animal an2=new Cat();
animalShout(an1);
animalShout(an2);
	}
	public static void animalShout(Animal an){
	an.shout();
	}
}