package day12.exam01;

public class BigBurgerSet {
	private BigBurger bigBurger;
	private Coke coke;
	private FrenchFried frenchfried;
	
	public BigBurgerSet(BigBurger bigburger, Coke coke, FrenchFried frenchfried) {
		this.bigBurger = bigburger;
		this.coke = coke;
		this.frenchfried = frenchfried;
	}

	public BigBurger getBigBurger() {
		return bigBurger;
	}

	public void setBigBurger(BigBurger bigBurger) {
		this.bigBurger = bigBurger;
	}

	public Coke getCoke() {
		return coke;
	}

	public void setCoke(Coke coke) {
		this.coke = coke;
	}

	public FrenchFried getFrenchfried() {
		return frenchfried;
	}

	public void setFrenchfried(FrenchFried frenchfried) {
		this.frenchfried = frenchfried;
	}
}
