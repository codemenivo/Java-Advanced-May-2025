package OOP.L05_Polymorphism.P02_02_Music_Instruments;

public class Piano extends Instrument {

    @Override
    public String play() {
        //System.out.println("Piano is playing a melody.");
        // Променяме кода да връща стрин за Unit Testing , като и метода от void се променя в String
        return "Piano is playing a melody.";
    }
}
