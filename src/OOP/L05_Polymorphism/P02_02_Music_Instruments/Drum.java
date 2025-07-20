package OOP.L05_Polymorphism.P02_02_Music_Instruments;

public class Drum extends Instrument {

    @Override
    public String play() {
        //System.out.println("Drum is beating.");
       // Променяме кода да връща стрин за Unit Testing , като и метода от void се променя в String
        return "Drum is beating.";
    }
}
