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

    private String itemizeHamburger;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(name + " hamburger on a white roll with" + meat + ", price is : " + price);
    }

    public double itemizeHamburger(){
        System.out.println("The total cost of a hamburger is : " + this.price);
        return this.price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        if(addition1Name.isEmpty()){
            System.out.println("No extra addition has been made into hamburger.");
        }
        else{
            System.out.println("Added" + addition1Name + " for an extra : " + addition1Price);
            this.price += addition1Price;
        }
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        if(addition1Name.isEmpty()){
            System.out.println("No extra addition has been made into hamburger.");
        }
        else{
            System.out.println("Added" + addition2Name + " for an extra : " + addition2Price);
            this.price += addition2Price;
        }
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        if(addition1Name.isEmpty()){
            System.out.println("No extra addition has been made into hamburger.");
        }
        else{
            System.out.println("Added" + addition3Name + " for an extra : " + addition3Price);
            this.price += addition3Price;
        }
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        if(addition1Name.isEmpty()){
            System.out.println("No extra addition has been made into hamburger.");
        }
        else{
            System.out.println("Added" + addition4Name + " for an extra : " + addition4Price);
            this.price += addition4Price;
        }
    }


}
