package Prototype;

import java.util.List;
import java.util.ArrayList;

public class DocumentCollection implements Cloneable{
    String collectionName;
    List<Document> docs = new ArrayList<>();

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public List<Document> getDocs() {
        return docs;
    }

    public void setDocs(List<Document> docs) {
        this.docs = docs;
    }

    //    now fill the collection with documents
    public void addDocuments(){
//        loop through the array and add a number of docs to the collection
        for(int i=1; i<=10; i++){
            Document doc = new Document();
            doc.setTitle("Doc_" + i);
            doc.setContent("Doc_"+ i + " content...");
//            get the collection with the getDocs() method and add the newly created object in each iteration
            getDocs().add(doc);
        }
    }

    @Override
    public String toString() {
        return "DocumentCollection{" +
                "collectionName='" + collectionName + '\'' +
                ", docs=" + docs +
                '}';
    }


    @Override
    protected DocumentCollection clone() throws CloneNotSupportedException {
        DocumentCollection newCollection = new DocumentCollection();
        for(Document d : this.getDocs()){
            newCollection.getDocs().add(d);
        }
        return newCollection;

    }
}
