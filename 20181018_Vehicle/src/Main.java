public class Main {
    public static void main(String[] args) {


        Truck  truck = new Truck("Transport marfa",10,5);

        truck.changeGear(2);
        truck.printState();
        truck.speedUp(3);
        truck.printState();
        truck.applyBrakes(1);
        truck.printState();
        Bus bus = new Bus("Transport public",4,7);
        bus.changeGear(1);
        bus.printState();
        bus.speedUp(4);
        bus.printState();
        bus.applyBrakes(3);
        bus.printState();



    }
}

