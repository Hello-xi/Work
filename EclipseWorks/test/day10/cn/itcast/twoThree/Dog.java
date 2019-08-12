package cn.itcast.twoThree;

public class Dog extends Pet{
	public void lookHome() {
		System.out.println(super.getCoatColor()+"在看"+super.getLeg());
	}
}
