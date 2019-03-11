import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        JourneyPlanner journeyPlanner = new JourneyPlanner();


        List<Vertex[]> puzzles = new ArrayList<>();

        puzzles.add(new Vertex[]{new Vertex(22,9), new Vertex(8,17)});
        puzzles.add(new Vertex[]{new Vertex(22,8), new Vertex(6,15)});
        puzzles.add(new Vertex[]{new Vertex(18,7), new Vertex(10,23)});
        puzzles.add(new Vertex[]{new Vertex(17,5), new Vertex(4,17)});
        puzzles.add(new Vertex[]{new Vertex(17,4), new Vertex(3,17)});
        puzzles.add(new Vertex[]{new Vertex(16,20), new Vertex(15,6)});
        puzzles.add(new Vertex[]{new Vertex(16,18), new Vertex(23,9)});
        puzzles.add(new Vertex[]{new Vertex(16,6), new Vertex(16,18)});
        puzzles.add(new Vertex[]{new Vertex(15,6), new Vertex(16,20)});
        puzzles.add(new Vertex[]{new Vertex(23,9), new Vertex(10,17)});
        puzzles.add(new Vertex[]{new Vertex(23,8), new Vertex(8,22)});
        puzzles.add(new Vertex[]{new Vertex(18,11), new Vertex(3,15)});

        puzzles.add(new Vertex[]{new Vertex(13,6), new Vertex(13,11)});

        puzzles.forEach(
                (Vertex[] puzzle) -> {
                    Vertex start = puzzle[0];
                    Vertex end = puzzle[1];
                    List<Vertex> route = journeyPlanner.iterativeDeepening(start, end);
                    System.out.println(route);
                }

        );
    }
}
