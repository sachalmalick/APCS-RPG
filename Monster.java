public class Warrior{

    private int hp;
    private int strength;
    private int defense;
    private double attack;

    public Warrior(String newName){
	hp = 150;
	strength = 20 + (int)(Math.random() * (45)););
	defense = 20;
	attack = 1;
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

    public int attack(Warrior war){
	int damage;
	damage = (strength * attack) - war.getDefense();
	return damage;
    }

}