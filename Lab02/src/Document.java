//import file class
import java.io.File;

//import this class tto handle errors
import java.io.FileNotFoundException;

//import the Scanner class to read text files
import java.util.Scanner;

public class Document{

    //store file name of document
    private String fileName;

    //a private array of Term
    private Term[] termList;

    //A default constructor
    public Document() {}

    //A constructor which takes a string fileName and sets the filename of the document.
    // The array is initialized.
    public Document(String fileName) {
        this.fileName = fileName;
        termList = new Term[10000];
        Term object;


    }

    //This method should read the document and fill the array of Term objects
    // based the words in the document and their number of appearance.
    public void processDocument() {

        File object= new File(fileName);
        Scanner scan = null;
        try {
            scan = new Scanner(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int counter = 0;
        while(scan.hasNext()){
            String s = scan.next().split("[}\" , ' ]")[0];
           Term term = new Term(s);
            for(int i = 0; i < ){
                if(s.equals(Term[i])){
                    incrementCount();
                }
            }
           termList[counter] = term;
            counter ++;
        }
        for(int i =0; i < counter; i++){
          System.out.println(termList[i].getWord());
        }
        /*try {
            File myObject = new File(getFileName());
            Scanner myReader = new Scanner(myObject);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

         */
    }
    //This method should return the number of appearance of a given word.
    public int getCount(String word) {
        int counter = 0;
        for (int i = 0; i < termList.length; i++) {
            if(termList[i].equals(word)){
                counter ++;
            }
        }
        return counter;
    }
    public int getFrequency(String word){
        return getCount(word)/ termList.length;
    }
    //getters
    public String getFileName(){return fileName;}
    public Term[] getTermList(){return termList;}

    //setters
    public void setFileName(){this.fileName = fileName;}
    public void setTermList(){this.termList = termList;}
}
    /*public int documentsIncludeWords(String word, Document[] filenames){
        int counter = 0;
        for(int i = 0; i < filenames.length; i++){

            if(nameOfDoc.getCount(word) > 0){
                counter++;
            }
        }
        return counter;
    }

     */