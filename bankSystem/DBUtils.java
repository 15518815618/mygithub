package bankSystem;
import java.util.*;
//import bankSystem.User;

public class DBUtils {
	private static DBUtils instance = null;
	private HashMap<String,User>users=new HashMap<String,User>();
	
	private DBUtils(){
	User u1=new User();
	u1.setCardId("00001");
	u1.setCardPwd("123456");
	u1.setUserName("安阳师");
	u1.setCall("15518815688");
	u1.setAccount(10000);
	users.put(u1.getCardId(),u1);
	
	User u2=new User();
	u2.setCardId("00002");
	u2.setCardPwd("654321");
	u2.setUserName("范学院");
	u2.setCall("15518815666");
	u2.setAccount(4000);
	users.put(u2.getCardId(),u2);
	
	User u3=new User();
	u3.setCardId("00003");
	u3.setCardPwd("456789");
	u3.setUserName("河南省");
	u3.setCall("15518811234");
	u3.setAccount(1000);
	users.put(u3.getCardId(),u3);
	}
	//懒汉式单例模式 在这里主要功能是做唯一的一次实例化
	public static DBUtils getInstance(){
		if (instance==null){
			synchronized(DBUtils.class){
				if(instance==null)
			     instance=new DBUtils();
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



