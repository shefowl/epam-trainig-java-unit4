package by.epam.unit4.text;

import java.util.Arrays;

public class Sentence {
    private Word [] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if(o == null){
            return false;
        }

        if(this.getClass() != o.getClass()){
            return false;
        }

        Sentence sentence = (Sentence) o;
        return Arrays.equals(getWords(), sentence.getWords());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getWords());
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + Arrays.toString(words) +
                '}';
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }
}
