
public class Day07_WorkThree {
	public static void main(String[]args) {
		/**计算15+25+35+....+1005的和
		 * */
		int sum=0;
		int count=0;
		for(int i=5;i<=1005;i+=10) {
			sum+=i;
			System.out.print(sum+"\t");
			count++;
			if(count%10==0) {
				System.out.println();
			}
		}
	}
}
