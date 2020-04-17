package controller;

interface Character {
	
	
	public void move();
	
	//return ints are cool downs
	public int useAbilityOne();
	public int useAbilityTwo();
	
	//not sure about needing a third
	public int useAbilityThree();
	
	public int useSuperAbility();
	
	//returns the angle
	public double aim();
	public void attack();
	
	//not sure about this one
	public void useItem();
	
}
