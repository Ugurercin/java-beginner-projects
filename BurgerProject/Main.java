public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "sasuage", "white", 3.56);
        hamburger.addHamburgerAddition1("Lettuce", 2.20);
        hamburger.addHamburgerAddition2("Ketchup", 1);
        hamburger.addHamburgerAddition3("Mayo", 2);
        hamburger.addHamburgerAddition4("tomato", 2.5);
        hamburger.itemizeHamburger();
    }
}
