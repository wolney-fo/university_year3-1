package application;


import entities.GenericTree;

public class Main {
    public static void main(String[] args) {

        // Gerando uma árvore vazia, mas que pode ser gerada com um valor inicial
        GenericTree<String> tree = new GenericTree<String>();

        // Adicionando os nós
        tree.addNode("A", "A");
        tree.addNode("B", "A");
        tree.addNode("Ba", "B");
        tree.addNode("Bb", "B");
        tree.addNode("BbA", "Bb");
        tree.addNode("Bc", "B");
        tree.addNode("C", "A");
        tree.addNode("Ca", "C");
        tree.addNode("D", "A");

        // Exibindo toda a árvore com todas as informações
        System.out.println("\n\nÁrvore com info:");
        tree.printWholeTree();

        // Exibindo apenas os nós folhas
        System.out.println("\n\nNós folhas:");
        tree.printLeafNodes();

        // Exibindo a sub-árvore de um dado nó
        System.out.println("\n\nSub árvore de 'B':");
        tree.printSubTree("B");

        // Removendo um nó
        System.out.println("\n\nRemovendo o nó Bb e seus filhos por consequência:");
        tree.removeNode("Bb");
        tree.printWholeTree();

    }
}
