
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;


public class Pokemon extends Character{
		
		static boolean flag = false;
	
	public Pokemon(String name, String belong) {
		super();
		this.name = name;
		this.belong = belong;
			
	}
	
	public void attack(Pokemon myPokemon, Pokemon enemyPokemon) {
		HashMap mySkill = null;
		HashMap enemySkill = null;
		System.out.println(this.name+ "!!! 너로 정했다!!!\n");
		if (myPokemon.kind.equals("포켓몬(피카츄)")) {
			mySkill = Pikachu.pikachuSkill();
		} else if(myPokemon.kind.equals("포켓몬(이상해씨)")) {
			mySkill = Bulbasaur.Skill();
		} else if(myPokemon.kind.equals("포켓몬(꼬부기)")) {
			mySkill = Squirtle.Skill();
		} else if(myPokemon.kind.equals("포켓몬(파이리)")) {
			mySkill = Squirtle.Skill();
		}
	
		if(enemyPokemon.kind.equals("포켓몬(피카츄)")) {
			enemySkill=Pikachu.pikachuSkill();
		} else if(enemyPokemon.kind.equals("포켓몬(이상해씨)")) {
			enemySkill = Bulbasaur.Skill();
		} else if(enemyPokemon.kind.equals("포켓몬(꼬부기)")) {
			enemySkill = Squirtle.Skill();
		} else if(enemyPokemon.kind.equals("포켓몬(파이리)")) {
			enemySkill = Squirtle.Skill();
		}
	
		List<String> mySkillName = new ArrayList<>(mySkill.keySet());
		List<Integer> mySkillDamage = new ArrayList<>(mySkill.values());
		
		List<String> enemySkillName = new ArrayList<>(enemySkill.keySet());
		List<Integer> enemySkillDamage = new ArrayList<>(enemySkill.values());
		
	// 둘 중에 하나가 0 이하가 될 때까지
		
		while(enemyPokemon.hp> 0 && this.hp>0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("*** 어떤 공격을 하시겠습니까? *** \n");
			for (int i = 0; i < mySkillName.size(); i++) {
				System.out.printf((i+1)+". "+mySkillName.get(i)+" ");
			}
			
			int att1 = sc.nextInt() -1;
			
			if(mySkillName.contains(mySkillName.get(att1))) {
				int damage = mySkillDamage.get(att1) - enemyPokemon.defense;
				enemyPokemon.hp = enemyPokemon.hp - damage;
				if(enemyPokemon.hp <0) {
					enemyPokemon.hp = 0;
				}
				System.out.printf(myPokemon.name +"!!! " + mySkillName.get(att1) +"!!!\n");
				System.out.printf(myPokemon.name + "가 " + enemyPokemon.name + "에게 " + damage + "만큼의 데미지를 주었습니다.\n");
				System.out.println(enemyPokemon.name + "의 남은 체력은 " + enemyPokemon.hp + "입니다.\n");
				
				Random rand = new Random();
				int randIndex = rand.nextInt(3);
				String com = enemySkillName.get(randIndex);
				System.out.println(enemyPokemon.name + "!!! " + myPokemon.name+ "에게 " +com + "!!!");
				
				if(enemySkillName.contains(com)) {
					int endamage = enemySkillDamage.get(randIndex) - this.defense;
					this.hp = this.hp - endamage;
					if(this.hp <0) {
						this.hp = 0;
					}
					System.out.printf(myPokemon.name + "는 " + enemyPokemon.name + "에게 " + endamage + "만큼의 피해를 입었다!\n");
					System.out.println(myPokemon.name + "의 남은 체력은 " + this.hp + "입니다.\n");
				}
				
												
			}
			
			
				else {
				System.out.println("다시입력해주세요.");}
			if(enemyPokemon.hp == 0 && this.hp == 0) {
				System.out.println("무승부!!");
			}else if(enemyPokemon.hp == 0) {
				
				System.out.println(enemyPokemon.name + "가(이) 쓰러졌습니다. " + myPokemon.name + "가(이) 승리하였습니다!");
				if(flag==true) {
				Player.badge++;
				System.out.println("뱃지를 획득하였습니다.!! 나의 뱃지 : " + Player.badge + "개");
				flag=false;
				}
				
			}else if(this.hp == 0) {
				System.out.println(myPokemon.name + "가(이) 쓰러졌습니다. " + enemyPokemon.name + "가(이) 승리하였습니다!");
			}
	}


}
}
