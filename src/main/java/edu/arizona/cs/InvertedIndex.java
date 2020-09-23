package edu.arizona.cs;
import edu.arizona.cs.Document;

public class InvertedIndex {

    boolean indexExists=false;
    String inputFilePath ="";

    public InvertedIndex(String inputFile){
        inputFilePath =inputFile;
    }

    public static void main(String[] args ) {
        try {
            //a boiler plate main function if you want to test without using mvn test
            //build index
            String fileName = "Docs.txt";
            System.out.println("********Welcome to  Homework 2!");
            String query = "schizophrenia /2 drug";
            InvertedIndex objInvertedIndex = new InvertedIndex(fileName);
            Document[]  ans = objInvertedIndex.runQ7_1_1(query);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Document[] runQ7_1_1(String query) throws java.io.FileNotFoundException,ArrayIndexOutOfBoundsException {
        //check if index exists, else create one
        Document ans1=new Document("Doc1",3,1);
        Document ans2=new Document("Doc2",1,2);
        Document[] dummy_ans= {ans1,ans2};
        return dummy_ans;
    }

    public Document[] runQ7_1_2(String query) throws java.io.FileNotFoundException,ArrayIndexOutOfBoundsException {
        //check if index exists, else create one
        Document ans1=new Document("Doc1",3,1);
        Document ans2=new Document("Doc2",1,2);
        Document ans3=new Document("Doc3",5,1);
        Document[] dummy_ans= {ans1,ans2,ans3};
        return dummy_ans;
    }

    public Document[] runQ7_2_directional(String query) throws java.io.FileNotFoundException,ArrayIndexOutOfBoundsException {
        //check if index exists, else create one
        Document ans1=new Document("Doc2",1,2);
        Document[] dummy_ans= {ans1};
        return dummy_ans;
    }




}
