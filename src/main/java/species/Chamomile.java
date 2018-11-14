package species;

import attributes.Color;
import attributes.Country;
import attributes.Odor;

public class Chamomile extends Flower {
    public Chamomile(Color color, double stemLength, Odor odor, Country countryOfOrigin, double price){
        super(color, stemLength, odor, countryOfOrigin, price);
    }
    @Override
    public String toString(){
        String flower = "";
        flower += String.format("Chamomile(color = %s, stem_len=%f, odor = %s, country = %s, price = %f)", this.getColor().getCode(),
                this.getStemLength(), this.getOdor().getSmell(),
                this.getCountryOfOrigin().getName(), this.getPrice());
        return flower;
    }
}
