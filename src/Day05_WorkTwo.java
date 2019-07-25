
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
		//设置一个计数器每次有五个数字就换行
		int count=0;
		//要打印1-100内的所有数字但要跳过包含9的所以要循环
		for(int i=1;i<=100;i++) {
			//没次循环的数字进行判断它的个位,十位,百位是不是等于9
			if(i==9|i/10%10==9|i/100==9) {
				//要是包含9的话结束本次循环,继续下次循环
				continue;
				//判断计数器有没有到5,计数器%5等于0的话表示满足条件开始换行
			}if(count%5==0) {
				System.out.println();
			}
			//每次计数器进行+1
			count++;
			//输出循环的结果
			System.out.print(i+" ");
		}
	}
}
