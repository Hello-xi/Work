import java.util.ArrayList;
import java.util.Iterator;
public class Day06_WorkFive {
	public static void main(String[]args) {
		/**定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
		  A：遍历集合遍历输出。
		  B：求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃。*/
		//创建一个arraylist的集合
		ArrayList<Student> ls=new ArrayList<Student>();
		//创建三个Student对象把数据传进去
		Student s1=new Student("达到",12,'男');
		Student s2=new Student("按时",31,'无');
		Student s3=new Student("发啊",32,'女');
		//把三个对象传到数组里
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		//设置一个角标
		int index=0;
		//创建一个arr数组,数组长度是ls集合和长度
		int arr[]=new int[ls.size()];
		//使用for循环进行遍历,使用arraylist的迭代器功能里面的hasnext()来判断里面是否为空
		for(Iterator<Student> it=ls.iterator();it.hasNext();) {
			//用Student对象s来接受迭代器里面的内容
			Student s=it.next();
			//把s里面的age这个数值传到arr这个数组里面
			arr[index]=s.age;
			//控制角标,是每次角标+1
			index++;
			//打印s这个对象里面的name age sex
			System.out.println(s.name+"\t"+s.age+"\t"+s.sex);
		}
		//把arr里面的一个值赋值给max,防止数值小于0
		int max=arr[0];
		//开始遍历
		for(int i=0;i<arr.length;i++) {
			//进行比较
			if(max<arr[i]) {
				//把大的数值赋值给max
				max=arr[i];
			}
		}
		//使用高级for循环遍历,用student对象的s 遍历arraylist
		for(Student s:ls) {
			//判断s.age和max里面的是否相等,是的话使用setName方法来修改名字
			if(s.getAge()==max) {
				s.setName("sdf");
			}
		}
		System.out.println("------------------------------------");
		//把修改后的数组对象打印出来
		for(Student s:ls) {
			System.out.println(s.name+" "+s.age+" "+s.sex);
		}
	}
	//新建一个Student的class类 用来存放自定的格式的变量
	public static class Student{
		String name;
		int age;
		char sex;
		public Student(){
			super();
		}
		public Student(String a,int b,char c) {
			super();
			this.name=a;
			this.age=b;
			this.sex=c;
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
		public void setAge(int b) {
			this.age=b;
		}
		public char getSex() {
			return sex;
		}
		public void setSex(char c) {
			this.sex=c;
		}
	}
}
