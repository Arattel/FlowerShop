package attributes;

import lombok.Getter;

@Getter
public enum Country {
    HOLLAND("Holland"), FRANCE("France"), UKRAINE("Ukraine"), AUSTRALIA("Australia"), JAPAN("Japan");
    private String name;
    Country(String country){
        this.name = country;
    }
}
