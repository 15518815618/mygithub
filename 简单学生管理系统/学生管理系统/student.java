package ѧ������ϵͳ;

public class student {
	public static void main(String[] args) {
		StringBuffer information=new StringBuffer();
		System.out.println("1.���----------");
		add(information);
		System.out.println("2.�޸�----------");
		alter(information);
		System.out.println("3.ɾ��----------");
		delete(information);
		
	}
	public static void add(StringBuffer information) {
		
		information.append("�α��� 184804354 ��ϵ�绰 155*****618");
		System.out.println("��ӽ��Ϊ��"+information);
		information.insert(30,"AYNU");
		System.out.println("���Ϊ��"+information);
		
	}
	public static void alter(StringBuffer information) {
		information.replace(31,34,"  ������ͨ��ѧ");
		System.out.println("�޸�Ϊ:"+information);
	}
	
	public static void delete(StringBuffer information) {
		
		information.delete(4,13);
		System.out.println("ɾ����Ϊ:"+information);
	}

}
