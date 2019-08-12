import java.util.Scanner;//导入一个可以捕获键盘录入的类
public class Day03_WorkTwelve {
	public static void main(String[]args) {
	/**需求：
		* 键盘录入x的值，计算出y的并输出。		
		* x>=3	y = 2 * x + 1;
		* -1<x<3	y = 2 * x;
		* x<=-1	y = 2 * x - 1;*/
		//获取键盘录入
		Scanner sc=new Scanner(System.in);
		//使用Scanner的nextInt来获取整数
		int x=sc.nextInt();
		//用if语句来判断x的值并进行后续的运算
		if(x>=3) {
			System.out.println("Y="+(2*x+1));
		}else if(x>-1) {
			System.out.print("Y="+(2*x));
		}else if(x<=-1) {
			System.out.println("Y="+(2*x-1));
		}
		/*简化:
		 * int x = new Scanner(System.in).nextInt();
		System.out.println("y = " + (x >= 3 ? ((2 * x) + 1) : x > -1 && x < 3 ? 2 * x : x <= -1 ? ((2 * x) - 1) : ""));
		 * */
	}
}
