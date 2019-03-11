import java.util.ArrayList;
import java.util.List;

public class Obstacle {

    private List<Vertex> vertices;

    Obstacle(Vertex[] vertices) {
        this.vertices = new ArrayList<>(4);
        for (Vertex vertex: vertices) {
            this.vertices.add(vertex);
        }
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

}
