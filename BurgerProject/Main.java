public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sassuage", 3.56, "white");
        hamburger.addHamburgerAddition1("Tomato", 2.56);
        hamburger.addHamburgerAddition2("Lettuce", 1.56);
        hamburger.itemizeHamburger();
    }
}
