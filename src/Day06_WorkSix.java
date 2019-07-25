import java.util.ArrayList;
import java.util.Iterator;
public class Day06_WorkSix {
	public static void main(String[] args) {
		/**
		 * 定义一个手机类Phone，包含三个属性品牌(brand)、价格(price)、颜色(color)。
		 * 创建四个手机("小米"、"华为"、"乐视"、"奇酷")对象存入ArrayList集合中，并遍历输出
		 */
		ArrayList<Phone> arr=new ArrayList<Phone>();
		Phone p1=new Phone("小米",4399,'红');
		Phone p2=new Phone("华为",5399,'蓝');
		Phone p3=new Phone("乐视",899,'白');
		Phone p4=new Phone("奇酷",132,'黑');
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		for(Iterator<Phone> i=arr.iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public static class Phone {
		String brand;
		double price;
		char color;
		
		public String toString() {
			return "Phone [brand=" + brand + ", price=" + price + ", color=" + color + "]";
		}
		public Phone() {
			super();
		}
		public Phone(String brand,double price,char color) {
			super();
			this.brand=brand;
			this.price=price;
			this.color=color;
			
		}
		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public char getColor() {
			return color;
		}

		public void setColor(char color) {
			this.color = color;
		}
	}
}
