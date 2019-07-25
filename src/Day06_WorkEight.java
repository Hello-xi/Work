import java.util.ArrayList;
import java.util.Iterator;
public class Day06_WorkEight {
	public static void main(String[]args) {
		/**8.利用上面的三个案例，分别演示ArrayList集合中的以下常用方法：
	 *  public boolean add(元素类型 e)直接向集合添加元素

	 *  public void add(int index,元素类型 e)在指定索引处向集合添加元素
	 
	 *  public 元素类型 remove(int index)删除指定索引位置的元素
	 
	 *  public 元素类型 set(int index,元素类型 e)修改指定索引位置的元素
	 
	 *  public int size()获取集合长度
	 
	 *  public 元素类型 get(int index)根据指定索引获取集合元素*/
		ArrayList<mySql> arr=new ArrayList<mySql>();
		mySql m1=new mySql("1",1,'1',1);
		mySql m2=new mySql("2",2,'2',2);
		mySql m3=new mySql("3",3,'3',3);
		mySql m4=new mySql("4",4,'4',4);
		mySql m5=new mySql("5",5,'5',5);
		mySql m6=new mySql("6",6,'6',6);
		mySql m7=new mySql("7",7,'7',7);
		arr.add(0, m2);
		arr.add(m2);
		arr.add(m3);
		arr.add(m4);
		arr.add(m5);
		arr.add(m6);
		arr.add(m7);
		for(Iterator<mySql> i=arr.iterator();i.hasNext();) {
			mySql s=i.next();
			System.out.println(s.name+s.age+s.sex+s.money);
		}
		System.out.println("------------------------------");
		arr.remove(6);
		for(Iterator<mySql> i=arr.iterator();i.hasNext();) {
			mySql s=i.next();
			System.out.println(s.name+s.age+s.sex+s.money);
		}
		System.out.println("数组的的长度"+arr.size());
		System.out.println("------------------------------");
		mySql s=arr.get(5);
		System.out.println(s.name+s.age+s.sex+s.money);
		mySql s1=arr.set(5, m1);
		System.out.println(s1.name+s1.age+s1.sex+s1.money);
	}
	public static class mySql{
		String name;
		int age;
		char sex;
		int money;
		public mySql() {
			super();
		}
		public mySql(String a,int b,char c ,int d) {
			this.name=a;
			this.age=b;
			this.sex=c;
			this.money=d;
		}
		public String getName() {
			return name;
		}
		public void setName(String a) {
			this.name=a;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int a) {
			this.age=a;
		}
		public char getSex() {
			return sex;
		}
		public void setSex(char a) {
			this.sex=a;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int a) {
			this.money=a;
		}
	}
}
