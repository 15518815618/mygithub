class MaxPriority implements Runnable
{
	public void run(){
	for(int i=0;i<10;i++){
	System.out.println(Thread.currentThread().getName()+"正在输出"+i);
	}
	}
}
class MinPriority implements Runnable
{
	public void run(){
	for(int i=0;i<10;i++){
	System.out.println(Thread.currentThread().getName()+"正在输出"+i);
	}
	}
}
public class Example01
{
	public static void main(String[] args){
	Thread maxpriority=new Thread(new MaxPriority(),"线程优先级高的");
	Thread minpriority=new Thread(new MinPriority(),"线程优先级低的");
	minpriority.setPriority(Thread.MIN_PRIORITY);
	maxpriority.setPriority(20);//Thread.MAX_PRIORITY
	minpriority.start();
	maxpriority.start();
	}
}