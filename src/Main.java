public class Main {
    public static void main(String[] args) {
//  [v] Een main-klasse met een main-methode;
//  [v] vier verschillende Pokèmon-objecten van verschillende klassen geïnstantieerd- en gedeclareerd.
//  [] Met behulp van deze objectnamen kunnen de methodes van de verschillende klassen worden uitgevoerd.


        Electric electric = new Electric("pica", 1,9,"nuts", "pika paika", false, true, 9);
        Grass grass = new Grass();
        Water water = new Water();
        Fire fire = new Fire();

        Pokemon pika = new Electric("Pika",3, 4,"appel", "kwak",true, true, 9);

        electric.thunderPunch();

        electric.setHoursOfSleep(5);

        electric.thunderPunch();

        electric.speaks();

        pika.speaks();

        pika.thunderPunch();

        grass.thunderPunch();

        water.thunderPunch();

        fire.thunderPunch();




    }
}
