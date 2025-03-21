package Java;

class Animal{
	public static void dog() {
		System.out.println("Bow-Bow...!");
	}
	void cat() {
		System.out.println("Meow-Meow...!");
	}
}
 class Main {
   public static void main(String[]args) {
	   Animal obj = new Animal();
	   obj.dog();
	   obj.cat();
   }
}
