package System;

public class TelAccountSystem {
	public static void main(String[] args) {

		TelcomUser telcomuser=new TelcomUser("15518815618");
		telcomuser.generatecommunicateRecord();
		telcomuser.printDetails();
	}

}
