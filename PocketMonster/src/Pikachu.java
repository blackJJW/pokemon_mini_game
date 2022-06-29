import java.util.ArrayList;
import java.util.HashMap;

public class Pikachu extends Pokemon{
	public Pikachu(String name, String belong) {
		super(name, belong);
		this.maxHp = 35;
		this.hp = 35;
		this.offense = 55;
		this.defense = 40;
		this.kind = "포켓몬(피카츄)";
		this.mana = 0;
	}
	
		// 전기쇼크 damage = 45
		// 전광석화 damage = 50
		// 10만볼트 damage = 60
	public static HashMap pikachuSkill() {
//		ArrayList <HashMap<String, Integer>> skillList = new ArrayList <HashMap<String, Integer>>();
		HashMap<String, Integer> skill = new HashMap<String, Integer>();
		skill.put("전기쇼크", 45);
		skill.put("전광석화", 50);
		skill.put("10만볼트", 60);
		
//		skillList.add(skill);
		
		return skill;
	}
	
		

}