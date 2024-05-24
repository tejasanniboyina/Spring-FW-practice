package com.teja.di.ot;

public class AnotherStudent {
	MathCheat cheat;
	
	public void setMathCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	
	public void startCheating() {
		cheat.mathCheat();
	}
}
