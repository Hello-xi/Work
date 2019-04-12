import java.util.Random;//导入一个java能生成伪随机数的类
public class Day03_WorkSix {
	//主函数入口
	public static void main(String[]args) {
		/**
		 * 编写程序，生成5个1至10之间的随机整数，并打印结果到控制台。
		 */
		//创建一个用来生成伪随机数的对象
		Random r=new Random();
		//要求是总共显示5个,所以用for循环来完成
		for(int x=0;x<5;x++) {
			//nextInt用来规定生成的是整数并且从0~9所以要+1
			int i=r.nextInt(10)+1;
			System.out.println(i);
		}
		/*简化的代码
		 * for(int i=0;i<5;i++){
		 * System.out.println(new Random().nextInt(10)+1);
		 * }
		 * */
	}
}
