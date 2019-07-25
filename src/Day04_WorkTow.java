import java.util.Scanner;//导入一个捕获器的类
public class Day04_WorkTow {
	public static void main(String[] args) {
	   /**day04_Two-分析以下需求，并用代码实现：
		(1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
		(2)涨工资的条件如下：
			[10-15)     +5000
			[5-10)      +2500
			[3~5)       +1000
			[1~3)       +500
			[0~1)       +200
		(3)如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"**/
		Scanner sc=new Scanner(System.in);
		Scanner sc_1=new Scanner(System.in);
		System.out.println("请输入工龄");
		int gl=sc.nextInt();
		System.out.println("请输入基本工资");
		int wage=sc_1.nextInt();
		int zh=0;
		int z=0;
		int[] y= {5000,2500,1000,500,200};
		if(10<=gl&gl<15) {
			zh=wage+5000;
			z=y[0];
		}else if(gl>=5&gl<10) {
			zh=wage+2500;
			z=y[1];
		}else if(gl>=3&gl<5) {
			zh=wage+1000;
			z=y[2];
		}else if(gl>=1&gl<3) {
			zh=wage+500;
			z=y[3];
		}else if(gl>=0&gl<1) {
			zh=wage+200;
			z=y[4];
		}else {
			System.out.print("输入的"+gl+"不是有效的数字");
		}
		System.out.print("您目前工作了"+gl+"年,基本工资为"+wage+"元,应涨工资"+z+"元,涨后工资"+zh+"元");
	}
}
