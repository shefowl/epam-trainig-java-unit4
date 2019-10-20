package by.epam.unit4.text;

public class TextLogic {
    public static String takeText(Text text){
        StringBuffer textString = new StringBuffer();
        for (Sentence i:text.getSentences()) {
            for (Word j: i.getWords()) {
                textString.append(j.getWord());
            }
        }
        return textString.toString();
    }
}
