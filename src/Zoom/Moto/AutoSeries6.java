package Zoom.Moto;

public class AutoSeries6 extends AutoSeries5 {

    public AutoSeries6(Engine engine) {
        setEngine(new EngineV6());
    }

    @Override
    public double upTo100km() {
        return 2.5;
    }

    public void offRoadMode() {
        System.out.println("Off road on!");
    }

}
