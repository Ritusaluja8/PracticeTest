package practicetest;
class Animal{
	void shout()
	{
		System.out.println("sound of animal is");
	}
}
class Horse extends Animal{
	void shout() 
	{
	System.out.println("sound of horse is neigh");	
	}
}
class Cat extends Animal{
	void shout() 
	{
	System.out.println("sound of cat is meow-meow");	
	}
	
}
class Dog extends Animal{
void shout() 
{
System.out.println("sound of dog is bark");	
}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Horse();
		animal.shout();
		Animal animal2=new Cat();
		animal2.shout();
		Animal animal3=new Dog();
		animal3.shout();
		

	}

}
