package step4;
//공통
public class Gobook extends Character {

	//메모리 초기화 생성자 만들기
	public Gobook() {
		hp=40;
		energy=50;
		System.out.println("꼬북이가 생성되었습니다.");
		printInfo();
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		energy+=15;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		energy+=10;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		energy -=30;
		hp+=15;
		levelUp();		
		return checkEnergy();
	}

	@Override
	public boolean train() {
		// TODO Auto-generated method stub
		energy -=20;
		hp+=30;
		levelUp();		
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		if(50 <= hp) {
			level++;
			hp-=50;
		}
	}

}
