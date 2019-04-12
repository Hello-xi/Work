import java.util.Scanner;//导入一个获取键盘录入的包
public class Day04_WorkOne {
	public static void main(String[]args) {
		/**编写代码实现如下内容：if语句实现考试成绩分等级(使用switch语句)。
		[90-100]	A等。
		[80-90) 	B等。
		[70-80) 	C等。
		[60-70) 	D等。
		[0-60)  	E等。
		请根据给定成绩，输出对应的等级。
		说明："["表示包含，")"表示不包含*/
		//new一个捕捉键盘录入的对象设置获取键盘录入
		Scanner sc=new Scanner(System.in);
		//设置获取过来的数字必须是整数
		int i=sc.nextInt();
		//进行if的判断中间用&符号链接标示必须两边都通过
		if(90<=i&i<=100) {
			System.out.print("A等");
		}else if(i>=80&i<90) {
			System.out.print("B等");
		}else if(i>=70&i<80) {
			System.out.print("C等");
		}else if(i>=60&i<70) {
			System.out.print("D等");
		}else if(i>=0&i<60) {
			System.out.print("E等");
		}else {
			System.out.print("输入的"+i+"不是有效的数字");
		}
		/** 这里写switch不合适 因为重复出现的代码过多,下面只写一部分
		switch(i) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.print("A等");
			break;
		}**/
	}
}
