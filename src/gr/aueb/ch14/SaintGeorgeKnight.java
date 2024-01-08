package gr.aueb.ch14;

public class SaintGeorgeKnight {

    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight(){}

    public static SaintGeorgeKnight getInstance(){
        return INSTANCE;
    }

    public void embarkOnMission(){
        System.out.println("Mission starts!");
    }
}
