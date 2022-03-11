public class Electric extends Pokemon {

//    [v] 4 private variabelen
//    [v] 1 constructor
//    [v] 2 getters
//    [v] 2 setters
//    [] 2 methodes
//    [] 1 override methode

    private boolean hasSalary;
    private boolean thunderStorm;
    private int hoursOfSleep = 0;
    private int wattage = 0;

    public Electric(String name, int level, int healthPoints, String food, String sound, boolean hasSalary, boolean thunderStorm, int hoursOfSleep) {
        super(name, level,healthPoints,food,sound);

        this.hasSalary = hasSalary;
        this.thunderStorm = thunderStorm;
        this.hoursOfSleep = hoursOfSleep;
    }

//    public Electric() {
//        Electric electric = new Electric();
//    }

    public int getHoursOfSleep() {
        return hoursOfSleep;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void setHasSalary(boolean hasSalary) {
        this.hasSalary = hasSalary;
    }

    public void setHoursOfSleep(int hoursOfSleep) {
        this.hoursOfSleep = hoursOfSleep;
    }

    public void thunderPunch() {


        if(hasSalary = false){
            System.out.println("🖕");
        }
        if (hoursOfSleep < 8 ){
            System.out.println("💤");
        }
        if (hasSalary = true && hoursOfSleep >= 8){
            System.out.println("⚡️");
        }
        if (hoursOfSleep >= 8 && thunderStorm == true){
            System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");
        }


    }

    public void electroBall() {

    }
}
