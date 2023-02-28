public class Term extends Document {

    private int count;
    private String word;

    public Term(String text){
        this.word = text;
        int numberOfAppearance=0;
    }

    public void incrementCount(){
        count += 1;
    }

    //getters
    public int getCount(){return count;}
    public String getWord(){return word;}

    //setters
    public void setCount(){this.count=count;}
    public void setWord(){this.word = word;}

}
