package by.epam.unit4.tourism;

public class Voucher {
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
