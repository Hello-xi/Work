package cn.itcast.one;

public class Demo {
	public double sum(double a ,double b) {
		return a+b;
	}
	public boolean equal(double a,double b) {
		return a==b?true:false;
	}
	public void jiuJiu() {
		for(int i=1;i<=9;i++) {
			for(int y=1;y<=i;y++) {
				System.out.print(y+"*"+i+"="+i*y+"\t");
			}
			System.out.println();
		}
	}
}
