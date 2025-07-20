package OOP.L05_Polymorphism.P02_02_Music_Instruments;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Instrument> instruments = new HashMap<>();

        System.out.println("We have five music instruments: " +
                "Guitar, BassGuitar, Piano, Drum, Trumpet");

        instruments.put("Guitar", InstrumentFactory.createInstrument("Guitar"));
        instruments.put("Piano", InstrumentFactory.createInstrument("Piano"));
        instruments.put("Drum", InstrumentFactory.createInstrument("Drum"));
        instruments.put("BassGuitar", InstrumentFactory.createInstrument("BassGuitar"));
        instruments.put("Trumpet", InstrumentFactory.createInstrument("Trumpet"));

        System.out.println("Which instrument do you want to play?");
        System.out.println("Choice yore favorite instruments one by one");


        int count = 0;
        while (count < 3) {

            System.out.println("Insert instrument name: ");
            String instrumentName = scanner.nextLine();

            if (instruments.containsKey(instrumentName)) {
                System.out.println(instruments.get(instrumentName).play());
            } else {
                System.out.println("No such instrument.");
            }
            count++;

        }




    }
}
