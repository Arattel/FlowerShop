package bouquets;

import species.Flower;

import java.util.LinkedList;
import java.util.List;

public class   Bouquet {
    private List<Flower> flowers;
    Bouquet(){
        this.flowers = new LinkedList<Flower>();
    }
    public void addFlower(Flower flower){
        this.flowers.add(flower);
    }
    Bouquet(List<Flower> flowers){
        this.flowers = new LinkedList<Flower>();
        for (Flower flower:
                flowers) {
            this.addFlower(flower);
        }
    }
    public double getPrice(){
        double price = 0;
        for (Flower flower:
                this.flowers) {
            price += flower.getPrice();
        }
        return price;
    }
    @Override
    public String toString(){
        String bouquet = "[";
        for (Flower flower:
             flowers) {
            bouquet += flower.toString() + ", ";
        }
        bouquet = bouquet.substring(0, bouquet.length() - 2);
        bouquet += "]";
        return bouquet;
    }



}