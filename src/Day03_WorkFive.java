
public class Day03_WorkFive {
	//主函数入口
	public static void main(String[]agrs) {
		/**
		 * 输出一个等腰三角形 
		 */
		// 原理是先打出一个空格的倒直角三角形，在打印一个等腰三角形
		for(int x=0;x<8;x++) {
			for(int y=8;y>x;y--) {
				System.out.print(" ");
			}
			for(int y=1;y<x*2;y++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
