public class Warrior{

    private String name;
    private int hp;
    private int strength;
    private int defense;
    private double attack;

    public Warrior(String newName){
	// Sets attributes
	name = newName;
	hp = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }
	
    public  boolean isAlive(){
	return hp > 0; // If the "hp" is above 0, return true;
    }

    public int getDefense(){
	return defense; // returns the defense
    }

    public String getName(){
	return name; // returns the name
    }

    public void lowerHP(int dmg){
	hp -= dmg; // returns the "hp" after the "damage" has been applied
    }

    public int attack(Monster mon){
	int damage;
	damage = (int)(strength * attack) - mon.getDefense(); // sets damage
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

}