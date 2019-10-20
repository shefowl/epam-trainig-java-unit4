package by.epam.unit4.text;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Text {
    private List<Sentence> sentences;
    private Word title;

    public Text(List<Sentence> sentences, Word title) {
        this.sentences = new LinkedList<>(sentences);
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
        return Objects.equals(getSentences(), text.getSentences()) &&
                Objects.equals(getTitle(), text.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSentences(), getTitle());
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + sentences +
                ", title=" + title +
                '}';
    }

    public List<Sentence> getSentences() {
        return new LinkedList<>(sentences);
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = new LinkedList<>(sentences);
    }

    public Sentence getSentence(int index) {
        return sentences.get(index);
    }

    public void setSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    public Word getTitle() {
        return title;
    }

    public void setTitle(Word title) {
        this.title = title;
    }
}
