package species;

import attributes.Color;
import attributes.Country;
import attributes.Odor;
import lombok.Getter;

@Getter
public class Rose extends Flower {
    private boolean spikes;
    public Rose(Color color, double stemLength, Odor odor, Country countryOfOrigin, double price, boolean spikes){
        super(color, stemLength, odor, countryOfOrigin, price);
        this.spikes = spikes;
    }
    @Override
    public String toString(){
        String flower = "";
        flower += String.format("Rose(color = %s, stem_len=%f, odor = %s, country = %s, price = %f", this.getColor().getCode(),
                this.getStemLength(), this.getOdor().getSmell(),
                this.getCountryOfOrigin().getName(), this.getPrice());
        if(this.spikes){
            flower += ", spikes = true)";
        }else {
            flower += ", spikes = false)";
        }
        return flower;
    }
}

