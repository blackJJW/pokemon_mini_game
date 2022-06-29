import java.util.Random;

public class GymLeader extends Character{
	public GymLeader(String name, String kind, String belong) {
		super();
		this.name = name;
		this.kind = kind;
		this.belong = belong;
	}
	Pokemon enemyGymLeader1Pikachu = new Pikachu("피카피카츄", this.name);
	Pokemon enemyGymLeader1Bulbasaur = new Bulbasaur("이상이상해씨", this.name);
	Pokemon enemyGymLeader1Squirtle = new Squirtle("꼬북꼬부기", this.name);
	Pokemon enemyGymLeader1Charmander = new Charmander("파이파이리", this.name);
}