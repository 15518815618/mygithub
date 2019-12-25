package bankSystem;
import java.util.*;
import java.io.*;

public class bank {
	
	int account;
	private static User user;
	
	
	
	public static void main(String[] args){
		bank b=new bank();
		try {
		b.login();
		b.operate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void operate(){
		bank b=new bank();
		while(true){
			System.out.println("��������Ҫ���еĲ��������س���������");
			System.out.println("���  1"+"\t"+"ȡ�� 2"+"\t"+"��ʾ���3"+"\t"+"�˳�  0");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			if("1".equals(s)||"2".equals(s)){
				int num=0;
				try{
					System.out.println("���������:");
					num=Integer.parseInt(in.nextLine());
				}catch(Exception e){
					System.out.println("���������:");
					continue;
				}
				switch(s) {
				case "1":
					b.income(num);
					break;
				case "2":
					b.takeOut(num);
					break;
				}
			} else if("3".contentEquals(s)) {
				b.show();
				
				
			}else if("0".equals(s)) {
				System.out.println("�˳�ϵͳ��");
				return;
				
			}else
				System.out.println("������0~3֮�������ѡ����ز�����");
		}
	}
	public void login() throws Exception{
		DBUtils dbutil = DBUtils.getInstance();
		System.out.println("��ӭ������������");
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("���������п��ţ�");
			String cardId=in.nextLine();
			System.out.println("���������п����룺");
			String cardPwd=in.nextLine();
			try {
			user=dbutil.getUser(cardId);}catch(Exception e) {
				e.printStackTrace();
			}
			if(dbutil.getUsers().containsKey(cardId)&&user.getCardPwd().equals(cardPwd)) {
				System.out.println("��½�ɹ�����ӭ"+user.getUserName()+"����");
				
				FileWriter writer=new FileWriter("information.txt");
				writer.write(cardId+" ");
				writer.write(cardPwd+" ");
				writer.close();
				
				
				break;
			}
			else
				System.out.println("���Ż��������");
			continue;
			
		}
		
	}
	public void income(int num) {
		account=user.getAccount()+num;
		user.setAccount(account);
		System.out.println("������"+num+"Ԫ�ɹ���");
	}
	public void takeOut(int num) {
		if(user.getAccount() >=num){
		account =user.getAccount()-num;
		user.setAccount(account);
		
		System.out.println("ȡ�����"+num+"Ԫ�ɹ���");
		}else
			System.out.println("���㣬ȡ��ʧ�ܣ�");
	}
	public void show() {
		account = user.getAccount();
		System.out.println("�˻����Ϊ"+account+"Ԫ");
		
	}

}
