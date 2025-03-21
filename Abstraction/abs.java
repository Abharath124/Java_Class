package abstraction;

abstract class Flowers{ // parent class
	abstract void smell() ; // abstract methods does not have any body
	abstract void Smell1();
}

class Rose extends Flowers{
	void smell() {// Override
		System.out.println("Rose Smell");
	}
	void Smell1() {
		System.out.println("Rose Smell 2");

	}
}

public class abs {
     public static void main(String[] args) {
		Rose r = new Rose();
		r.smell();
		r.Smell1();
	}
}
