package cn.itcast.oneTwo;

public class Teacher extends People {
	public void work() {
		System.out.println(super.getName()+"..."+super.getAge()+"在讲课");
	}
}
