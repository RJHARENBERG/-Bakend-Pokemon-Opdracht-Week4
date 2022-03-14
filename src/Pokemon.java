public abstract class Pokemon {

//    [v]Super klasse
//    [v] 2 private variabelen
//    [v] 1 constructor
//    [v] 2 getters
//    [v] 2 setters
//    [v] 2 methodes

    private String name;
    private int level;
    private int healthPoints;
    private String food;
    private String sound;

    public Pokemon(String name, int level, int healthPoints, String food, String sound) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.food = food;
        this.sound = sound;
    }

    public Pokemon() {

    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void eats() {
        System.out.println("Nom Nom Nom Nom");
    }

    public void speaks() {
        System.out.println("‼️💰📢‼️");
    }

    public void thunderPunch(){}

}
