package factory;
import company.chinaUnicom;
import company.company;
public class UnicomFactory implements factory{
	public company produceCompany() {
		return new chinaUnicom();
	}
}
