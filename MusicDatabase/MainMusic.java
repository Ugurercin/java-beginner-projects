import Model.Datasource;

import javax.xml.crypto.Data;

public class MainMusic {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can not open datasource.");
            return;
        }

        datasource.close();
    }
}
