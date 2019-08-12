
public class Day07_WorkOne {
	public static void main(String[]args) {
		/**(1)按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1661,8228,3773)的数字及个数
		   (2)每行输出5个满足条件的数，之间用空格分隔
	   	   (3)如：9999 9988 9977 9966 9955 	
		 * */
		int count=0;
		for(int i=0 ;i<=10000;i++) {
			if(i%10+i/100%10==i/10%10+i/1000%10) {
				System.out.print(i+"\t");
				count++;
				if(count%5==0) {
					System.out.println();
				}
			}
		}
	}
}
