package species;

import attributes.Color;
import attributes.Country;
import attributes.Odor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private Color color;
    private double stemLength;
    private Odor odor;
    private Country countryOfOrigin;
    private double price;
    Flower(Color color, double stemLength, Odor odor, Country countryOfOrigin, double price){
        this.color = color;
        this.stemLength = stemLength;
        this.odor = odor;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
    }
}
