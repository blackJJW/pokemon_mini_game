
import java.util.HashMap;

public class Squirtle extends Pokemon{
	public Squirtle(String name, String belong) {
		super(name, belong);
		this.hp = 35;
		this.offense = 55;
		this.defense = 40;
		this.kind = "포켓몬(꼬부기)";
		this.mana = 0;
	}
	
	// 몸동박치기 damage = 45
	// 물대포 damage = 50
	// 하이드로펌프 damage = 60
	public static HashMap Skill() {
		//	ArrayList <HashMap<String, Integer>> skillList = new ArrayList <HashMap<String, Integer>>();
		HashMap<String, Integer> skill = new HashMap<String, Integer>();
		skill.put("몸통박치기", 45);
		skill.put("물대포", 50);
		skill.put("하이드로펌프", 60);
	
		//	skillList.add(skill);
	
		return skill;
	}

}