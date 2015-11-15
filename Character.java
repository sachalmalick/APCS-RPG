/*
  Team GitRekt - Sachal Malick, Vincent Alykin, Christopher Sherling
  APCS1 pd5
  HW30 -- Ye Olde Role Playing Game Expanded
  2015-11-15
*/

public class Character{

    protected String name;
    protected int hp;
    protected int strength;
    protected int defense;
    protected double attack;

    public Character(){
	// Sets attributes;
	name = "Leroy";
	hp = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }

    public Character(String newName){
	this();
	name = newName;
    }
	
    public  boolean isAlive(){
	return hp > 0; // If the "hp" is above 0, return true;
    }

    public String getName(){
	return name;
    }

    public int getDefense(){
	return defense; // returns the defense
    }

    public void lowerHP(int dmg){
	hp -= dmg; // returns the "hp" after the "damage" has been applied
    }

    public int attack(Character foe){
	int damage;
	damage = (int)(strength * attack) - foe.getDefense(); // sets damage
	foe.lowerHP(damage);
	return damage;
    }

    public void normalize() {
		
	defense = 40;
	attack = 0.4;
		
    }
	
    public void specialize() {
	defense-=10;
	attack+=1;
    }
    
    public String about(Character dude){
	String info = "";
	info += "Name: " + name + "\n";
	info += "Class: " + dude + "\n";
	info += "hp: " + hp + "\n";
	info += "Strength: " + strength + "\n";
	info += "Defense: " + defense + "\n";
	info += "Attack: " + attack + "\n";
	return info;
   }

}