package inter;
interface Animal1{
	abstract void sound();
}
class tiger implements Animal1{
	public void sound() {
		System.out.println("Gur Gur Gur");
	}
}
public class Tigernew {
	public static void main(String[] args) {
		tiger t = new tiger();
		t.sound();
	}
}
