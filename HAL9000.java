public class HAL9000 extends MovieRobot {
    /**
     * constructor
     * it calls on the super constructor with a fixed catchphrase
     * @param serialNumber
     * @param flies
     * @param autonomous
     * @param teleported
     * @param catchphrase
     */
    HAL9000(int serialNumber, boolean flies, boolean autonomous, boolean teleported, String catchphrase) {
        super(serialNumber, true, autonomous, teleported, "I can't let you do that Dave.");
    }

    /**
     * @return a boolean indiacting if the robot canSpeak
     */
    @Override
    public boolean canSpeak() {
        return true;
    }


    /**
     * @return a space seperated String representing the robots capabilities 
     * it does not implement anything, it just calls on the super method from movieRobot.
     */ 
    public String getCapabilities(){
        return super.getCapabilities();
    }

    /**
     * @return a String representing the ID and capabilities of the this robot in a specified format
     * this method does not have an implementation of its own, it just calls on the super method 'toString'
     */
    public String toString(){
        return super.toString();
    }
}
