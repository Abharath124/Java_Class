package inter;
interface Animal{
	abstract void sound();
}
class Horse implements Animal{
	public void sound() {
		System.out.println("Woof Woof Woof");
	}
}
class Tiger3 implements Animal{
		public void sound() {
			System.out.println("Gur Gur Gur");
		}
	}

	
public class Main {

	public static void main(String[] args) {
          Horse a = new Horse();
          a.sound();
          Tiger3 t = new Tiger3();
          t.sound();
          
	}

}
