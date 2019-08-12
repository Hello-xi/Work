package cn.itcast.oneOne;

public class test {
	public static void main(String[]args) {
		PM p=new PM();
		p.setName("项目经理");p.setID("0");p.setWage(3200);p.setBonus(100);
		p.work();
		Programmer g=new Programmer();
		g.setName("程序员");g.setID("1");g.setWage(3500);
		g.work();
	}
}
