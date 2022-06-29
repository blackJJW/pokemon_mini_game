// 시간 지나는 Thread
public class timeThread implements Runnable {
	// 시간
	// dateTime time = new dateTime();
	
	@Override
	public void run() {
		for (int i = 0; i<4; i++) {
			try {
				// System.out.println("잠 자는 중 zzZ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				// Thread.currentThread().interrupt();
				return;
			}finally {
				
				//Thread.State state =
				// Player.th.getState();
			}
			
		}
		System.out.printf("🌞아침이 밝았습니다🌞 :)\n오늘은 탐험을 시작한지 %d일입니다.\n",dateTime.day);
		
	 }
	
}