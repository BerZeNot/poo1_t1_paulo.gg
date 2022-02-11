package application;

import entities.CD;
import entities.DVD;
import entities.Item;

public class Program {
    public static void main(String[] args) {
        Item itens[] = new Item[5];

        itens[0] = new CD("Barões da Pisadinha ao vivo em Uberlândia", 120, "Barões da Pisadinha");
        itens[1] = new CD("The best of Avenged Sevenfold", 240, "Avenged Sevenfold");
        itens[2] = new DVD("Matrix 3", 230, "Lana Wachowski, Lilly Wachowski");
        itens[3] = new DVD("Die Hard", 160, "John McTiernan");
        itens[4] = new DVD("The Pirates of Silicon Valley", 150, "Martyn Burke");

        for(Item i : itens){
            i.print();
        }

    }
}
