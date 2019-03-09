public class ObstacleProvider {

    private Obstacle[] obstacles = new Obstacle[16];


    ObstacleProvider() {

        obstacles[0] = new Obstacle(getVertexListFromCoords(13, 6, 13, 9, 16, 9, 16, 6));
        obstacles[1] = new Obstacle(getVertexListFromCoords(3, 8, 3, 15, 6, 15, 6, 8));
        obstacles[2] = new Obstacle(getVertexListFromCoords(12, 4, 12, 5, 17, 5, 17, 4));
        obstacles[3] = new Obstacle(getVertexListFromCoords(13, 13, 13, 18, 16, 18, 16, 13));
        obstacles[4] = new Obstacle(getVertexListFromCoords(2, 5, 2, 14, 10, 14, 10, 5));
        obstacles[5] = new Obstacle(getVertexListFromCoords(10, 17, 10, 23, 11, 23, 11, 17));
        obstacles[6] = new Obstacle(getVertexListFromCoords(16, 8, 16, 13, 17, 13, 17, 8));
        obstacles[7] = new Obstacle(getVertexListFromCoords(16, 13, 16, 20, 22, 20, 22, 13));
        obstacles[8] = new Obstacle(getVertexListFromCoords(22, 9, 22, 16, 23, 16, 23, 9));
        obstacles[9] = new Obstacle(getVertexListFromCoords(13, 7, 13, 11, 18, 11, 18, 7));
        obstacles[10] = new Obstacle(getVertexListFromCoords(22, 8, 22, 16, 23, 16, 23, 8));
        obstacles[11] = new Obstacle(getVertexListFromCoords(12, 6, 12, 11, 15, 11, 15, 6));
        obstacles[12] = new Obstacle(getVertexListFromCoords(13, 16, 13, 17, 15, 17, 15, 16));
        obstacles[13] = new Obstacle(getVertexListFromCoords(4, 17, 4, 22, 8, 22, 8, 17));
        obstacles[14] = new Obstacle(getVertexListFromCoords(5, 11, 5, 14, 12, 14, 12, 11));
        obstacles[15] = new Obstacle(getVertexListFromCoords(3, 15, 3, 17, 8, 17, 8, 15));

    }


    private Vertex[] getVertexListFromCoords(int x1, int x2, int y1, int y2, int z1, int z2, int v1, int v2) {

        final Vertex[] square = new Vertex[4];

        square[0] = new Vertex(x1, x2);
        square[1] = new Vertex(y1, y2);
        square[2] = new Vertex(z1, z2);
        square[3] = new Vertex(v1, v2);

        return square;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

}
