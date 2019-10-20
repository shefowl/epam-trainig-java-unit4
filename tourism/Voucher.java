package by.epam.unit4.tourism;

import java.util.Objects;

public class Voucher implements Comparable<Voucher> {
    private int days;
    private Type type;
    private Transport transport;
    private Feed feed;

    public enum Type{
        REST,
        EXCURSION,
        THERAPY,
        SHOPPING,
        CRUISE;
    }

    public enum Transport{
        AIRPLANE,
        BUS,
        SHIP,
        TRAIN;
    }

    public enum Feed{
        RO,
        BB,
        HB,
        FB,
        AI,
        UAI;
    }

    public Voucher() {
    }

    public Voucher(int days, Type type, Transport transport, Feed feed) {
        this.days = days;
        this.type = type;
        this.transport = transport;
        this.feed = feed;
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

        Voucher voucher = (Voucher) o;
        return getDays() == voucher.getDays() &&
                getType() == voucher.getType() &&
                getTransport() == voucher.getTransport() &&
                getFeed() == voucher.getFeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDays(), getType(), getTransport(), getFeed());
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "days=" + days +
                ", type=" + type +
                ", transport=" + transport +
                ", feed=" + feed +
                '}';
    }

    @Override
    public int compareTo(Voucher o) {
        if(days < o.getDays()){
            return -1;
        }
        else if(days == o.getDays()){
            return 0;
        }
        else {
            return 1;
        }
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }
}
