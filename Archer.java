/*
  Team GitRekt - Sachal Malick, Vincent Alykin, Christopher Sherling
  APCS1 pd5
  HW29 -- Ye Olde Role Playing Game, Improved
  2015-11-12
*/


public class Archer extends Character{

    private String name;

    public Archer(String newName){
	// Sets attributes
	super(newName);
	hp = 75;
	strength = 200;
	defense = 25;
	attack = 0.5;
    }
	
    // public  boolean isAlive(){
    // 	return hp > 0; // If the "hp" is above 0, return true;
    // }

    // public int getDefense(){
    // 	return defense; // returns the defense
    // }

    // public String getName(){
    // 	return name; // returns the name
    // }

    // public void lowerHP(int dmg){
    // 	hp -= dmg; // returns the "hp" after the "damage" has been applied
    // }

    // public int attack(Monster mon){
    // 	int damage;
    // 	damage = (int)(strength * attack) - mon.getDefense(); // sets damage
    // 	mon.lowerHP(damage);
    // 	return damage;
    // }
	


}