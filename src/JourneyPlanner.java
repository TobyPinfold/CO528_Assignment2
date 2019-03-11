import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JourneyPlanner {

    Obstacle[] obstacles = new ObstacleProvider().getObstacles();
    List<Vertex> allPossibleVertex = new ArrayList<>();


    public JourneyPlanner() {

        for (int x = 0; x < obstacles.length; x++) {
            List<Vertex> obstacle = obstacles[x].getVertices();
            allPossibleVertex.addAll(obstacle);
        }

    }

    public List<Vertex> nextConfigs(Vertex vertex) {

        List<Vertex> collect = allPossibleVertex.stream()
                .filter(targetVertex -> doeslineIntersect(targetVertex, vertex))
                .filter(this::isWithinObstacleCheck)
                .collect(Collectors.toList());

        return collect;
    }


    public LinkedList<Vertex> iterativeDeepening(Vertex first, Vertex last) {
        for (int depth = 1; true; depth++) {
            LinkedList<Vertex> route = depthFirst(first, last, depth);
            if (route != null) {
                return route;
            }
        }
    }

    private LinkedList<Vertex> depthFirst(Vertex first, Vertex last, int depth) {
        if (depth == 0) return null;

        if (first.equals(last)) {

            LinkedList<Vertex> route = new LinkedList<>();
            route.add(first);
            return route;

        } else {

            List<Vertex> nexts = nextConfigs(first);

            for (Vertex next : nexts) {
                LinkedList<Vertex> route = depthFirst(next, last, depth - 1);
                if (route != null && !route.isEmpty()) {
                    route.addFirst(first);
                    return route;
                }
            }
            return null;
        }
    }

    private boolean doeslineIntersect(Vertex targetVertex, Vertex startVertex) {
        for (int i = 0; i < obstacles.length; i++) {
            List<Vertex> obstacle = obstacles[i].getVertices();

            boolean doLinesIntersect =
                    Vertex.linesIntersect(obstacle.get(0), obstacle.get(1), targetVertex, startVertex) ||
                            Vertex.linesIntersect(obstacle.get(1), obstacle.get(2), targetVertex, startVertex) ||
                            Vertex.linesIntersect(obstacle.get(2), obstacle.get(3), targetVertex, startVertex) ||
                            Vertex.linesIntersect(obstacle.get(3), obstacle.get(0), targetVertex, startVertex) ||
                            Vertex.linesIntersect(obstacle.get(0), obstacle.get(2), targetVertex, startVertex);

            if (doLinesIntersect) return false;
        }
        return true;
    }


    private boolean isWithinObstacleCheck(Vertex vertex) {
        for (int i = 0; i < obstacles.length; i++) {
            List<Vertex> obstacle = obstacles[i].getVertices();

            int x = vertex.get_x();
            int y = vertex.get_y();

            Vertex bottomLeftVertex = obstacle.get(0);
            Vertex topRightVertex = obstacle.get(2);

            boolean withinObstacle = (x > bottomLeftVertex.get_x() &&  x < topRightVertex.get_x()) && (y > bottomLeftVertex.get_y() &&  y < topRightVertex.get_y());

            if(withinObstacle) {
                return false;
            }
        }
        return true;
    }
}
