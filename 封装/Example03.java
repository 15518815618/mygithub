class Example03
{
	public static void main(String[] args){
	Student stu=new Student();
	stu.setName("ÀîÎ§Ç½");
	stu.setAge(-30);
	//stu.name="Àî·¼";
	//stu.age=-45;
	stu.introduce();
	
	System.out.println(stu.getName());
	System.out.println(stu.getAge());
	}
}