public class Main {

    public static void main(String[] args) {
        Vertex start = new Vertex(22, 9);
        Vertex end = new Vertex(8, 17);

        JourneyPlanner journeyPlanner = new JourneyPlanner();
        journeyPlanner.iterativeDeepening(start, end);
    }
}
