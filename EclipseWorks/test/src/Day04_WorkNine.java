
public class Day04_WorkNine {
	public static void main(String[]args) {
		//一个三维数组
		int [][] arr= {{213,34,64,236,76,5},{45,534,234,876,954,23,23},{4,23,7,91,-0,43}};
		//使用嵌套循环遍历
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	/**	B:公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99
		*/
		//需要一个计数器,记住每次的数字
		int count=0;
		//把四个季度的值封装到一个二维数组里
		int arr_1[][]= {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		for(int x=0;x<arr_1.length;x++) {
			for(int y=0;y<arr_1[x].length;y++) {
				//每次都把遍历出来的值进行相加
				count+=arr_1[x][y];
			}
		}
		System.out.print("总数是"+count);
	}
}
