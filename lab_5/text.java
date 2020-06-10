package lab_5;

public class text {
    public sentence[] resultText;
    public text(String inputText){
        String[] sentences = inputText.split("(?<=[?!.])\\s*");
        sentence[] resultText = new sentence[sentences.length];
        this.resultText = resultText;
        for (int i=0; i<=(sentences.length-1); i++){
            resultText[i] = new sentence(sentences[i]);
        }
    }
}