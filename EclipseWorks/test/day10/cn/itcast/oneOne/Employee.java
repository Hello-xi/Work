package cn.itcast.oneOne;

public class Employee {
	private String name;
	private String ID;
	private double wage;
	public Employee() {
		super();
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setID(String ID) {
		this.ID=ID;
	}
	public String getID() {
		return ID;
	}
	public void setWage(double wage) {
		this.wage=wage;
	}
	public double getWage() {
		return wage;
	}
	public void work() {

	}
}
