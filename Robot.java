public class Robot {
    /**
     * this is the parent class for all the classes in this project
     * this provide code for general abilities a robot has, describing what a robot is.
     * this class does not go into details, we address that in the sub-classes.
     * overriding some methods and adding a few new methods.
     */
    private final int serialNumber;
    private boolean flies;
    private boolean autonomous;
    private boolean teleported;

    /**
     * constructor for this class
     * @param serialNumber it is a String representing the robots ID
     * @param flies is a boolean returning if the robot can fly.
     * @param autonomous is a boolean returning if the robot is automatic.
     * @param teleported is a boolean returning if the robot is teleoperated.
     */
    Robot(int serialNumber, boolean flies, boolean autonomous, boolean teleported){
        this.autonomous = autonomous;
        this.teleported = teleported;
        this.flies = flies;
        this.serialNumber = serialNumber;
    }

    /**
     * setter for all the capabilities
     * @param files is a boolean returning if the robot can fly.
     * @param autonomous is a boolean returning if the robot is automatic.
     * @param teleported is a boolean returning if the robot is teleoperated.
     */
    public void setCapabilities(boolean files, boolean autonomous, boolean teleported){
        this.autonomous = autonomous;
        this.flies = files;
        this.teleported = teleported;
    }

    /**
     * getter for this robots serialnumber
     * @return an integer indicating the serialNumber
     */
    public int getSerialNumber(){
        return this.serialNumber;
    }

    /**
     * @return a boolean indicating if this robot can fly
     */
    public boolean canFly(){
        return flies;
    }

    /**
     * @return a boolean indicating if this robot is automatic
     */
    public boolean isAutonomous(){
        return autonomous;
    }

    /**
     * @return a boolean indicating if this robot is teleported.
     */
    public boolean isTeleoperated(){
        return teleported;
    }

    /**
     * @return a space seperated String containing all the capabilities of
     * the robot.
     */
    public String getCapabilities(){
        String capabilities = "";
        if(canFly()){
            if(!isAutonomous()&&!isTeleoperated()){
                capabilities+="canFly";
            }
            else{
                capabilities+="canFly ";
            }
        }
        if(isAutonomous()){
            if(!isTeleoperated()){
                capabilities+="isAutonomous";
            }
            else {
                capabilities+="isAutonomous ";
            }
        }
        if(isTeleoperated()){
            capabilities+="isTeleoperated";
        }
        return capabilities;
    }

    /**
     * @return a String containg the robots ID and capabilities in a specified format.
     */
    public String toString(){
        return "ID: "+getSerialNumber()+", Capabilities: "+getCapabilities();
    }

}
