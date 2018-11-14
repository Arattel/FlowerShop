package bouquets;

import attributes.Color;
import attributes.Country;
import attributes.Odor;
import species.Chamomile;
import species.Rose;
import species.Tulip;

import java.util.Random;

public class StandardBouquet {
    public static Bouquet roses33(){
        Bouquet myBouquet = new Bouquet();
        Random r = new Random();
        for(int i = 0; i < 33; i++){
            myBouquet.addFlower(new Rose(Color.RED, 12 + (32 - 12) * r.nextDouble(), Odor.WEAK,
                    Country.UKRAINE, 90 + (180 - 90) * r.nextDouble(), true));
        }
        return myBouquet;
    }
    public static Bouquet roses3tulips2(){
        Bouquet myBouquet = new Bouquet();
        Random r = new Random();
        for(int i = 0; i < 3; i++){
            myBouquet.addFlower(new Rose(Color.RED, 12 + (32 - 12) * r.nextDouble(), Odor.WEAK,
                    Country.UKRAINE, 90 + (180 - 90) * r.nextDouble(), true));
        }
        for(int i = 0; i < 2; i++){
            myBouquet.addFlower(new Tulip(Color.RED, 12 + (32 - 12) * r.nextDouble(), Odor.STRONG,
                    Country.UKRAINE, 90 + (280 - 100) * r.nextDouble()));
        }
        return myBouquet;
    }


    public static Bouquet chamomiles39(){
        Bouquet myBouquet = new Bouquet();
        Random r = new Random();
        for(int i = 0; i < 39; i++) {
            myBouquet.addFlower(new Chamomile(Color.RED, 12 + (32 - 12) * r.nextDouble(), Odor.INTOLERABLE,
                    Country.UKRAINE, 90 + (280 - 100) * r.nextDouble()));
        }
        return myBouquet;
    }
}
