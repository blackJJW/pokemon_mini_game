public class dateTime {
	// 시간 흐름 및 날짜 class
	// date class 사용하면 현실 시간 필요
	
	static int day = 1;
	static int hour = 0;
	
	public void timeFlow(int flow) {
		if(hour >= 3) {
			day += 1;
			hour = 0;
		}else {
			hour += flow;
		}
	}

}