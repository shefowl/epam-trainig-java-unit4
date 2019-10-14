package by.epam.unit4.country;

import java.util.Arrays;
import java.util.Objects;

public class Country {
    private String name;
    private float square;
    private City capital;
    private Region [] regions;

    public Country() {
    }

    public Country(String name, float square, City capital, Region[] regions) {
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
                Arrays.equals(getRegions(), country.getRegions());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getSquare(), getCapital());
        result = 31 * result + Arrays.hashCode(getRegions());
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", capital=" + capital +
                ", regions=" + Arrays.toString(regions) +
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

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

}
