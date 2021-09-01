public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Cheese & Bacon", "white", 6);
        super.addHamburgerAddition1("Chips", 2.50);
        super.addHamburgerAddition2("Cola", 1.50);
        super.addHamburgerAddition3("Onion Rings", 5);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Adding an extra item is not allowed.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Adding an extra item is not allowed.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Adding an extra item is not allowed.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Adding an extra item is not allowed.");
    }
}