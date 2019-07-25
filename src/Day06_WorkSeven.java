import java.util.ArrayList;
import java.util.Iterator;
public class Day06_WorkSeven {
	public static void main(String[]args) {
		/**定义一个员工类Employee，包含三个属性姓名、工号、工资，创建三个员工对象存入ArrayList集合中，并遍历输出。*/
		ArrayList<Employee> arr=new ArrayList<Day06_WorkSeven.Employee>();
		Employee e1=new Employee("张三",13,4399);
		Employee e2=new Employee("李四",14,6777);
		Employee e3=new Employee("王五",15,55555);
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		for(Iterator<Employee> i=arr.iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}
	public static class Employee{
		String name;
		int job;
		double money;
		public Employee() {
			super();
		}
		public Employee(String a,int b,double c) {
			this.name=a;
			this.job=b;
			this.money=c;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getJob() {
			return job;
		}
		public void setJob(int job) {
			this.job = job;
		}
		public double getMoney() {
			return money;
		}
		public void setMoney(double money) {
			this.money = money;
		}
		public String toString() {
			return "Employee [name=" + name + ", job=" + job + ", money=" + money + "]";
		}
	}
}
