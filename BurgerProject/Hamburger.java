public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerCost = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " + " price is " + this.price + "$");
        if(this.addition1Name != null){
            hamburgerCost += addition1Price;
            System.out.println(addition1Name + " added as an extra ingredient for a price of : " + addition1Price + "$");
        }
        if(this.addition2Name != null){
            hamburgerCost += addition2Price;
            System.out.println(addition2Name + " added as an extra ingredient for a price of : " + addition2Price + "$");
        }
        if(this.addition3Name != null){
            hamburgerCost += addition3Price;
            System.out.println(addition3Name + " added as an extra ingredient for a price of : " + addition3Price + "$");
        }
        if(this.addition4Name != null){
            hamburgerCost += addition4Price;
            System.out.println(addition4Name + " added as an extra ingredient for a price of : " + addition4Price + "$");
        }
        System.out.println("Total burger cost it : " + hamburgerCost + "$");
        return hamburgerCost;
    }

}
