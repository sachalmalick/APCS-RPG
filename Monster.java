public class Monster{

	// Creates the instance variables
    private int hp;
    private int strength;
    private int defense;
    private double attack;
    private String name;
    
    public Monster () {
		// Sets the attributes 
    	name = "Sachzilla";
    	hp = 150;
    	strength = 20 + (int)(Math.random() * (45));
    	defense = 20;
    	attack = 1;
    }
	
    public Monster(String newName){
    name = newName; // The name is the inputted names.
	hp = 150;
	strength = 20 + (int)(Math.random() * (45));
	defense = 20;
	attack = 1;
    }

    public  boolean isAlive(){
	return hp > 0; // If the "hp" is above 0, return true;
    }

    public int getDefense(){
	return defense; // returns the defense
    }

    public String getName(){
	return name; // returns  the name
    }

    public void lowerHP(int dmg){
	hp -= dmg; // returns the "hp" after the "damage" has been applied
    }

    public int attack(Warrior war){
	int damage;
	damage = (int)(strength * attack) - war.getDefense();
	return damage;
    }

}