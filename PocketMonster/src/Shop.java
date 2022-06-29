import java.util.Scanner;

public class Shop extends Player {
	
public Shop(String name, String kind, String belong, int maxHp, int hp, int offense, int defense, int mana) {
		super(name, kind, belong,maxHp,hp, offense, defense, mana);
		// TODO Auto-generated constructor stub
	}


//	public Shop(Player player) {
//		// TODO Auto-generated constructor stub
//		System.out.println(player.name);
//	}

	Item 아이템 = new Item(name,kind,belong,maxHp, hp,offense,defense,mana);
	Scanner sc = new Scanner(System.in);
	public void ShopGuide() {
		
		System.out.println("어서오세요 무엇을 도와드릴까요?");
		System.out.println("1. 포켓몬볼 구매하기\n2. 돌아가기");
		
		int ShopSelect = sc.nextInt();
		if(ShopSelect==1) {
			Shopping();
		}else if(ShopSelect==2) {
		System.out.println("상점을 나갑니다.");
		//choiceMove();
		super.choiceMove();
		
		
		
		}
	}
	
	
	
	public void Shopping() {
		
			System.out.println("포켓몬볼은 100골드 입니다. 구매하시겠습니까?\n보유 금액: "
		+아이템.gold+"골드\n보유 포켓볼: "+아이템.pocketball+"개\n1. 예 2. 아니오");
			int ShopSelect2= sc.nextInt();
			if(ShopSelect2==1) {buyBall();
			Shopping();			
			}else if(ShopSelect2==2) {ShopGuide();
		}
	}
	
	
	public void buyBall() {
		if(아이템.gold>=100) {
			System.out.println("포켓몬볼을 구매하였다!");
			아이템.gold -= 100; //가격은임의로 설정
			아이템.pocketball ++;
			//System.out.println("현재 소지금 "+아이템.gold+"골드");
			//System.out.println("보유 포켓몬볼 "+아이템.pocketball+"개");
			}
			else{System.out.println("보유 중인 골드가 부족합니다. 현재 소지금: "+아이템.gold);}
		
	}




}