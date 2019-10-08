package bin;
//import bin;
public class Main 
{
	public static void main(String[] args){
	TVFactory fa=new TVFactory();
	HisenseTV his=new HisenseTV();
	HaierTV hai=new HaierTV();
	fa.produce(hai);
	fa.produce(his);
	}
}