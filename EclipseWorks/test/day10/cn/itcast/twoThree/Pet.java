package cn.itcast.twoThree;

public abstract class Pet {
	private String coatColor;//毛色
	private int leg;//腿
	public Pet() {
		super();
	}
	public void setCoatColor(String coatColor) {
		this.coatColor=coatColor;
	}
	public String getCoatColor() {
		return coatColor;
	}
	public void setLeg(int leg) {
		this.leg=leg;
	}
	public int getLeg() {
		return leg;
	}
	public void eat() {
		System.out.println("在吃！");
	}
}
