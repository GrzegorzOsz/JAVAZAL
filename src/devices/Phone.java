package devices;

import com.company.Human;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.*;

public class Phone extends device {

    private static final String DEFAULT_VERSION_NAME = "V3.25";
    private static final String DEFAULT_SERVER_NAME = "wsb.gda.pl";
    private static final String DEFAULT_PROTOCOL_NAME = "https";
    public Set<Application> listOfApp = new HashSet<Application>();
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
    public void buyAndInstall(Human human, Application app) {
        if (human.cash > app.appPrice) {
            System.out.println(app.appName + " Zainstalowana " + "Koszt aplikacji "+ app.appPrice+" PLN");
            this.listOfApp.add(app);
            human.cash -= app.appPrice;
        } else {
            System.out.println("Niewystarczające środki");
        }
    }
    public void checkApp(Application application){
        if (listOfApp.contains(application)) {
            System.out.println((application.appName + " Zainstalowana"));
        } else{
            System.out.println("Brak zainstalowenej aplikacji");
        }
    }
    public void checkAppWithName(String appName) {
        for (Application application : this.listOfApp) {
            if (application.appName.matches(appName)) {
                System.out.println("aplikacja: " + application.appName + " Zainstalowana");
                return;
            }
        } System.out.println(appName +" nie jest zainstalowana");
    }

    public void showFreeApp () {
        for (Application application : this.listOfApp) {
            if (application.appPrice == 0.0) {
                System.out.println(application);
            }
        }
    }

    public void installedAppValue () {
        Double sum = 0.0;
        for (Application application : this.listOfApp) {
            sum += application.appPrice;
        }
        System.out.println("wartość aplikacji na telefonie wynosi: " + sum);
    }

    public void showAppAlphabetically () {
        Application[] x = listOfApp.toArray(new Application[listOfApp.size()]);
        Arrays.sort(x, Comparator.comparing(Application::getAppName));
        System.out.println(Arrays.toString(x));
    }

    public void showAppPriceAsc () {
        Application[] x = listOfApp.toArray(new Application[listOfApp.size()]);
        Arrays.sort(x, Comparator.comparing(Application::getAppPrice));
        System.out.println(Arrays.toString(x));
    }
}