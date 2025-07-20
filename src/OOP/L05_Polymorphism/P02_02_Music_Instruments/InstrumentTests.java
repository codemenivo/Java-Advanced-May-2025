package OOP.L05_Polymorphism.P02_02_Music_Instruments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class InstrumentTests {

    @Test
    public void testGuitarPlay() {
        Instrument guitar = new Guitar();
        assertEquals("Guitar is strumming.", guitar.play());
    }

    @Test
    public void testTrumpetPlay() {
        Instrument trumpet = new Trumpet();
        assertEquals("Тромпета е духов инструмент", trumpet.play());
    }

    @Test
    public void testBassGuitarPlay() {
        Instrument bass = new BassGuitar();
        assertEquals("Бас китарата звучи прекрасно", bass.play());
    }

    @Test
    public void testDrumPlay() {
        Instrument drum = new Drum();
        assertEquals("Drum is beating.", drum.play());
    }

    @Test
    public void testPianoPlay() {
        Instrument piano = new Piano();
        assertEquals("Piano is playing a melody.", piano.play());
    }

}

