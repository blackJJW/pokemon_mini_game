

import java.util.HashMap;

public class Bulbasaur extends Pokemon{
	public Bulbasaur(String name, String belong) {
		super(name, belong);
		this.hp = 35;
		this.offense = 55;
		this.defense = 40;
		this.kind = "포켓몬(이상해씨)";
		this.mana = 0;
	}
	
	// 덩굴채찍 damage = 45
	// 잎날가르기 damage = 50
	// 솔라빔 damage = 60
	public static HashMap Skill() {
		//	ArrayList <HashMap<String, Integer>> skillList = new ArrayList <HashMap<String, Integer>>();
		HashMap<String, Integer> skill = new HashMap<String, Integer>();
		skill.put("덩굴채찍", 45);
		skill.put("입날가르기", 48);
		skill.put("솔라빔", 75);
	
		//	skillList.add(skill);
	
		return skill;
	}

}