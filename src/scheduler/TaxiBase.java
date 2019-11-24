package scheduler;
import car.*;
import factory.*;
import utility.*;
public class TaxiBase {
	private car[] cars=new car[10];
	private int inPos,outPos,count=0;
	public TaxiBase() {
		factory CarFactory=(factory) XMLUtility.getBean();
		for(int i=0;i<10;i++) {
			cars[i]=CarFactory.producecar();
		}
	}
	public synchronized void come() {
		try {
			if(count==cars.length) {
				this.wait();
			}
			System.out.println("����"+inPos+"--"+cars[inPos].toString()+"���");
			inPos++;
			if(inPos==cars.length)
				inPos=0;
			count++;
			Thread.sleep(2000);
			this.notify();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void Go() {
		try {
			if(count==0)
				this.wait();
			System.out.println("����"+outPos+"--"+cars[outPos].toString()+"����  �Ʒ���"+cars[outPos].fei());
			if(outPos==cars.length)
				outPos=0;
			count--;
			Thread.sleep(2000);
			this.notify();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
