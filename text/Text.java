package by.epam.unit4.text;

import java.util.Arrays;
import java.util.Objects;

public class Text {
    private Sentence [] sentences;
    private Word title;

    public Text(Sentence[] sentences, Word title) {
        this.sentences = sentences;
        this.title = title;
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

        Text text = (Text) o;
        return Arrays.equals(getSentences(), text.getSentences()) &&
                Objects.equals(getTitle(), text.getTitle());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getTitle());
        result = 31 * result + Arrays.hashCode(getSentences());
        return result;
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + Arrays.toString(sentences) +
                ", title=" + title +
                '}';
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Word getTitle() {
        return title;
    }

    public void setTitle(Word title) {
        this.title = title;
    }
}
