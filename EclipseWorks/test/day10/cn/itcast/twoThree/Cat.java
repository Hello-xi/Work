package cn.itcast.twoThree;

public class Cat extends Pet {
	public void catchMouse() {
		System.out.println(super.getCoatColor()+"-在抓"+super.getLeg());
	}
}
