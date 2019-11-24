package scheduler;

public class TaxiRenter {
	private TaxiBase taxibase;
	private int num;
	public TaxiRenter(TaxiBase taxibase) {
		 this.taxibase=taxibase;
		 
	}
	public void run() {
		while(num<6) {
			taxibase.Go();
			num++;
		}
	}

}
