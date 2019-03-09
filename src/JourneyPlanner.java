import java.util.LinkedList;
import java.util.List;

public class JourneyPlanner {

    Obstacle[] obstacles = new ObstacleProvider().getObstacles();

    public List<Vertex> nextConfigs(Vertex vertex) {
        return null;
    }

    public LinkedList<Vertex> iterativeDeepening(Vertex first, Vertex last) {
        for (int depth = 1; true; depth++) {
            LinkedList<Vertex> route = depthFirst(first, last, depth);
            if (route != null) return route;
        }
    }

    private LinkedList<Vertex> depthFirst(Vertex first, Vertex last, int depth) {
        if (depth <= 0) return null;

        if (first == last) {
            LinkedList<Vertex> route = new LinkedList<>();
            route.add(first);
            return route;
        } else {
            List<Vertex> nexts = nextConfigs(first);
            for (Vertex next : nexts) {
                LinkedList<Vertex> route = depthFirst(next, last, depth - 1);
                if (route != null) {
                    route.addFirst(first);
                    return route;
                }
            }
            return null;
        }
    }
}
