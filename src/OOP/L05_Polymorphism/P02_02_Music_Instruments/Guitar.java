package OOP.L05_Polymorphism.P02_02_Music_Instruments;

public class Guitar extends Instrument {

    public Guitar() {
        super("Guitar", "Струнен", "Класическа китара с 6 струни"); // Конструктор
    }

    @Override
    public String play() {
        //System.out.println("Guitar is strumming.");
        // Променяме кода да връща стрин за Unit Testing , като и метода от void се променя в String

        return "Guitar is strumming.";
    }
}
