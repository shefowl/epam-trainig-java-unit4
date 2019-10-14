package by.epam.unit4.text;

public class TextLogic {
    public static void addText(Text text, Sentence sentence){
        int length = text.getSentences().length + 1;
        Sentence [] update = new Sentence[length];
        for (int i = 0; i < length - 1; ++i) {
            update[i] = text.getSentences()[i];
        }
        update[length - 1] = sentence;
        text.setSentences(update);
    }

    public static String takeText(Text text){
        String textString = "";
        for(int i = 0; i < text.getSentences().length; ++i){
            for(int j = 0; j < text.getSentences()[i].getWords().length; ++j){
                textString += text.getSentences()[i].getWords()[j].getWord();
                textString += " ";
            }
        }
        return textString;
    }
}
