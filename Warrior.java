public class Warrior{

    private String name;
    private int hp;
    private int strength;
    private int defense;
    private double attack;

    public Warrior(String newName){
	name = newName;
	hp = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }

    public  boolean isAlive(){
	return hp > 0;
    }

    public int getDefense(){
	return defense;
    }

    public String getName(){
	return name;
    }

    public void lowerHP(int dmg){
	hp -= dmg;
    }

    public int attack(Monster mon){
	int damage;
	damage = (strength * attack) - mon.getDefense();
	return damage;
    }

}