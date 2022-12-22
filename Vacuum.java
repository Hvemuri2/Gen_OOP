public class Vacuum extends Robot {

    /**
     *constructor for this class
     * @param serialNumber
     * calls on the super constructor with specified params excluding the serialNumber
     * which is the param of this constructor.
     */
    Vacuum(int serialNumber){
        super(serialNumber, false, true, false);
    }

    /**
     * @return a fixed boolean 'true' as a vacuum can clean
     */
    public boolean canClean(){
        return true;
    }

    /**
     * @return a fixed boolean 'false' as a vacuum cant fly 
     */
    @Override
    public boolean canFly(){
        return false;
    }

    /**
     * @return a fixed boolean 'true' 
     */
    @Override
    public boolean isAutonomous(){
        return true;
    }

    /**
     * @return a fixed boolean 'false' 
     */
    @Override
    public boolean isTeleoperated(){
        return false;
    }

    /**
     * an Overriden method 
     * @return a space seperated String containing all the robots capabilities
     * after adding the extra capability of this class(vacuum)
     */
    @Override
    public String getCapabilities(){
        String capabilities = super.getCapabilities();
        capabilities += " canClean";
        return capabilities;
    }
}
