package JUnit;

public class RetencionHacienda {
	
	static public double seLlevan(double premio) {
		
		double dinero = 0;
		
		if(premio >= 12450 && premio <= 20200) {
			dinero = premio * 0.0950;
		} else if(premio > 20200 && premio <= 35200) {
			dinero = premio * 0.12;
		} else if(premio > 35200 && premio <= 60000) {
			dinero = premio * 0.15;
		} else if(premio > 60000 && premio <= 300000) {
			dinero = premio * 0.2250;
		} else if(premio > 300000) {
			dinero = premio * 0.2450;
		}
		
		return dinero;
	}

}
