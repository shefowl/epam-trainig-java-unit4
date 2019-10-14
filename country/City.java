package by.epam.unit4.country;

import java.util.Arrays;
import java.util.Objects;

public class City {
    private String name;
    private Region region;
    private boolean regionCenter;
    private District[] districts;


    public City() {
    }

    public City(String name, Region region, boolean regionCenter) {
        this.name = name;
        this.region = region;
        this.regionCenter = regionCenter;
    }

    class District{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
                Arrays.equals(districts, city.districts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getRegion(), isRegionCenter());
        result = 31 * result + Arrays.hashCode(districts);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region=" + region +
                ", regionCenter=" + regionCenter +
                ", districts=" + Arrays.toString(districts) +
                '}';
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
}
