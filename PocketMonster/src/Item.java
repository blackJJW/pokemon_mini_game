
public class Item extends Player{
	public Item(String name, String kind, String belong, int maxHp, int hp, int offense, int defense, int mana) {
		super(name, kind, belong, maxHp, hp, offense, defense, mana);
		// TODO Auto-generated constructor stub
	}
	static int gold = 150;
	static int pocketball= 0;
	
	
	public void getGold(int gottenGold) {
		System.out.println(gottenGold+"골드를 얻었다!");
		this.gold += gottenGold;
		System.out.println("현재 소지금"+this.gold+"골드");
	}
	
	
	

	public void ShowItems() {
		
		System.out.println("현재 보유 중인 아이템은 "+this.gold+"골드와 포켓몬볼 "+this.pocketball+"개 입니다.\n현재 배지는"+badge+"/3개 입니다.");
			super.choiceMove();
	}

}
