public class Bus extends Vehicle{
    String destinationType;
    int gear;
    int speed;
    @Override
    public void printState(){
        System.out.println("Truck destination is:"+destinationType +"_gear:"+getGear()+"_speed:"+getSpeed());
    }
    public Bus (String destinationType,int gear,int speed){
        super(gear,speed);
        this.destinationType=destinationType;
        System.out.println("Bus destination is:"+destinationType +"_gear:"+gear+"_speed:"+speed);
    }
}

