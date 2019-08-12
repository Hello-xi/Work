package cn.itcast.twoThree;

public class test {
	public static void main(String[]args) {
		Cat c=new Cat();
		Dog d=new Dog();
		c.setCoatColor("白色");c.setLeg(0);
		d.setCoatColor("黑色");d.setLeg(1);
		c.catchMouse();
		d.lookHome();
	}
}
