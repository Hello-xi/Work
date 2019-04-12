import java.util.Scanner;
public class Day04_WorkEigth {
	public static void main(String[]args) {
		/**数组遍历
		 */
		//一个数组
		int arr[]= {12,32,1,4,213,45,67,8};
		//使用高级for循环遍历数组
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();//换行
		//一个二维数组
		int arr_1[][]= {{12,45,78,21,46},{13,53,54,24}};
		//使用for的嵌套循环来遍历出数组
		for(int i=0;i<arr_1.length;i++) {
			for(int j=0;j<arr_1[i].length;j++) {
				System.out.print(arr_1[i][j]+" ");
			}
		}
		System.out.println();//换行
		//把数组的值赋值给x,防止比较负数是没有意义
		int x=arr[0];
		//使用否循环遍历,利用数组的角标进行比较,角标-1是为防止角标越界
		for(int i=0;i<arr.length-1;i++) {
			if(x<arr[i+1]) {
				x=arr[i+1];
			}
		}
		//打印出最大的数
		System.out.print(x);
		System.out.println();//换行
		//使用for的遍历来进行元素逆序交换
		for(int min=0,max=arr.length-1;min<max;min++,max--) {
			int temp=arr[max];
			arr[max]=arr[min];
			arr[min]=temp;
		}
		//高级for循环打印出结果
		for(int s:arr) {
		System.out.print(s+" ");
		}
		//一个字符串数组
		String[] str= {" ","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		//键盘录入数字显示星期
		System.out.println(str[new Scanner(System.in).nextInt(8)]);
		//要查找指定元素在数组出现的第一次索引:需要两个变量,一个是指定的数,一个记录索引
		int number = 7;
		int index = 0;
		//进行for循环遍历
		for (int a = 0; a < arr.length; a++) {
			//每次进行值的比较,相等的话把这次遍历的索引值赋值给index,没有的话为-1
			if (number == arr[a]) {
				index = a;
			} else {
				index = -1;
			}
		}
		//使用三元二次运算对最后的输出结果进行判断打印
		System.out.println(index >= 0 ? ("元素 " + number + " 在数组中的索引是" + index) : "数组中没有元素 " + number);
		
	}
}

