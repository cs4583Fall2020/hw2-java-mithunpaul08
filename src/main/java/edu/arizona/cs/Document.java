package edu.arizona.cs;

public class Document {
    private String docid ="";
    private int position1=2;
    private int position2=2;

    public Document(String docid_in, int position1_in,int position2_in){
        docid=docid_in;
        position1=position1_in;
        position2=position2_in;
    }

    public boolean equals(Document answer) {
        if (answer == null || getClass() != answer.getClass()) return false;
        assert this.docid.equals(answer.docid);
        assert this.position1.equals(answer.position1);
        assert this.position2.equals(answer.position2);
        return true;
    }
}
