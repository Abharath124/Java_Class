package polymorphism;

class Animal{// Parent
	public  void sound() {
		System.out.println("Animal Sounds");
	}
}

class Dog extends Animal{ // Child1
	//@Override
	public  void sound() {
		System.out.println("Bow - Bow");
	}
}

public class runtimepoly {
    public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}
}
