package cn.itcast.oneThree;

public class test {
	public static void main(String[]args) {
		Cat c=new Cat();
		Dog d=new Dog();
		c.setCoatColor("白色");c.setLeg(4);
		d.setCoatColor("黑白色");d.setLeg(4);
		c.catchMouse();c.eat();
		d.lookHome();d.eat();
	}
}
