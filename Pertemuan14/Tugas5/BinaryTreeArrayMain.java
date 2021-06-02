
package Tugas5;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
    
 
    BinaryTreeArray bta = new BinaryTreeArray();
    int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};    
    int idxLast = 6;
    bta.populateData(data, idxLast);
    bta.add(11);
    bta.add(23);
    bta.add(21);
    bta.add(14);
    System.out.println("");
    System.out.println("\t--- PREORDER ---");
    bta.traversePreOrder(0);;
    System.out.println(" ");
    System.out.println("\n\t--- INORDER ---");
    bta.traverseInOrder(0);
    System.out.println(" ");
    System.out.println("\n\t--- POSTORDER ---");
    bta.traversePostOrder(0);
    System.out.println(" ");
}
}

