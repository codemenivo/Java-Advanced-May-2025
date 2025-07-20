package OOP.L05_Polymorphism.P02_02_Music_Instruments;

public class Trumpet extends Instrument {


    public Trumpet() {
        super("Trumpet", "Духов", "Тромпета е изработен от месинг");
    }

    @Override
    public String play() {
        //System.out.println("Тромпета е духов инструмент");
        // Променяме кода да връща стрин за Unit Testing , като и метода от void се променя в String
        return "Тромпета е духов инструмент";
    }
}
