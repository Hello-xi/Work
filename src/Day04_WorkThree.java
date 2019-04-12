import java.util.Scanner;
public class Day04_WorkThree {
	public static void main(String[]args) {
		/**分析以下需求，并用代码实现：
		(1)键盘录入三个整数，按照从小到大的顺序输出
		(2)如果用户输入的是3 2 1，程序运行后打印格式"按照从小到大排序后的顺序为：1 2 3"*/
		//提示用户输入三个整数
		System.out.println("请输入三个整数");
		//获取三个整数
		int x=new Scanner(System.in).nextInt();
		int y=new Scanner(System.in).nextInt();
		int z=new Scanner(System.in).nextInt();
		//把三个数字放进数组里
		int [] arr= {x,y,z};
		//开始遍历数组,使用选择排序比较
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		//把数组遍历出来
		for(y=0;y<arr.length;y++) {
			System.out.print(arr[y]+" ");
		}
	}	
}
