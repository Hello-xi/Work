package cn.itcast.oneThree;

public class Dog extends Pet {
	public Dog() {
		super();
	}
	public void lookHome() {
		System.out.println(super.getCoatColor()+"...在看家");
	}
}
