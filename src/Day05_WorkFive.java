import java.util.Random;
public class Day05_WorkFive {
	public static void main(String[]args) {
		/**随机点名器案例*/
		//创建一个数组用来存储数据
		String []name= {"同意","打火机","文档","阿萨德刚"};
		//打印随机的数组角标
		System.out.println(random(name));
	}
	//创建一个静态的方法,返回值是数组的类型
	private static String random(String [] x) {
		//返回一个数组角标整型并且角标最大值是数组的角标最大值的数组
		return x[new Random().nextInt(x.length)];
	}
}