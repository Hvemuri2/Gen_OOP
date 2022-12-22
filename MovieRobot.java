public abstract class MovieRobot extends Robot {

    String catchphrase;

    /**
     * constructor 
     * this constructor calls on the super class while also initialised another instance variable 'catchPhrase'
     * @param serialNumber
     * @param flies
     * @param autonomous
     * @param teleported
     * @param catchphrase
     */

    MovieRobot(int serialNumber, boolean flies, boolean autonomous, boolean teleported,String catchphrase) {
        super(serialNumber, flies, autonomous, teleported);
        this.catchphrase = catchphrase;
    }

    /**
     * this is an overloaded constructor that initialises the catchprase to null by default
     * @param serialNumber
     * @param flies
     * @param autonomous
     * @param teleported
     */
    MovieRobot(int serialNumber, boolean flies, boolean autonomous, boolean teleported) {
        super(serialNumber, flies, autonomous, teleported);
        this.catchphrase = null;
    }

    /**
     * this is an abstract method that gets implemented later
     * @return a boolean 
     */
    public abstract boolean canSpeak();

    /**
     * Overrides the super constructor
     * @return a String that contains all the capabilities after calling the 
     * super method getCapabilities() with an extra capability canSpeak if true. 
     * 
     */
    @Override
    public String getCapabilities(){
        String capabilities = super.getCapabilities();
        if(canSpeak()&&!capabilities.equals("")){
            capabilities += " canSpeak";
        }
        else if(canSpeak()&&capabilities.equals("")){
            capabilities += "canSpeak";
        }
        return capabilities;
    }

    /**
     * @return a String containg the robots ID and capabilities in a specified format.
     */
    @Override
    public String toString(){
        String s = getCapabilities();
        if(canSpeak()){
            s += " \""+catchphrase+"\"";
        }
        return "ID: "+getSerialNumber()+", Capabilities: "+s;
    }


}
