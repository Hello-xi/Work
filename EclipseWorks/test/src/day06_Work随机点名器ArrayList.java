import java.util.Random;
import java.util.ArrayList;
public class day06_Work随机点名器ArrayList {
	public static void main(String[] args) {
		ArrayList<name> ls=new ArrayList<name>();
		addName(ls);
		randomName(ls);
	}
	//随机点名
	public static void randomName(ArrayList<name> ls) {
		int r=new Random().nextInt(ls.size());
		System.out.println(ls.get(r).getName());
	}
	//添加名字
	public static void addName(ArrayList<name> ls) {
		name n1=new name("张三");
		name n2=new name("李四");
		name n3=new name("王五");
		ls.add(n1);
		ls.add(n2);
		ls.add(n3);
	}
	//创建一个存放名字的类
	public static class name{
		String name;
		public name() {
			super();
		}
		public name(String name) {
			super();
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String toString() {
			return "幸运的学生是"+name;
		}
	}
}
