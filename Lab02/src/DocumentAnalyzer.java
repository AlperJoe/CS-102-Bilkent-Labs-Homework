
import java.io.IOException;
import java.util.Scanner;
public class DocumentAnalyzer {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String currentPath = null;
        try {
            currentPath = new java.io.File(".").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Current dir:" + currentPath);

        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);

        System.out.println("Enter the number of documents:");
        int numberOfDoc = scan.nextInt();

        Document[] filenames = new Document[numberOfDoc];


        for(int i = 0; i < numberOfDoc; i ++) {
            System.out.println("Enter the name of the document" + i + 1 + ":");
            String nameDoc = scan.next();
            Document nameOfDoc = new Document(nameDoc);
            filenames[i] = nameOfDoc;
        }

        System.out.println("Enter an option (enter x to quit):");
        int option = scan.nextInt();

        if(option == 1){

            //displaying the frequency of a user entered word in a given document
            System.out.println("Enter the word which you want to find the frequency:");
            String userInput = scan.next();
            for(int i = 0; i < numberOfDoc; i++){
                filenames[i].getFrequency(userInput);
            }
        }
        else if (option == 2){
            //finding the most frequent terms in each document

        }
        else if(option == 3){
            System.out.println("Enter the word which you want to calculate tf-idf:");
            String userInput = scan.next();


            for(int i = 0; i < filenames.length; i++){
                int td = filenames[i].getFrequency(userInput);
                double df = Math.log(filenames.length);
                System.out.println(filenames[i]);
                System.out.println(td * df);
            }

        }
    }
}
