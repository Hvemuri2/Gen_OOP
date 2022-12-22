public class ModelB9 extends MovieRobot {

    /**
     * constructor 
     * it calls on the super constructor with a fixed catchphrase
     * @param serialNumber this is an integer 
     * @param flies this is a boolean
     * @param autonomous this is a boolean 
     * @param teleported this is a boolean
     * @param catchphrase this is a String 
     */
    ModelB9(int serialNumber, boolean flies, boolean autonomous, boolean teleported, String catchphrase) {
        super(serialNumber, flies, autonomous, teleported,  "Danger, Will Robinson!");
    }

    /**
     * @return a boolean representing if the robot can speak 
     */
    @Override
    public boolean canSpeak() {
        return true;
    }

    /**
     * @return @return a boolean representing if the robot can flail.
     */
    public boolean canFlail(){
        return true;
    }

    /**
     * @return a String representing the capabilities of this robot
     * it calls on the super method getCapabilities but it adds an extra
     * capability canFlail
     */
    @Override
    public String getCapabilities(){
        String capabilities = super.getCapabilities();
        capabilities += " canFlail";
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
  