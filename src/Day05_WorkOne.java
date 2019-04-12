import java.util.Scanner;
public class Day05_WorkOne {
	public static void main(String[]args) {
		/**1.分析以下需求，并用代码实现(每个小需求都要封装成一个方法)：
		(1)键盘录入两个数据,求两个数据之和(整数和小数)
		(2)键盘录入两个数据,判断两个数据是否相等(整数和小数)
		(3)键盘录入三个数据,获取两个数中较大的值(整数和小数)
		(4)打印m行n列的星形矩形
		(5)打印nn乘法表
		(6)计算长方形和圆形的面积
		*/
		System.out.println("计算整数和小数的结果:请先输入整数按回车后再输入小数");
		System.out.println(add(new Scanner(System.in).nextInt(),new Scanner(System.in).nextDouble()));
		System.out.println("判断两个数是否相等,整数和小数");
		beEqual(new Scanner(System.in).nextInt(),new Scanner(System.in).nextDouble());
		System.out.println("比较三个数的大小,整数,小数,长整形");
		System.out.println(compare(new Scanner(System.in).nextInt(),new Scanner(System.in).nextDouble(),new Scanner(System.in).nextLong()));
		System.out.println("请输入*形矩阵的m行n列");
		matrix(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
		System.out.println("请输入乘法口诀表的行和列");
		jiuJiu(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
		System.out.println("请输入长方形的长和宽");
		System.out.println(theAreaOfARectangle(new Scanner(System.in).nextDouble(),new Scanner(System.in).nextDouble()));
		System.out.println("请输入圆形的半径");
		System.out.println(theAreaOfTheCircle(new Scanner(System.in).nextDouble()));
	}
	private static double add(int a,double b) {
		return a+b;
	}
	private static void beEqual(int a,double b) {
		if((double)a==b) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
	}
	private static long compare(int a,double b,long c) {
		return a>b?a:b>c?a>b?a:(long)b:c;
	}
	private static void matrix(int a,int b) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void jiuJiu(int a,int b) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+" ");
			}
			System.out.println();
		}
	}
	private static double theAreaOfARectangle(double a,double b) {
		return a*b;
	}
	private static double theAreaOfTheCircle(double a) {
		return Math.PI*(a*a);
	}
}
