package cn.itcast.twoTwo;

public class EmployedStudent extends Student{
	private String learn;
	public EmployedStudent() {
		super();
	}
	public void setLern(String learn) {
		this.learn=learn;
	}
	public String getLearn() {
		return learn;
	}
	public void learn() {
		System.out.println(super.getName()+"..."+super.getAge()+"----"+"在学"+this.learn);
	}
}
