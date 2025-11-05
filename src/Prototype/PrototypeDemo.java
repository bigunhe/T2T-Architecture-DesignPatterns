package Prototype;

public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
//        first collection of data (before cloning)
        DocumentCollection collection1 = new DocumentCollection();
        collection1.setCollectionName("Report 1");
        collection1.addDocuments();
        System.out.println(collection1);

//        deep cloning
        DocumentCollection collection2 = collection1.clone();
        collection2.setCollectionName("Report 2");
        System.out.println(collection2);

//        removing one item from report 2 to see if it affects original
        collection2.getDocs().remove(1);

        System.out.println("\n ...after removing one item from report 2...");
        System.out.println(collection1);
        System.out.println(collection2);



    }
}
