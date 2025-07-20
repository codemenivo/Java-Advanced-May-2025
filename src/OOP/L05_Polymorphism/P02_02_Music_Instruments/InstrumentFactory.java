package OOP.L05_Polymorphism.P02_02_Music_Instruments;

public class InstrumentFactory {

    public static Instrument createInstrument(String type) {

        switch (type) {
            case "Guitar" :
                return new Guitar();
            case "Drum" :
                return new Drum();
            case "Piano" :
                return new Piano();
            case "BassGuitar" :
                return new BassGuitar();
            case "Trumpet" :
                return new Trumpet();
            default:
                return null;
        }



    }

}
