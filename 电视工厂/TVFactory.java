package cn.bin;
public class TVFactory
{
	public static TV produceTV(String brand){
	if(brand.equals("Haier"))
		return new HaierTV();
	else if(brand.equals("Hisense"))
		return new HisenseTV();
	else 
		return null;

	}
}