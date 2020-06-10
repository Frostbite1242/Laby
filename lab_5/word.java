package lab_5;



public class word {
    public char[] letters;
    public word(String inputWord){
        char[] letters = inputWord.toCharArray();
        this.letters = letters;
    }
}