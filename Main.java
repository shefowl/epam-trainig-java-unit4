package by.epam.unit4;

import by.epam.unit4.bank.Account;
import by.epam.unit4.bank.Client;
import by.epam.unit4.bank.ClientLogic;
import by.epam.unit4.country.City;
import by.epam.unit4.country.Country;
import by.epam.unit4.country.CountryLogic;
import by.epam.unit4.country.Region;
import by.epam.unit4.text.Sentence;
import by.epam.unit4.text.Text;

import by.epam.unit4.text.TextLogic;
import by.epam.unit4.text.Word;
import by.epam.unit4.tourism.Voucher;
import by.epam.unit4.tourism.VoucherLogic;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Set<City> cities = new HashSet<>();

        Region regions1 = new Region();
        Region regions2 = new Region();
        City city1 = new City("qewr",regions1,true);
        City city2 = new City("xzcvbf",regions2,false);
        cities.add(city1);
        cities.add(city2);
        regions1.setCities(cities);

        regions1.setRegionCenter(city1);

        City city3 = new City("xzcvbf",regions1,true);
        City city4 = new City("kjt",regions1,false);
        regions1.setRegionCenter(city3);

        Set<Region> regions = new HashSet<>();
        regions.add(regions1);
        regions.add(regions2);

        Country country = new Country("asdasf",5,city1,regions);
        System.out.println("Capital - " + country.getCapital().getName());
        System.out.println("Number of regions - " + CountryLogic.takeNumberOfRegions(country));
        System.out.println("Square - " + country.getSquare());
        System.out.println("Region centers: ");
        for (Region i:country.getRegions()) {
            System.out.println(i.getRegionCenter().getName());
        }

        List<Word> words1 = new LinkedList<>();
        List<Word> words2 = new LinkedList<>();
        List<Word> words3 = new LinkedList<>();

        words1.add(new Word("tyghjh "));
        words1.add(new Word("hnm "));
        words1.add(new Word("as "));

        words2.add(new Word(".dfgheth "));
        words2.add(new Word("qiy "));
        words2.add(new Word("nbjm "));

        words3.add(new Word("lgjk "));
        words3.add(new Word("dgtjhsrgtjhsrtj "));
        words3.add(new Word("hfjkxvbass "));
        Sentence sentence = new Sentence(words3);

        List<Sentence> sentences = new LinkedList<>();
        sentences.add(new Sentence(words1));
        sentences.add(new Sentence(words2));

        Word title = new Word("Title");

        Text text = new Text(sentences,title);
        text.setSentence(sentence);
        System.out.println("Text:" + TextLogic.takeText(text));

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(2,100,false));
        accounts.add(new Account(5,-200,false));
        accounts.add(new Account(1,-100,false));
        accounts.add(new Account(4,10,true));
        accounts.add(new Account(6,300,false));
        Client client = new Client("asfdadf",accounts);
        ClientLogic.sortAccountsByBalance(client);
        for (Account i: client.getAccounts()) {
            System.out.println(i);
        }

        List<Voucher> vouchers = new ArrayList<>();
        vouchers.add(new Voucher(10, Voucher.Type.REST, Voucher.Transport.BUS, Voucher.Feed.AI));
        vouchers.add(new Voucher(14, Voucher.Type.REST, Voucher.Transport.BUS, Voucher.Feed.FB));
        vouchers.add(new Voucher(7, Voucher.Type.REST, Voucher.Transport.BUS, Voucher.Feed.AI));
        vouchers.add(new Voucher(21, Voucher.Type.REST, Voucher.Transport.AIRPLANE, Voucher.Feed.AI));
        vouchers.add(new Voucher(5, Voucher.Type.CRUISE, Voucher.Transport.SHIP, Voucher.Feed.AI));

        VoucherLogic.sortVouchersByDays(vouchers);
        vouchers = VoucherLogic.takeVouchersByType(vouchers, Voucher.Type.REST);
        vouchers = VoucherLogic.takeVouchersByTransport(vouchers, Voucher.Transport.BUS);
        vouchers = VoucherLogic.takeVouchersByFeed(vouchers, Voucher.Feed.AI);
        vouchers.size();
    }
}

