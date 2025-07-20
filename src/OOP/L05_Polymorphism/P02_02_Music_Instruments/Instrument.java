package OOP.L05_Polymorphism.P02_02_Music_Instruments;

public abstract class Instrument implements Playable {

    /*
    public String play() {
        //System.out.println("This instrument is playing ...");
        // Променяме кода да връща стрин за Unit Testing , като и метода от void се променя в String
        return "This instrument is playing ...";
    }
    */

    private String name;
    private String category;
    private String description;

    public Instrument(String name, String category, String description) {
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    // Методът play ще се дефинира в конкретните инструменти
    @Override
    public abstract String play() ;

}
