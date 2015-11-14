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
	strength = 75;
	defense = 30;
	attack = 0.3;
	
    }
	
    public void lowerHP(int dmg){
	double x = Math.random();
	if (x < 1.0f/4.0f)
	    System.out.println("Evaded"); // returns the "hp" after the "damage" has been applied
	else
	    hp -= dmg;
    }

    public int attack(Monster mon){
    	int damage;
    	damage = (int)(strength * attack) - mon.getDefense(); // sets damag
    	mon.lowerHP(damage);
	// confuse(mon);
    	return damage;
    }

    // public void confuse(Monster mon){
    // 	double x = Math.random();
    // 	if (x < 1.0f/2.0f){ //Confuse monster
    // 	    mon.confuse();
    // 	    System.out.println("Monster Confused!");
    // 	}
    // 	else
    // 	    mon.setStrength(100);
    // }
    

    public void normalize() {
		
    	defense = 25;
    	attack = .3;
    		
        }
    	
        public void specialize() {
    	defense-=10;
    	attack+=1;
        }



}