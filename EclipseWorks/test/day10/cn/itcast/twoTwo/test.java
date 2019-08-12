package cn.itcast.twoTwo;

public class test {
	public static void main(String[]args) {
		BasisStudent b=new BasisStudent();
		EmployedStudent e=new EmployedStudent();
		b.setName("基础班");b.setAge(0);b.setLearn("JavaSE");
		e.setName("就业班");e.setAge(1);e.setLern("Android");
		b.learn();
		e.learn();
	}
}
