package cn.itcast.twoOne;

public class BasisTeacher/*基础老师*/ extends Teacher {
	public void speak() {
		System.out.println(super.getName()+"..."+super.getAge()+"----"+"再讲"+super.getPrelection());
	}
}
