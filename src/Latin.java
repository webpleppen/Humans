public class Latin extends Human {
    public Latin(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Salve, nomen mihi est " + name + ".");
    }
}
