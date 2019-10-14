package by.epam.unit4.country;

import java.util.Arrays;
import java.util.Objects;

public class Region {
    private String name;
    private City [] cities;
    private City regionCenter;
    private Country country;

    public Region() {
    }

    public Region(String name, City[] cities, City regionCenter) {
        this.name = name;
        this.cities = cities;
        for(City i:cities){
            i.setRegion(this);
        }
        this.regionCenter = regionCenter;
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

        Region region = (Region) o;
        return Objects.equals(getName(), region.getName()) &&
                Arrays.equals(getCities(), region.getCities()) &&
                Objects.equals(getRegionCenter(), region.getRegionCenter()) &&
                Objects.equals(getCountry(), region.getCountry());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getRegionCenter(), getCountry());
        result = 31 * result + Arrays.hashCode(getCities());
        return result;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", regionCenter=" + regionCenter +
                ", country=" + country +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
