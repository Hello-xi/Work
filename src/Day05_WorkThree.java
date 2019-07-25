
public class Day05_WorkThree {
	public static void main(String[]args) {
		/**3.分析以下需求，并用代码实现：(封装成方法)
			(1)打印1-100之间的所有素数及个数
			(2)每行输出5个满足条件的数，之间用空格分隔
			注意：大于1的能被1和其本身整除的数叫素数。*/
		primeNunber();
	}
	private static void primeNunber() {
	        int j,count=0;
	        for(int i=2;i<100;i++){
	            j=2;
	            while(i%j!=0){
	                j++;
	            }
	            if(i==j){//如果i！=j，说明i还能被其他的数整除，i不是质数
	                System.out.print(i+" ");
	                count++;
	            }if(count%5==0) {
	            	System.out.println();
	            }
	        }
	    }
}
