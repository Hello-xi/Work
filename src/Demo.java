
public class Demo {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int number = 8;
		int index = 0;
		for (int a = 0; a < arr.length; a++) {
			if (number == arr[a]) {
				index = a;
			} else {
				index = -1;
			}
		}
		System.out.println(index >= 0 ? ("元素 " + number + " 在数组中的索引是" + index) : "数组中没有元素 " + number);
}
}