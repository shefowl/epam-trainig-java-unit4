package by.epam.unit4.country;

public class CountryLogic {
    public static int takeNumberOfRegions(Country country){
        return country.getRegions().length;
    }
}
