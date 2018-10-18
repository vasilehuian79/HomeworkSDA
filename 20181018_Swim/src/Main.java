public class Main {
    public static void main(String[] args) {
        Swim swimmer = new Swimmer("Vasile", "Huian");
        Walk wlk=new Walker("Vasile","Huian");
        swimmer.swim();
        ((Swimmer) swimmer).breathe();
        wlk.walk();
        ((Walker) wlk).breathe();
    }
}


