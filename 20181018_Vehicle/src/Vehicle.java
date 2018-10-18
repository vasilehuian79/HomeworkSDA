public abstract class Vehicle {
    private int gear;
    private int speed;
    public Vehicle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }

    public abstract void printState();
    public void changeGear(int newGear){//setter
        this.gear=newGear;
    }
    public void speedUp(int increment){//

        this.speed=speed+increment;
    }
    public void applyBrakes(int decrement){

        this.speed=speed-decrement;
    }
    public int getGear(){//getter
        return this.gear;
    }
    public int getSpeed(){
        return this.speed;
    }

}

