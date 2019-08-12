package cn.itcast.oneTwo;

public class test {
	public static void main(String[]args) {
		Teacher t=new Teacher();
		Student s=new Student();
		t.setName("老师");t.setAge(23);
		s.setName("学生");s.setAge(17);
		t.eat();t.work();
		s.eat();s.work();
	}
}
