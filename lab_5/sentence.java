package lab_5;

public class sentence {
    public word[] resultSentence;
    public sentence(String inputSentence){
        String[] words = inputSentence.split("(?=[" + "[-.,!?;:]" + "])|\\s");
        word[] resultSentence = new word[words.length];
        this.resultSentence = resultSentence;
        for (int i=0;i<words.length;i++){
            resultSentence[i] = new word (words[i]);
        }
    }
}