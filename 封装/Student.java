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
		 System.out.println("年龄不合法");
		 }
		 else
		 age=stuAge;
	 }
	void introduce(){
	System.out.println("大家好，我叫"+ name+ "我今年"+age+"岁了");
	}
}