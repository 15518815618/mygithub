package Main;
import scheduler.*;
import car.*;
import factory.*;

public class Main {
	public static void main(String[] args) {
		TaxiBase taxiBase=new TaxiBase();
		TaxiProvider taxiProvider=new TaxiProvider(taxiBase);
		TaxiRenter taxiRenter=new TaxiRenter(taxiBase);
		new Thread(taxiProvider).start();
		new Thread(taxiRenter).start();
	}

}
