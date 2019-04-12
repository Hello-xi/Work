import java.util.Random;
public class Day05_WorkFive {
	public static void main(String[]args) {
		/**随机点名器案例*/
		String []name= {"同意","打火机","文档","阿萨德刚"};
		System.out.println(random(name));
	}
	private static String random(String [] x) {
		return x[new Random().nextInt(x.length)];
	}
}