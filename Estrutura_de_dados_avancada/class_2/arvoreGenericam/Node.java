import java.util.ArrayList;

public class Node {

    private Object elemento;
    private Node father;
    private ArrayList<Node> sons = new ArrayList<>();


    public Node(Object elemento) {
        this.elemento = elemento;
    }

    public Node(Object elemento, Node father, ArrayList<Node> sons) {
        this.elemento = elemento;
        this.father = father;
        this.sons = sons;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Node getFather() {
        return this.father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public ArrayList<Node> getSons() {
        return this.sons;
    }

    public void setSons(ArrayList<Node> sons) {
        this.sons = sons;
    }
}