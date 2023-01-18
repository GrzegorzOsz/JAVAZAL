package devices;

public class Application {
    public Double appPrice;
    public String appName;
    public Double appVersion;
    public Application(String appName,Double appPrice,Double appVersion){
        this.appName=appName;
        this.appPrice=appPrice;
        this.appVersion=appVersion;
    }
    public String getAppName() {
        return appName;
    }

    public Double getAppPrice() {
        return appPrice;
    }
    public String toString() {
        return  "Nazwa: "+ appName +" Wersja: "+ appVersion +" Cena: "+ appPrice;
    }
}
