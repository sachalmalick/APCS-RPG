/*
  Team GitRekt - Sachal Malick, Vincent Alykin, Christopher Sherling
  APCS1 pd5
  HW29 -- Ye Olde Role Playing Game, Improved
  2015-11-12
*/


public class Sachal extends Character{

    private String name;

    public Sachal(String newName){
	// Sets attributes
	super(newName);
	hp = 75;
	strength = 60;
	defense = 30;
	attack = 0.3;
	
    }
	
    public void lowerHP(int dmg){
	double x = Math.random();
	if (x < 1.0f/3.0f)
	    hp = hp; // returns the "hp" after the "damage" has been applied
	else
	    hp -= dmg;
    }

    public int attack(Monster mon){
    	
    	return tryToBeMean(mon);

    }
    
    
    public int tryToBeMean(Monster mon) {
		int s = (int) (Math.random() * 2);
		if (s == 1) {
			return confuse(mon);
		}
		else {
			
			return accidentallRaiseMonstersSelfAstee(mon);
		}
    }
    
    public int accidentallRaiseMonstersSelfAstee(Monster mon) {
    	return 0;
    }
    
    public int confuse (Monster mon) {
    	int damage;
    	damage = (int)(strength * attack) - mon.getDefense(); // sets damage
        mon.lowerHP(damage);
    	return damage;
    }
	
    public void normalize() {
		
    	defense = 25;
    	attack = .3;
    		
        }
    	
        public void specialize() {
    	defense-=10;
    	attack+=1;
        }



}