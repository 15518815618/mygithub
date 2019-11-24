package 学生管理系统;

public class student {
	public static void main(String[] args) {
		StringBuffer information=new StringBuffer();
		System.out.println("1.添加----------");
		add(information);
		System.out.println("2.修改----------");
		alter(information);
		System.out.println("3.删除----------");
		delete(information);
		
	}
	public static void add(StringBuffer information) {
		
		information.append("段宾宾 184804354 联系电话 155*****618");
		System.out.println("添加结果为："+information);
		information.insert(30,"AYNU");
		System.out.println("添加为："+information);
		
	}
	public static void alter(StringBuffer information) {
		information.replace(31,34,"  北京交通大学");
		System.out.println("修改为:"+information);
	}
	
	public static void delete(StringBuffer information) {
		
		information.delete(4,13);
		System.out.println("删除后为:"+information);
	}

}
