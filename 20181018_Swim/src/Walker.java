public class Walker implements Walk,Breathe{
    String firstNameW;
    String lastNameW;

    @Override
    public void walk() {
        System.out.println("Plimba ursul");
    }

    @Override
    public void breathe() {
        System.out.println("Mai respira,lasa fumatul");
    }

    public Walker (String firstName, String lastName) {
        this.firstNameW = firstName;
        this.lastNameW = lastName;
    }


}

