class Example03
{
	public static void main(String[] args){
	Student stu=new Student();
	stu.setName("��Χǽ");
	stu.setAge(-30);
	//stu.name="�";
	//stu.age=-45;
	stu.introduce();
	
	System.out.println(stu.getName());
	System.out.println(stu.getAge());
	}
}