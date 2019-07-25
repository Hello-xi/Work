import java.util.Scanner;
public class Day05_WorkFour {
	public static void main(String[]args) {
	/** 库存管理
	 * 管理员能够进行的操作有3项（查看、修改、退出），我们可以采用（switch）菜单的方式来完成。 -------------库存管理------------
	 * 1.查看库存清单 2.修改商品库存数量 3.退出 请输入要执行的操作序号： 每一项功能操作，我们采用方法进行封装，这样，可使程序的可读性增强。
	 * 选择“1.查看库存清单”功能，则控制台打印库存清单 选择“2.修改商品库存数量”功能，则对每种商品库存数进行更新
	 * 选择“3.退出”功能，则退出库存管理，程序结束 */
	
		choose();
	}
	private static void choose() {
		String [] name= {"lenovo","mac","asus"};
		double [] price= {7000,16999,9000};
		int [] count= {12,10,15};
		tab();
		while(true) {
			switch(new Scanner(System.in).nextInt()) {
				case 1:
					one(name, price, count);
					break;
				case 2:
					two(name,count,price);
					break;
				case 3:
					return;
			}
		}
	}
	private static void tab() {
		System.out.println("------库存管理------");
		System.out.println("  1.查看库存清单    ");
		System.out.println("  2.修改商品库存    ");
		System.out.println("  3.退出           ");
		System.out.println(":请输入要选择的数字:");
	}
	private static void two(String[] name, int[] count, double[] price) {
		for(int i=0;i<name.length;i++) {
			/*System.out.println("请输入要修改的品牌");
			name[i]=new Scanner(System.in).next();*/
			System.out.println("请输入要修改的数量");
			count[i]=new Scanner(System.in).nextInt();
			System.out.println("请输入要修改的价格");
			price[i]=new Scanner(System.in).nextDouble();
		}
		tab();
	}
	private static void one(String[] name,double[] price,int[] count) {
		System.out.println("---------------------");
		System.out.println("    查看库存清单    ");
		System.out.println("品牌"+"\t"+"数量"+"\t"+"价格");
		int x ;int y;
		x=y=0;
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"\t"+count[i]+"\t"+price[i]);
			x+=count[i];
			y+=price[i]*count[i];
		}
		System.out.println("总数量:\t"+x);
		System.out.println("总价格:\t"+y);
		tab();
	}
}
