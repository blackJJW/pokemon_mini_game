import java.util.Random;
import java.util.Scanner;

public class Player extends Character{
	
	Random rd = new Random();
	static int badge = 0;
	public Player(String name, String kind, String belong, int maxHp, int hp, int offense, int defense, int mana) {
		super();
		this.name = name;
		this.kind = kind;
		this.belong = belong;
		this.maxHp = maxHp;
		this.hp = hp;
		this.offense = offense;
		this.defense = defense;
		this.mana = mana;
		
	}
	
	Pokemon player1Pikachu = new Pikachu("피카츄", this.name);
	
	dateTime time = new dateTime();
	
	public void welcome() {
		System.out.printf("안녕하세요 %s 트레이너님!\n여기는 태초마을입니다.",this.name);
		System.out.printf("관장에게 도전해서 배찌를 받아보세요!");
		choiceMove();
	}
	
	
	
	
	public void order(String type, String performer, String target) {
		
		if (type.equals("공격")) {
			System.out.println("Player : " + performer + "!!! " + target +"에게 공격!!! ");
		}else {
			System.out.println("기다려");
		}
	}
	
	public void MoveSel() {
		if(dateTime.hour >= 3) {
			Runnable runnable = new timeThread();
			Thread th = new Thread(runnable);
			th.start();
			
			dateTime.hour = 0;
			dateTime.day +=1;
			
			System.out.println("\n🌙밤이 되었습니다.🌙");
			System.out.println("잠자는 중...\n");
			
			
			int ranRec = 5 + rd.nextInt(10);
			player1Pikachu.hp += ranRec;
			System.out.println(ranRec+"만큼 회복합니다.");
			if(player1Pikachu.hp > player1Pikachu.maxHp) {
				player1Pikachu.hp = player1Pikachu.maxHp;}
			
			// run 추가
			for(int i = 0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			MoveSel();
			
		}
		System.out.println("1. 탐색하기 2. 마을로 돌아가기");
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		if(userChoice==1) {
			explore();
			}
		else if(userChoice==2) {System.out.println("마을로 돌아갑니다.");
			choiceMove();}
	
			
		}
	
	
	
	// 확률 이동 함수
	public void explore() {
		System.out.println("앞으로 꾸물꾸물 이동!");
		
		Random rd = new Random();
		int ranMove = rd.nextInt(10);
		
		if(ranMove<=4) {
			System.out.println("아무 것도 찾지 못했다...");
			int rangold = 10+rd.nextInt(10);
			System.out.println("\n"+rangold+"G를 얻었다.");
			Item.gold += rangold;
			time.timeFlow(1);
			// System.out.println(time.hour+" "+time.day);
			MoveSel();
		}else if(ranMove<=8) {
			System.out.println("야생의 포켓몬과 조우하였습니다!");
			WildPokemon wildPokemon = new WildPokemon();
			int a = rd.nextInt(3);
			
			switch(a) {
			case 0:
				System.out.println(wildPokemon.wild1Pikachu.name + " 이(가) 등장 \n");
				Combat c = new Combat(player1Pikachu, wildPokemon.wild1Pikachu);
				break;
			case 1:
				System.out.println(wildPokemon.wild1bulbasaur.name + " 이(가) 등장 \n");
				Combat d = new Combat(player1Pikachu, wildPokemon.wild1bulbasaur);
				break;
			case 2:
				System.out.println(wildPokemon.wild1squirtle.name + " 이(가) 등장 \n");
				Combat e = new Combat(player1Pikachu, wildPokemon.wild1squirtle);
				break;
			}
			
			time.timeFlow(2);
			// System.out.println(time.hour+" "+time.day);
			// 로켓단이랑 싸우는거 구현
			MoveSel(); //나중에 관장과의 전투/도망치기 또는 승리/패배에 따라 choiceMove() 넣으면 될듯.
		}
		else {
			Runnable runnable = new timeThread();
			Thread th = new Thread(runnable);
			
			String[] roket = {
					"너희는 누구지?","\n","우리가 누구냐고 물으신다면","대답해 드리는게 인지상정","이 세계의 파괴를 막기 위해","이 세계의 평화를 지키기 위해","사랑과 진실, 어둠을 뿌리고 다니는","포켓몬의 감초, 귀염둥이 악당","난, 로사","난, 로이","우주를 뛰어다니는 우리 로켓단들에겐","아름다운 미래, 밝은 내일이 기다리고 있다.","난 나옹이다옹!","마자~용!"
			};
			
			for(int i=0; i<roket.length;i++) {
				try {
					Thread.sleep(750);
					System.out.println(roket[i]);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			Item.gold -= 50;
			if(Item.gold<=0) {Item.gold =0;}
			System.out.println("로켓단에게 골드를 뺐겼습니다!\n남은 돈이 "+Item.gold+"G가 되었습니다!");
			}
		MoveSel();
		
	}
	
	
	// 이동 선택 함수
	public void choiceMove () {
		if(dateTime.hour >= 3) {
			Runnable runnable = new timeThread();
			Thread th = new Thread(runnable);
			th.start();
			
			dateTime.hour = 0;
			dateTime.day +=1;
			
			System.out.println("\n🌙밤이 되었습니다.🌙");
			System.out.println("잠자는 중\n");
					Random rd = new Random();
			int ranRec = 5 + rd.nextInt(10);
			player1Pikachu.hp += ranRec;
			if(player1Pikachu.hp > player1Pikachu.maxHp) {
				player1Pikachu.hp = player1Pikachu.maxHp;}
			
			// run 추가
			for(int i = 0;i<5;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			choiceMove();
			
		}
		
		// 이동 선택
		System.out.println("\n 마을 광장에 왔습니다. 어디로 이동하시겠습니까?");
		System.out.println("1. 숲으로   2. 회복센터  3. 상점 4. 인벤토리 5.관장에게 도전하기");
		
		// 유저의 선택 받기
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		
		
		// 조건
		if(userChoice == 1) {System.out.println("숲으로 이동합니다.");
			MoveSel();
		}else if(userChoice == 2) {System.out.println("안녕하세요! 여기는 회복센터입니다.");
		//회복센터 기능 추가하기
		recovery recover = new recovery(name,kind,belong,maxHp,hp,offense,defense,mana);
		recover.recover(player1Pikachu);
		}
		else if(userChoice == 3) {
			Shop Store = new Shop(name,kind,belong,maxHp, hp,offense,defense,mana);
			Store.ShopGuide();
		}else if(userChoice==4) {
			Item 아이템 = new Item(name,kind,belong,maxHp, hp,offense,defense,mana);
			아이템.ShowItems();
		}else if(userChoice==5) {
			System.out.println("관장님과 배틀을 시작합니다!");
			Pokemon.flag = true;
			if(badge == 0) {
				System.out.println("비키니시티 체육관 관장 영가이에게 승부를 걸었다!\n영가이: 꼬북이 너로 정했다!\n");
				GymLeader enemyGymLeader1 = new GymLeader("비키니시티 체육관 관장", "인간(체육관 관장)", "비키니시티");
				Combat c = new Combat(player1Pikachu, enemyGymLeader1.enemyGymLeader1Squirtle);
				choiceMove();
			}else if(badge == 1) {
				System.out.println("휴먼시티 체육관 관장 후선박에게 승부를 걸었다!\n후선박: 이상해씨 너로 정했다!\n");
				GymLeader enemyGymLeader1 = new GymLeader("휴먼시티 체육관 관장", "인간(체육관 관장)","휴먼시티");
				Combat c = new Combat(player1Pikachu, enemyGymLeader1.enemyGymLeader1Bulbasaur);
				choiceMove();
			}else if(badge == 2) {
				System.out.println("상록시티 체육관 관장 우진정에게 승부를 걸었다!\n우진정: 파이리 너로 정했다!\n");
				GymLeader enemyGymLeader1 = new GymLeader("상록시티 체육관 관장", "인간(체육관 관장)", "상록시티");
				Combat c = new Combat(player1Pikachu, enemyGymLeader1.enemyGymLeader1Charmander);
				
				if(badge==3) {
					System.out.println("승리하였습니다!");
					end();
				}else {choiceMove();}
			}
			else {
				choiceMove();
			}
			//GymLeader enemyGymLeader2 = new GymLeader("휴먼시티 체육관 관장", "인간(체육관 관장)","휴먼시티");
			//GymLeader enemyGymLeader3 = new GymLeader("상록시티 체육관 관장", "인간(체육관 관장)", "상록시티");
			//Combat c = new Combat(player1Pikachu, enemyGymLeader1.enemyGymLeader1Pikachu);
			//System.out.printf("%s");
			//대충 관장에게 도전하는 걸로 간다는 명령어
			}
		
		else {
			System.out.println("잘못된 입력입니다.");
			choiceMove();
		}
	}
	public void end() {
		System.out.println("게임이 종료되었습니다.");
		System.out.println("클리어 타임: "+dateTime.day+"일 "+dateTime.hour+"시간\n\n");
		Runnable runnable = new timeThread();
		Thread th = new Thread(runnable);

		String[] maker = {"제공/배급 : 휴먼교육센터","어드바이저 : 배성원 강사님","<만든 사람들>","정진우","박선후","황채은","이가영"};
		System.out.println("--------------------- Ending ---------------------");
		System.out.printf("미니 프로젝트 기간 : 2022년 6월 22일 부터 2022년 6월 23일까지...\n\n");
		// System.out.println(maker[0]);
		for(int i=0; i<7;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(maker[i]);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				System.out.println("");
			}
		}
		
		System.out.println("Thank you!");
		
		System.exit(0);
		
	}
	
	}
	
	
