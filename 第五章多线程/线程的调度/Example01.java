class MaxPriority implements Runnable
{
	public void run(){
	for(int i=0;i<10;i++){
	System.out.println(Thread.currentThread().getName()+"�������"+i);
	}
	}
}
class MinPriority implements Runnable
{
	public void run(){
	for(int i=0;i<10;i++){
	System.out.println(Thread.currentThread().getName()+"�������"+i);
	}
	}
}
public class Example01
{
	public static void main(String[] args){
	Thread maxpriority=new Thread(new MaxPriority(),"�߳����ȼ��ߵ�");
	Thread minpriority=new Thread(new MinPriority(),"�߳����ȼ��͵�");
	minpriority.setPriority(Thread.MIN_PRIORITY);
	maxpriority.setPriority(20);//Thread.MAX_PRIORITY
	minpriority.start();
	maxpriority.start();
	}
}