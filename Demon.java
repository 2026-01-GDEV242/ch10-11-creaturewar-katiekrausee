

/**
 * The Demon class implements a base class for the Demonic classes with the following additions
 * 
 * @author Katie Krause
 * @version 4/27/25
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Demon -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Demon and the human class is responsible for
     * return a Demon object with values in the appropriate range
     * 
     */
    public Demon(int max_str, int max_hp)
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(max_str, max_hp);
          
    }
    
    
    /**
     * OVERRIDE attack - all demons have a 5% chance of doing additional 50 points of damage
     * @return famage from the attack
     */
    
    public int attack()
    {
        int tempDamage;
        
        tempDamage = super.attack();
        if(Randomizer.nextInt(20) == 1) {
        tempDamage = tempDamage +50; // demonic strength applied
    }
    return tempDamage;
    }
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
