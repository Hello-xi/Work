package cn.itcast.oneOne;

public class Programmer extends Employee{
	public void work() {
		System.out.println("姓名："+super.getName()+"\t工号："+super.getID()+"\t工资："+super.getWage());
	}
}
