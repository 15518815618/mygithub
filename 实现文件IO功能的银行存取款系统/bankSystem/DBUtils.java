package bankSystem;
import java.util.*;
import java.io.*;
//import bankSystem.User;

public class DBUtils {
	private static DBUtils instance = null;
	private HashMap<String,User>users=new HashMap<String,User>();
	
	
	private DBUtils()throws Exception{
		FileReader reader=new FileReader("allInformation.txt");
		BufferedReader br=new BufferedReader(reader);
		String str;
		while((str=br.readLine())!=null) {
			String str1=str;
			String[] strArry=str1.split(" ");
			for(int i=0;i<strArry.length;i++) {
				String CardId=strArry[i];
				String CardPwd=strArry[i];
				String UserName=strArry[i];
				String Call=strArry[i];
				String Account=strArry[i];
				int w=Integer.parseInt(Account);
				
				User u1=new User();
				u1.setCardId(CardId);
				u1.setCardPwd(CardPwd);
				u1.setUserName(UserName);
				u1.setCall(Call);
				u1.setAccount(w);
				users.put(u1.getCardId(),u1);
				
			}
			
			
		}
			
	}
	//懒汉式单例模式 在这里主要功能是做唯一的一次实例化
	public static DBUtils getInstance(){
		if (instance==null){
			synchronized(DBUtils.class){
				if(instance==null) 
					try {
			     instance=new DBUtils();}catch(Exception e) {
			    	 e.printStackTrace();
			     }
			}
		}return instance;
	}
	public User getUser(String cardId){
		User user=(User)users.get(cardId);
		return user;
	}
	public HashMap<String,User>getUsers(){
		return users;
	}
		

}



