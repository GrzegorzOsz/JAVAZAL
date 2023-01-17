package devices;

import com.company.Human;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;

public class Phone extends device {

    private static final String DEFAULT_VERSION_NAME = "V3.25";
    private static final String DEFAULT_SERVER_NAME = "wsb.gda.pl";
    private static final String DEFAULT_PROTOCOL_NAME = "https";

    public Phone(String producer, String model, int YearOfProd, double value) {
        super(model, producer, YearOfProd, value);
    }

    public void sell(Human buyer, Human seller, Double price) {
       if (seller.phone == this) {
            if (buyer.cash > price) {
                buyer.phone = this;
                seller.phone = null;
                seller.cash += price;
                buyer.cash -= price;
                System.out.println(producer +" "+ model  + " Sprzedany dla"+" "+buyer);
            } else {
                System.out.println("Brak środków");
            }
        } else {
            System.out.println("Nie ma czym handlować");
        }
    }

    public void turnOn() {
        System.out.println("Wciskam przycisk");
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName,DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName,version,DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName,String version, String server) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL_NAME, server, 443, appName + "-" + version);
            this.installAnApp(url);

        } catch (MalformedURLException e) {
            System.out.println("nie ma takiego adresu");
            e.printStackTrace();
        }
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(URL url) {
        System.out.println("instaluje apklikacje: " + url.getFile() + ", z serwera: "+url);
    }
}