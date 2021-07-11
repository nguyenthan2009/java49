public class Square implements Resizeable {
    private double edge;
    public Square(double edge){
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return edge*edge;
    }

    @Override
    public void resize(double percent) {
        edge *= Math.sqrt(percent);
    }
}
