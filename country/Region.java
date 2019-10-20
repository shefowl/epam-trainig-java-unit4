package by.epam.unit4.country;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Region implements Comparable<Region> {
    private String name;
    private Set<City> cities;
    private City regionCenter;
    private Country country;

    public Region() {
    }

    public Region(String name, Set<City> cities, City regionCenter) {
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
                Objects.equals(getCities(), region.getCities()) &&
                Objects.equals(getRegionCenter(), region.getRegionCenter()) &&
                Objects.equals(getCountry(), region.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCities(), getRegionCenter(), getCountry());
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                ", regionCenter=" + regionCenter +
                ", country=" + country +
                '}';
    }

    @Override
    public int compareTo(Region region) {
        return name.compareTo(region.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public City getCity(City city) {
        Iterator<City> iterator = cities.iterator();
        while (iterator.hasNext()){
            if(iterator.next().compareTo(city) == 0){
                return iterator.next();
            }
        }
        return null;
    }

    public void setCity(Set<City> cities) {
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
