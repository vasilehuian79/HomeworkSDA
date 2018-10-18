public class Truck extends Vehicle{
    String destinationType;
    int gear;
    int speed;
    @Override
    public void printState(){
        System.out.println("Truck destination is:"+destinationType +"_gear:"+getGear()+"_speed:"+getSpeed());
    }
    public Truck (String destinationType,int gear,int speed){
        super(gear,speed);
        this.destinationType=destinationType;
    }
}


