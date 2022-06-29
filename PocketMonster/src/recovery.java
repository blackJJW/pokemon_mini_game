public class recovery extends Player{
	
	public recovery(String name, String kind, String belong, int maxHp, int hp, int offense, int defense, int mana) {
		super(name, kind, belong,maxHp, hp, offense, defense, mana);
		// TODO Auto-generated constructor stub
	}
	public void recover(Pokemon obj) {
		// 몬스터 값 파라미터로 받기..?
		System.out.println("안녕하세요! 여기는 회복센터입니다.");
		System.out.println("하루동안 회복을 합니다.");
		// 회복 센터 가면 완충 ..?
		int ori_hp = obj.hp;
		
		obj.hp = obj.maxHp;
		
		System.out.println(ori_hp+"에서"+obj.hp+"로 회복!");
		
		dateTime.hour = 3;
		
		choiceMove();
		
	}
}