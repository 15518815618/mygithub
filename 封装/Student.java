class Student
{
	private String name;
	 private int age;
	 void setName(String stuName)
	{name=stuName;
	 }
	  String getName(){
	 return name;
	 }
	 int getAge(){
	 return age;}

	 void setAge(int stuAge)
	 {
		 if(stuAge<=0){
		 System.out.println("���䲻�Ϸ�");
		 }
		 else
		 age=stuAge;
	 }
	void introduce(){
	System.out.println("��Һã��ҽ�"+ name+ "�ҽ���"+age+"����");
	}
}