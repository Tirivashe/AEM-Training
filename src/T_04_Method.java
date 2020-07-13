
public class T_04_Method {
	
	public static void main(String[] args) {
		System.out.print(ringAlarm(6, false));		
		
	}
	
	public static String ringAlarm(int day, boolean vacation){
		if(day >=1 && day <=5){
			if(vacation == true) return "10:00";
			else return "07:00";
		}
		if(day == 0 || day == 6){
			if(vacation == true) return "OFF";
			else return "10:00";
		}
		return "Invalid Inputs";
	}

}
