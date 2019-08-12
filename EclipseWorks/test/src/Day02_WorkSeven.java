import java.util.Scanner;//导入一个java已有的类用来接收输入的数；
public class Day02_WorkSeven {
	//主函数入口
	public static void main (String[]args) {
		/**
		 * 要求：在控制台上输入一个百位数将其每个位置上的书打印出来
		 */
		//创建一个对象用来接受控制台的数据
		Scanner sc=new Scanner(System.in);
		//判断接收过来的是个整数
		int i=sc.nextInt();
		//要判断一个三位数上每个位是多少需要有3个这个类型的变量来存储
		int x,y,z;
		x=i%10;//
		y=i/10%10;
		z=i/100;
		System.out.println("输入的数是："+i+"它的个位是："+x+"它的十位是："+y+"它的百位是："+z);
		/*简化的代码
		 * char cha[] =String.vaueof(new Scanner(System.in).nextInt()).toCharArray();
		 * 	System.out.println("个位是:"+chs[2]+"\n十位是:"+chs[1]+"\n百位是:"+chs[0]);
		 * */
	}
}
