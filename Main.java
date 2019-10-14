package by.epam.unit4;

import by.epam.unit4.country.City;
import by.epam.unit4.country.Country;
import by.epam.unit4.country.CountryLogic;
import by.epam.unit4.country.Region;
import by.epam.unit4.text.Sentence;
import by.epam.unit4.text.Text;
import by.epam.unit4.text.TextLogic;
import by.epam.unit4.text.Word;
import by.epam.unit4.tourism.Voucher;


public class Main {

    public static void main(String[] args) {
        City [] cities = new City[3];
        for(int i = 0; i < 3; ++i){
            cities[i] = new City();
        }
        Region [] regions = new Region[2];
        regions[0] = new Region();
        regions[1] = new Region();
        City [] cities0 = new City[]{cities[1], cities[2]};
        regions[1].setCities(cities0);


        cities[0].setName("qwer");
        cities[0].setRegion(regions[0]);
        cities[0].setRegionCenter(true);
        regions[0].setRegionCenter(cities[0]);

        cities[1].setName("xzcvbf");
        cities[1].setRegion(regions[1]);
        cities[1].setRegionCenter(true);
        regions[1].setRegionCenter(cities[1]);

        cities[2].setName("kjt");
        cities[2].setRegion(regions[1]);


        Country country = new Country("asdasf",5,cities[0],regions);
        System.out.println("Capital - " + country.getCapital().getName());
        System.out.println("Number of regions - " + CountryLogic.takeNumberOfRegions(country));
        System.out.println("Square - " + country.getSquare());
        System.out.println("Region centers: ");
        for (Region i:country.getRegions()) {
            System.out.println(i.getRegionCenter().getName());
        }

        Word [] words1 = new Word[3];
        Word [] words2 = new Word[3];
        Word [] words3 = new Word[3];

        words1[0] = new Word("tyghjh");
        words1[1] = new Word("hnm");
        words1[2] = new Word("as");

        words2[0] = new Word(".dfgheth");
        words2[1] = new Word("qiy");
        words2[2] = new Word("nbjm");

        words3[0] = new Word("lgjk");
        words3[1] = new Word("dgtjhsrgtjhsrtj");
        words3[2] = new Word("hfjkxvbass");
        Sentence sentence = new Sentence(words3);

        Sentence [] sentences = new Sentence[2];
        sentences[0] = new Sentence(words1);
        sentences[1] = new Sentence(words2);

        Word title = new Word("Title");

        Text text = new Text(sentences,title);
        TextLogic.addText(text, sentence);
        System.out.println("Text:" + TextLogic.takeText(text));

        Voucher voucher = new Voucher(10, Voucher.Type.REST, Voucher.Transport.BUS, Voucher.Feed.AI);
    }
}

