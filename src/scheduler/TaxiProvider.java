package scheduler;

public class TaxiProvider implements Runnable {
	private TaxiBase taxibase;
	private int num;

	public TaxiProvider(TaxiBase taxibase) {
		this.taxibase = taxibase;
	}

	public void run() {
		while (num < 6) {
			taxibase.come();
			num++;
		}
	}
}