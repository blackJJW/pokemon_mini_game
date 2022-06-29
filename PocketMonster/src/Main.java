import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("안녕하세요. 트레이너님!\n당신의 이름을 알려주세요🎃🎃");
		
		// 이름 사용자로부터 받고 저장
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		
		Player player = new Player(userName,"트레이너","무",100,100,50,30,10);
		player.welcome();
	}

}
