package edu.arizona.cs;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestQ7_hw2 {

    @Test
    public void testQ7_1_1() {
        String inputFileFullPath="src/main/resources/Docs.txt";
        try {
            String query = "schizophrenia /2 drug";
            ans1=new Document("Doc1",3,1);
            ans2=new Document("Doc2",1,2);
            Document[] gold_q711= {ans1,ans2};
            InvertedIndex objInvertedIndex = new InvertedIndex(inputFileFullPath);
            Document[] ans_q7_1_1 = objInvertedIndex.runQ5_1(query);

            assert (ans_q711) !=null;
            assert type(ans_q711) == list;
            assert len(ans_q711) > 0;
            assert len(ans_q711) == 2;

            assert ans_q7_1_1.equals(gold_q711);
            int counter1 = 0;
            assertEquals((gold_q711.length) , ans_q7_1_1.length);
            for (Document docs : gold_q711) {
                assert gold_q711[counter1].equals(ans_q7_1_1[counter1])==true;
                counter1 = counter1 + 1;
            }
        }
        catch ( java.io.FileNotFoundException ex)
        {
            System.out.println(ex.getMessage()); }

        catch ( java.io.IOException ex)
        {
            System.out.println(ex.getMessage()); }

    }


 @Test
    public void testQ5_2() {
        String inputFileFullPath="src/main/resources/Docs.txt";
        try {
            String query = "breakthrough OR new";
            InvertedIndex objInvertedIndex = new InvertedIndex(inputFileFullPath);
            String[] ans_q5_2 = objInvertedIndex.runQ5_2(query);
            String[] doc_names_q2 = {"Doc1", "Doc2", "Doc3", "Doc4"};
            int counter1 = 0;
            assertEquals((doc_names_q2.length) , ans_q5_2.length);
            for (String docs : ans_q5_2) {
                assertEquals(doc_names_q2[counter1], ans_q5_2[counter1]);
                counter1 = counter1 + 1;
            }
        }
        catch ( java.io.FileNotFoundException ex)
        {
            System.out.println(ex.getMessage()); }

        catch ( java.io.IOException ex)
        {
            System.out.println(ex.getMessage()); }

    }


     @Test
    public void testQ5_3() {
        String inputFileFullPath="src/main/resources/Docs.txt";
        try {
            String query = "(drug OR treatment) AND schizophrenia";
            InvertedIndex objInvertedIndex = new InvertedIndex(inputFileFullPath);
            String[] ans_q5_3 = objInvertedIndex.runQ5_3(query);
            String[] doc_names_q3 = {"Doc1", "Doc2", "Doc4"};
            int counter1 = 0;
            assertEquals((doc_names_q3.length) , ans_q5_3.length);
            for (String docs : ans_q5_3) {
                assertEquals(doc_names_q3[counter1], ans_q5_3[counter1]);
                counter1 = counter1 + 1;
            }
        }
        catch ( java.io.FileNotFoundException ex)
        {
            System.out.println(ex.getMessage()); }

        catch ( java.io.IOException ex)
        {
            System.out.println(ex.getMessage()); }

    }

}



