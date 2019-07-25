import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Day08_WorkEigth {
	public static void main(String[]args) {
		/**超市管理系统案例*/
		ArrayList<Merchandise> arr=new ArrayList<Merchandise>();
		homePage();
		initialization(arr);
		choose(arr);
	}
private static void initialization(ArrayList<Merchandise> arr) {
		//初始化商品
		Merchandise s0=new Merchandise(0,"巧克力",17,99.8);
		Merchandise s1=new Merchandise(1,"鸡腿",15,5.5);
		Merchandise s2=new Merchandise(2,"辣条",60,3.5);
		arr.add(s0);arr.add(s1);arr.add(s2);
	}
private static void choose(ArrayList<Merchandise> arr) {
		//选择方法
		for(;;) {
			switch(new Scanner(System.in).nextInt()) {
				case 1:
						cargoList(arr);
						break;
				case 2:
						addMerchandise(arr);
						break;
				case 3:
						removeMerchandise(arr);
						break;
				case 4:
						modificationMerchandise(arr);
						break;
				case 5:
						exit();
				default:
					System.out.println("输入的值无效,请重新输入");
					break;
			}
		}
	}
private static void exit() {
	// 关闭程序
	System.out.print("正在退出系统,请稍后------");
	System.exit(0);
}
private static void modificationMerchandise(ArrayList<Merchandise> arr) {
	//修改商品
	System.out.println("请输入要修改的商品ID");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	for(int i=0;i<arr.size();i++) {
		if(x==arr.get(i).ID) {
			System.out.println("查询到此ID,请输入新的ID数值");
			arr.get(i).setID(sc.nextInt());
			System.out.println("请输入新的商品名称");
			arr.get(i).setName(sc.next());
			System.out.println("请输入新的商品数量");
			arr.get(i).setCount(sc.nextInt());
			System.out.println("请输入新的商品价格");
			arr.get(i).setMoney(sc.nextDouble());
			System.out.println(">>数据修改完成>>>请选择新的功能");
			homePage();
		}else {
			
			System.out.println("输入的数值"+x+"不存在商品ID中!");
			System.out.println(">>>>>>><<<<<<<");
			homePage();
		}
	}
}

private static void removeMerchandise(ArrayList<Merchandise> arr) {
	//删除商品
	System.out.println("请输入要删除商品的ID:");
	Scanner sc=new Scanner(System.in);
	int name=sc.nextInt();
	for(int i=0;i<arr.size();i++) {
		Merchandise m=arr.get(i);
		if(m.ID==name) {
			System.out.println("发现有相同数据---正在删除中>>>删除成功~~");
			arr.remove(i);
			homePage();
			return;
		}
	}
	System.out.println("没有该数据!"+"\n"+">>>>>>>");
	homePage();
}
private static void addMerchandise(ArrayList<Merchandise> arr) {
	//添加新商品
		Scanner sc = new Scanner(System.in);
		Merchandise m = new Merchandise();
		System.out.println("请输入商品ID");
		m.ID=sc.nextInt();
		System.out.println("请输入要添加的商品名称:");
		m.name = sc.next();
		System.out.println("请输入商品数量:");
		m.count = sc.nextInt();
		System.out.println("请输入商品价格:");
		m.money = sc.nextDouble();
		arr.add(m);
		System.out.println("正在添加信息,添加成功~");
		homePage();
}
private static void cargoList(ArrayList<Merchandise> arr) {
	// 打印商品库存清单
	System.out.println("\t"+"商品库存清单");
	System.out.println("商品ID"+"\t"+"商品名称"+"\t"+"商品数量"+"\t"+"商品价格");
	for(Iterator<Merchandise> it=arr.iterator();it.hasNext();) {
		Merchandise m=it.next();
		System.out.println(m.ID+"\t"+m.name+"\t"+m.count+"\t"+m.money);
	}
	System.out.println(">>>>>>>");
	homePage();
}
private static void homePage() {
	System.out.println("\t" + "欢迎光临shop" + "\t");
	System.out.println("1:货物清单");
	System.out.println("2:添加新货物");
	System.out.println("3:删除货物");
	System.out.println("4:修改货物");
	System.out.println("5退出系统");
	System.out.print("请输入您要操作的功能序号:");
}
public static class Merchandise{
	String name;
	int count;
	double money;
	int ID;
	public Merchandise() {
		super();
	}
	public Merchandise(int id,String name,int count,double money) {
		super();
		this.ID=id;
		this.name=name;
		this.count=count;
		this.money=money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}
}
