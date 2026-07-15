package Day_5 ;
class Laptop_details {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand = "Lenovo";
        l1.model = 12;
        l1.ram = 8;
        l1.memory = 256;
        l1.installedApp("brave");
        l1.installedApp("chrome");
        l1.installedApp("excel");
        l1.installedApp("whatsapp");
        l1.installedApp("word");


    }
}
class Laptop {
    String brand;
    int model;
    int ram;
    int memory;

    public void installedApp(String appName) {
        System.out.println(appName + " "+  "Installed");
        if (appName != null) {
            ram = ram - 1;
            System.out.println(appName + " "+ "is installed in" +" "+ brand +" "+ model +" "+ "ram available :" + " "+ ram);
        }

    }
}
