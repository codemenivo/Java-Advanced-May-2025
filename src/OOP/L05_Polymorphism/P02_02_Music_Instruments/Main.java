package OOP.L05_Polymorphism.P02_02_Music_Instruments;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Instrument> instruments = new HashMap<>();
        /*

        System.out.println("We have five music instruments: " +
                "Guitar, BassGuitar, Piano, Drum, Trumpet");
        */

        instruments.put("Guitar", InstrumentFactory.createInstrument("Guitar"));
        instruments.put("Piano", InstrumentFactory.createInstrument("Piano"));
        instruments.put("Drum", InstrumentFactory.createInstrument("Drum"));
        instruments.put("BassGuitar", InstrumentFactory.createInstrument("BassGuitar"));
        instruments.put("Trumpet", InstrumentFactory.createInstrument("Trumpet"));

        System.out.println("Добре дошъл в Музикалната зала!");
        System.out.println("Разполагаш със следните инструменти:");

        instruments.values().forEach(instr -> {
            System.out.printf("%s (%s) - %s%n", instr.getName(), instr.getCategory(), instr.getDescription());
        });

        System.out.println("Избери до 3 инструмента. Напиши име или 'Exit' за край.");

        int count = 0;
        while (count < 3) {

            System.out.println("Въведи име на инструмент: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Exit")) {
                break;
            }

            Instrument selected = instruments.get(input);

            if (selected != null) {
                System.out.println(selected.play());
            } else {
                System.out.println("Няма такъв инструмент.");
            }
            count++;

        }


        System.out.println("\n🎵 Благодарим за участието! До нови срещи!");

    }
}
