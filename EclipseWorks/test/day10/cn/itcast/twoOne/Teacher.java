package cn.itcast.twoOne;

public abstract class Teacher {
	private String name;
	private int age;
	private String prelection;//讲课
	public Teacher() {
		super();
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setPrelection(String prelection) {
		this.prelection=prelection;
	}
	public String getPrelection() {
		return prelection;
	}
}
