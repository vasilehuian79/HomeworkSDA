public class Swimmer implements Swim, Breathe {
    String firstName;
    String lastName;

    @Override
    public void swim() {
        System.out.println("Trage tare si te scoti");
    }

    @Override
    public void breathe() {
        System.out.println("Nu respira sub apa");
    }

    public Swimmer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}



