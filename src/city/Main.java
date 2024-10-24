package city;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      /*  Country деген класс тузунуз.
        Анын поляларын бериниз.
                Аты , калкы, аянты , тили ушундай полялары болсун .
                Маанилерин конструктор аркылуу бериниз. 3 объект тузунуз . Ошондой эле 1 static метод кошунуз.
        Mетод параметирине Country-нин массивин алып бизге аянты боюнча эн чон олкону таап берсин. */

     Country country1 = new Country("Korea",70000000,"Korean",27328);
     Country country2 = new Country("Japan",5678000, "Japan",234543);
     Country country3 = new Country("China",58945678,"Chines",945672);

     Country [] countries= {country1,country2,country3};
        System.out.println(Arrays.toString(countries));
        bigCountry(countries);


    } public  static void bigCountry(Country [] countries){
     Country biggest = countries[0];
        for (int i = 1; i < countries.length ; i++) {
            if (biggest.getArea()<countries[i].getArea()){
                biggest=countries[i];
            }
        }
        System.out.println("The largest country: "+biggest);
     }
    }

