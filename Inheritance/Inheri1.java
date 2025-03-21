package Inheritence1;


class Parent{
	public void parent() {
		System.out.println("Iam a Parent Class");
	}
}

class child extends Parent{
	public void childmethod() {
		System.out.println("Iam a Child Class");
	}
}
public class Inheri1 {
  public static void main(String[] args) {
	Parent p = new Parent();
	child c = new child();
	p.parent();
	c.childmethod();
}
}
