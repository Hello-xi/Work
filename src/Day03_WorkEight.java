
public class Day03_WorkEight {

	public static void main(String[]args) {
		/**
		 * 编写程序，打印1到100之内的整数，但数字中包含7的要跳过
		 */
		//for循环遍历1-100的所有数字
		for(int i=1;i<101;i++) {
			//使用if来进行比较,用String.valueof把要进行比较的数字转换成字符.
			//然后用contains判断要比较的字符是否包含这个字符.返回的结果不是true||false,所以要加上!符号
			if(!String.valueOf(i).contains("7")) {
				//输出比较后不包含7这个字符的数据
				System.out.print(i+" ");
			}
		}
		/*代码2:
		 * 	int ge shi;
		 * 	for(int i=1;i<101;i++){
		 * 		ge =i%10;
		 * 		shi=i/10%10;
		 * 	if(!(ge==7)&&!(shi==7)){
		 * 	System.out.print(i+" ");	
		 * 	}
		 * 	}
		 */
	}
}
