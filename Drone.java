public class Drone extends Robot {

    /**
     *constructor for this class
     * @param serialNumber
     * calls on the super constructor with specified params excluding the serialNumber
     * which is the param of this constructor.
     */
    Drone(int serialNumber){
        super(serialNumber, true, false, true);
    }

    /**
     * @return  a fixed boolean 'true'
     */
    @Override
    public boolean canFly(){
        return true;
    }

    /**
     * @return  a fixed boolean 'false'
     */
    @Override
    public boolean isAutonomous(){
        return false;
    }

    /**
     * @return  a fixed boolean 'true'
     */
    @Override
    public boolean isTeleoperated(){
        return true;
    }
}
