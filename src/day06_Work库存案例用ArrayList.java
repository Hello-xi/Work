import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class day06_Work库存案例用ArrayList {
	public static void main(String[]args) {
		ArrayList<choose> al=new ArrayList<choose>();
		for(;;) {
			switch(tab()) {
			case 1:
				addChoose(al);
				break;
			case 2:
				setChooseCount(al);
				break;
			case 3:
				printChoose(al);
				break;
			case 4:
				return;
			default :
				System.out.println("输入的数字错误");
			}
		}
	}
	//打印库存清单
	public static void printChoose(ArrayList<choose> al) {
	 	for(Iterator<choose> it=al.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}
	//修改商品数量
	public static void setChooseCount(ArrayList<choose>al) {
		for(int i=0;i<al.size();i++) {
			System.out.println("请输入"+al.get(i).getName()+"商品要修改的数量,并按下回车:");
			al.get(i).setCount(new Scanner(System.in).nextInt());
		}
	}
	//添加所需要的商品
	public static void addChoose(ArrayList<choose> al) {
		for(int i=0;i<3;i++) {
			System.out.println("请输入商品名称 数量 价格 ,并每次后面都要输入回车确定:");
			choose a1=new choose(new Scanner(System.in).next(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextDouble());
			al.add(a1);
		}
	}
	//主菜单
	public static int tab() {
		System.out.println("------库存管理------");
		System.out.println("  1.添加需要的商品  ");
		System.out.println("  2.修改商品库存    ");
		System.out.println("  3.打印商品清单    ");
		System.out.println("  4.退出           ");
		System.out.println(":请输入要选择的数字:");
		return new Scanner(System.in).nextInt();	
	}
	//需要一个商品类
	public static class choose{
		String name;
		int count;
		double money;
		public choose() {
			super();
		}
		public choose(String name,int count,double money) {
			super();
			this.name=name;
			this.count=count;
			this.money=money;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public double getMoney() {
			return money;
		}
		public void setMoney(double money) {
			this.money = money;
		}
		@Override
		public String toString() {
			return "choose [名称=" + name + ", 数量=" + count + ", 钱=" + money + "]";
		}
		
	}
}