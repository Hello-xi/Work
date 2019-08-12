package cn.itcast.oneTwo;

public class Student extends People{
	public void work() {
		System.out.println(super.getName()+"..."+super.getAge()+"在学习");
	}
}
