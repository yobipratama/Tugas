package Tugas5;

public class BinaryTreeArray {

    int[] data;
    int idxLast;
    int size = 10;

    public BinaryTreeArray() {
        data = new int[size];
    }

    public boolean IsFull() {
        if (idxLast == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int dataa) {
        if (!IsFull()) {
            idxLast++;
            data[idxLast] = dataa;
        } else {
            System.out.println("--------------------");
            System.out.println("Array Sudah Penuh!!");
            System.out.println("Data " + dataa + " gagal masuk");
            System.out.println("--------------------");
        }
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
