package cn.itcast.oneThree;

public class Cat extends Pet{
	public Cat() {
		super();
	}
	public void catchMouse() {
		System.out.println(super.getCoatColor()+"----猫在抓老鼠");
	}
}
