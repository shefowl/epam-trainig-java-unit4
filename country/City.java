package by.epam.unit4.country;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class City implements Comparable<City> {
    private String name;
    private Region region;
    private boolean regionCenter;
    private Set<District> districts;


    public City() {
    }

    public City(String name, Region region, boolean regionCenter) {
        this.name = name;
        this.region = region;
        this.regionCenter = regionCenter;
    }

    public City(String name, Region region, boolean regionCenter, Set<District> districts) {
        this.name = name;
        this.region = region;
        this.regionCenter = regionCenter;
        this.districts = districts;
    }

    class District implements Comparable<District>{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int compareTo(District district){
            return name.compareTo(district.getName());
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

        City city = (City) o;
        return isRegionCenter() == city.isRegionCenter() &&
                Objects.equals(getName(), city.getName()) &&
                Objects.equals(getRegion(), city.getRegion()) &&
                Objects.equals(districts, city.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRegion(), isRegionCenter(), districts);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region=" + region +
                ", regionCenter=" + regionCenter +
                ", districts=" + districts +
                '}';
    }

    @Override
    public int compareTo(City city) {
        return name.compareTo(city.name);
    }

    public boolean isRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        regionCenter = regionCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(HashSet<District> districts) {
        this.districts = districts;
    }

    public District getDistrict(District district) {
        Iterator<District> iterator = districts.iterator();
        while (iterator.hasNext()){
            if(iterator.next().compareTo(district) == 0){
                return iterator.next();
            }
        }
        return null;
    }

    public void setDistrict(District district) {
        this.districts.add(district);
    }
}
