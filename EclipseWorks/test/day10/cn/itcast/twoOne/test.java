package cn.itcast.twoOne;

public class test {
	public static void main(String[]args) {
		BasisTeacher b=new BasisTeacher();
		EmployedTeacher e=new EmployedTeacher();
		b.setName("基础班");b.setAge(0);b.setPrelection("JavaSE");
		e.setName("就业班");e.setAge(1);e.setPrelection("Android");
		b.speak();
		e.speak();
	}
}
