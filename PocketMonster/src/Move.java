/*
import java.util.Scanner;

public class Move {
	Shop Store = new Shop();
	
	
	public void moveWhere() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("어디로 이동하시겠습니까?\n이동,회복센터,상점");
		String where = sc.nextLine();
		movement(where);
	}
	
	public void movement(String where){
		if(where.equals("회복센터")) {System.out.println("회복센터로 이동하였습니다.");}
		else if(where.equals("이동")){
			int RanGold = (int) (Math.random()*10);
			Item.gold += 5+RanGold;
			System.out.println(Item.gold);
			moveWhere();
		System.out.println("이동하였습니다.");
		int RanMove = (int) (Math.random()*10);
		if(RanMove<=8) {System.out.println("아무 일도 일어나지 않았습니다");}
		else {System.out.println("관장님과 조우하였습니다!");}
		}else if(where.equals("상점")) {
			Store.ShopGuide();}
		
	}
	
}
	
*/