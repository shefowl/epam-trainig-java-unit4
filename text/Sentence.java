package by.epam.unit4.text;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> words;

    public Sentence() {
    }

    public Sentence(List<Word> words) {
        this.words = new LinkedList<>(words);
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
        return Objects.equals(getWords(), sentence.getWords());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWords());
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }

    public List<Word> getWords() {
        return new LinkedList<Word>(words);
    }

    public void setWords(List<Word> words) {
        this.words = new LinkedList<>(words);
    }
}
