package day10.exam01;

public class OOPExam {
	static void attack(Unit u1, Unit u2) {
		u1.setHp(u1.getHp()-u2.getAttack());
		System.out.println(u1.getName() + "이(가) " + u2.getName() + "에게 공격당해서 체력이 " + u1.getHp() + "이(가) 되었습니다.");
	}
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿");
		Dragoon d1 = new Dragoon("드라군");
		Hydra h1 = new Hydra("히드라");
		
		attack(z1,d1);
	}
}
