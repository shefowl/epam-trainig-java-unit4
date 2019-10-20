package by.epam.unit4.country;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Country {
    private String name;
    private float square;
    private City capital;
    private Set<Region> regions;

    public Country() {
    }

    public Country(String name, float square, City capital, Set<Region> regions) {
        this.name = name;
        this.square = square;
        this.capital = capital;
        this.regions = regions;
        for(Region i:regions){
            i.setCountry(this);
        }
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

        Country country = (Country) o;
        return Float.compare(country.getSquare(), getSquare()) == 0 &&
                Objects.equals(getName(), country.getName()) &&
                Objects.equals(getCapital(), country.getCapital()) &&
                Objects.equals(getRegions(), country.getRegions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSquare(), getCapital(), getRegions());
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", capital=" + capital +
                ", regions=" + regions +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Set<Region> getRegions() {
        return regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    public Region getRegion(Region region) {
        Iterator<Region> iterator = regions.iterator();
        while (iterator.hasNext()){
            if(iterator.next().compareTo(region) == 0){
                return iterator.next();
            }
        }
        return null;
    }

    public void setRegion(Region region) {
        this.regions.add(region);
    }

}
