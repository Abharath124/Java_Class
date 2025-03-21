package Inheritence1;

final class Exercise1 {

	final public static void method1() {
		System.out.println("Iam Final Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a =100;
//		final public void method1() {
//			System.out.println("Iam Final Method");
//		}
		System.out.println("Iam Final Variable : "+ a);
		System.out.println("Iam a Final Class");
		method1();
	}
}
