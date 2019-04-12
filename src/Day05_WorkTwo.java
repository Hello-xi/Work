
public class Day05_WorkTwo {
	public static void main(String[] args) {
		/**2.分析以下需求，并用代码实现：(封装成方法)
		(1)打印1到100之内的整数，但数字中包含9的要跳过
		(2)每行输出5个满足条件的数，之间用空格分隔
		(3)如：
			1 2 3 4  5
			6 7 8 10 11   */
		printOfFive();
	}
	private static void printOfFive() {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i==9|i/10%10==9|i/100==9) {
				continue;
			}if(count%5==0) {
				System.out.println();
			}
			count++;
			System.out.print(i+" ");
		}
	}
}
