import java.util.List;

public class Obstacle {

    private Vertex[] vertices;

    Obstacle(Vertex[] vertices) {
        this.vertices = vertices;
    }

    public Vertex[] getVertices() {
        return vertices;
    }
}
