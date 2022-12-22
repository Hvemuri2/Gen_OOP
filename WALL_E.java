public class WALL_E extends MovieRobot{
    /**
     * constructor, calls on the overloaded super constructor and sets catchphrase to null
     * @param serialNumber
     * @param flies
     * @param autonomous
     * @param teleported
     * @param catchphrase
     */
    WALL_E(int serialNumber, boolean flies, boolean autonomous, boolean teleported, String catchphrase) {
        super(serialNumber, flies, autonomous, teleported);
    }

    /** this is an Overriden method 
     * @return a boolean indiacting if the robot can Speak
     */
    @Override
    public boolean canSpeak() {
        return false;
    }

    /**
     * @return a boolean indiacting if the robot can Clean
     */
    public boolean canClean(){
        return true;
    }

    /**
     * @return a String representing the capabilities of this robot
     * it calls on the super method getCapabilities but it adds an extra
     * capability canClean
     */
    @Override
    public String getCapabilities(){
        String capabilities = super.getCapabilities();
        if(capabilities.equals("")){
            capabilities = "canClean";
        }
        else{
            capabilities += " canClean";
        }
        return capabilities;
    }

    /**
     * @return a String representing the ID and capabilities of the this robot in a specified format
     * this method does not have an implementation of its own, it just calls on the super method 'toString' 
     */
    @Override
    public String toString(){
        return super.toString();
    }
}
