
import java.util.HashMap;

public class Charmander extends Pokemon{
	public Charmander(String name, String belong) {
		super(name, belong);
		this.hp = 39;
		this.offense = 52;
		this.defense = 43;
		this.kind = "포켓몬(파이리)";
		this.mana = 0;
	}
	
	// 할퀴기 damage = 45
	// 불꽃세례 damage = 50
	// 화염방사 damage = 60
	public static HashMap Skill() {
		//	ArrayList <HashMap<String, Integer>> skillList = new ArrayList <HashMap<String, Integer>>();
		HashMap<String, Integer> skill = new HashMap<String, Integer>();
		skill.put("할퀴기", 45);
		skill.put("불꽃세례", 50);
		skill.put("화염방사", 60);
	
		//	skillList.add(skill);
	
		return skill;
	}
}