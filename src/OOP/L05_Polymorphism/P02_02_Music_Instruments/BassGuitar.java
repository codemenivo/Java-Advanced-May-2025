package OOP.L05_Polymorphism.P02_02_Music_Instruments;

public class BassGuitar extends Instrument {


    public BassGuitar() {
        super("BassGuitar", "Струнен", "Това е китара с 4 струни");
    }

    @Override
    public String play() {
        //System.out.println("Бас китарата звучи прекрасно");
        // Променяме кода да връща стрин за Unit Testing , като и метода от void се променя в String
        return "Бас китарата звучи прекрасно";
    }
}
