package System;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TelcomUser {
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicateRecords;

	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicateRecords = new StringBuffer();
	}

	void generatecommunicateRecord() {
		int recordNum = new Random().nextInt(10);
		for (int i = 0; i < recordNum; i++) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.HOUR, -new Random().nextInt(10));
			long timeStart = cal.getTimeInMillis();
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.callTo = getCallToPhoneNumber();
			this.communicateRecords
					.append(this.phoneNumber + "," + timeStart + "," + timeEnd + "," + this.callTo + ";");

		}

	}

	private String getCallToPhoneNumber() {
		return "1551881" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10));

	}

	private String AccountFee(long timeStart, long timeEnd) {
		double feePerMinute = 0.2;
		int minutes = Math.round((timeEnd -timeStart ) / 60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
	}

	void printDetails() {
		String allCommunicateRecord = this.communicateRecords.toString();
		String[] recordArray = allCommunicateRecord.split(";");
		for (int i = 0; i < recordArray.length; i++) {
			String[] recordFileds = recordArray[i].split(",");
			System.out.println("-------通话记录--------");
			System.out.println("主叫：" + recordFileds[0]);
			System.out.println("被叫：" + recordFileds[3]);
			Date timeStart = new Date(Long.parseLong(recordFileds[1]));
			Date timeEnd = new Date(Long.parseLong(recordFileds[2]));
			DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
			System.out.println("通话开始时间：" + simpleDateFormat.format(timeStart));
			System.out.println("通话结束时间：" + simpleDateFormat.format(timeEnd));
			System.out.println("计费：" + AccountFee(Long.parseLong(recordFileds[1]), Long.parseLong(recordFileds[2])) + "元");

		}

	}

}