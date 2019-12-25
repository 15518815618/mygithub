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
			System.out.println("请输入您要进行的操作，按回车键结束！");
			System.out.println("存款  1"+"\t"+"取款 2"+"\t"+"显示余额3"+"\t"+"退出  0");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			if("1".equals(s)||"2".equals(s)){
				int num=0;
				try{
					System.out.println("输入存入金额:");
					num=Integer.parseInt(in.nextLine());
				}catch(Exception e){
					System.out.println("输入金额错误:");
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
				System.out.println("退出系统！");
				return;
				
			}else
				System.out.println("请输入0~3之间的数字选择相关操作！");
		}
	}
	public void login() throws Exception{
		DBUtils dbutil = DBUtils.getInstance();
		System.out.println("欢迎进入网上银行");
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("请输入银行卡号：");
			String cardId=in.nextLine();
			System.out.println("请输入银行卡密码：");
			String cardPwd=in.nextLine();
			try {
			user=dbutil.getUser(cardId);}catch(Exception e) {
				e.printStackTrace();
			}
			if(dbutil.getUsers().containsKey(cardId)&&user.getCardPwd().equals(cardPwd)) {
				System.out.println("登陆成功！欢迎"+user.getUserName()+"先生");
				
				FileWriter writer=new FileWriter("information.txt");
				writer.write(cardId+" ");
				writer.write(cardPwd+" ");
				writer.close();
				
				
				break;
			}
			else
				System.out.println("卡号或密码错误！");
			continue;
			
		}
		
	}
	public void income(int num) {
		account=user.getAccount()+num;
		user.setAccount(account);
		System.out.println("存入金额"+num+"元成功！");
	}
	public void takeOut(int num) {
		if(user.getAccount() >=num){
		account =user.getAccount()-num;
		user.setAccount(account);
		
		System.out.println("取出金额"+num+"元成功！");
		}else
			System.out.println("余额不足，取款失败！");
	}
	public void show() {
		account = user.getAccount();
		System.out.println("账户余额为"+account+"元");
		
	}

}
