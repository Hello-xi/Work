package cn.itcast.twoTwo;

public class BasisStudent extends Student{
	private String learn;
	public BasisStudent() {
		super();
	}
	public void setLearn(String learn) {
		this.learn=learn;
	}
	public String getLearn() {
		return learn;
	}
	public void learn() {
		System.out.println(super.getName()+"..."+super.getAge()+"----"+"在学"+this.learn);
	}
}
