package cn.itcast.oneOne;

public class PM extends Employee{
	private double bonus;//奖金
	public void setBonus(double bonus) {
		this.bonus=bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public void work() {
		System.out.println("姓名："+super.getName()+"\t工号："+super.getID()+"\t工资："+super.getWage()+"\t奖金："+this.bonus);
	}
}
