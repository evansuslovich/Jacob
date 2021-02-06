import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Word{ 
    
    public Word(){
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random(); 

        System.out.println("Enter any word");  // enter the word 
        String word = scanner.nextLine();  // takes the word
        int length = word.length(); // the length of the word 

        String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x", "y","z"}; // array of all characters
        boolean bool = false; // keeps the program running 
        String newWord = ""; // this makes the new word 
        int counter = 0;  // counter for how many times there is a new configuration



        ArrayList<String> usedLetters = new ArrayList<String>(); // Create an ArrayList object 

        while(bool == false){ // loops until true which is when the newWord is equals to the word given by the user
            newWord = ""; 
            usedLetters.clear(); 
            counter++;


            for(int i = 0; i < length; i++){ // this is going to get a new letter
                String letter = chars[random.nextInt(26)]; // set letter to the random char 
                
                while(check(letter, usedLetters)){ // until it is false  
                    letter = chars[random.nextInt(26)]; 
                }
                usedLetters.add(letter); 
                // we need to make a check method which will make sure that letter isn't already in usedLetters Arraylist 
                // we are also going to have to make a method which will randomly select another letter which will once again check if it's in usedLetters (while loop)


                newWord = letter;  
            }

            if(newWord.equals(word)){
                bool = true;
            }
        }

        System.out.println(newWord); 
        System.out.println(counter);
        scanner.close(); 

    }


    public boolean check(String letter, ArrayList<String> usedLetters){
        
        for(int i = 0; i < usedLetters.size(); i++){
            if(letter.equals(usedLetters.get(i))){
                return true;
            }
        }
        return false; 
    }

    


    public static void main(String[] args){
        new Word(); 
    }
}