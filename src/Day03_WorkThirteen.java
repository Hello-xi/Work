import java.util.Scanner;//一个可以获取键盘录入的类
public class Day03_WorkThirteen {
	public static void main(String[]args) {
		/**键盘录入三个整数，并将三个数据中的最大值打印在控制台。*/
		//获取键盘录入的三个整数
		int x=new Scanner(System.in).nextInt();
		int y=new Scanner(System.in).nextInt();
		int z=new Scanner(System.in).nextInt();
		//使用一个自定义的方法把3个值传进去来进行比较
		int max=gatMax(x,y,z);
		//打印最大值
		System.out.print(max);
	}
	//有返回的结果吗?  有.
	//返回值是什么 int 
	//参数列表 有要传的值吗? 有 总共三个int类型的整数
	public static int gatMax(int x,int y, int z) {
		//x和y进行比较
		if(x>y) {
			//在x和z进行比较
			if(x>z) {
				//如果x大于z 返回x
				return x;
			}else {
				//否则返回z
				return z;
			}
		}else {
			//要是x小于y就把y和z进行比较
			if(y>z) {
				//如果y大于z 返回y
				return y;
			}else {
				//否则返回z
				return z;
			}
		}
	}
	/*简化:用三元改
		if(a > b) {
		return (a>c? a: c);
		}else {
		return (b>c? b: c);
		}
		-------------------
		//继续改进
		//return (a>b)? (a>c? a: c): (b>c? b: c);
		//不建议，写代码一定要注意阅读性强
		int temp = ((a>b)? a: b);
		int max = ((temp>c)? temp: c);
		return max;
	 * */
}