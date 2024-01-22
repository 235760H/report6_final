package jp.ac.uryukyu.ie.e235760;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> deck = new ArrayList<>(52);
        shuffleDeck(deck);

        List<Integer> player = new ArrayList<>();
        List<Integer> dealer = new ArrayList<>();
        player.add(deck.get(0));
        dealer.add(deck.get(1));
        player.add(deck.get(2));
        dealer.add(deck.get(3));
        System.out.println("playerの1枚目は" + toNumber(player.get(0)));
        System.out.println("dealerの1枚目は" + toNumber(dealer.get(0)));
        System.out.println("playerの2枚目は" + toNumber(player.get(1)));
        System.out.println("dealerの2枚目は" + toNumber(dealer.get(1)));
        int playertotal = toNumber(player.get(0)) + toNumber(player.get(1));
        int dealertotal = toNumber(dealer.get(0)) + toNumber(dealer.get(1));
        System.out.println("playerの合計は" + playertotal);
        System.out.println("dealerの合計は" + dealertotal);
    }

    public static void shuffleDeck(List<Integer> deck){
        for(int i = 1;i <= 52; i++){
            deck.add(i);
        }

        Collections.shuffle(deck);
        /*for (int i = 0;i<deck.size();i++){
            System.out.println(deck.get(i));
        }*/
    }

    public static int toNumber(int cardNumber){
        int number = cardNumber % 13;
        if (number == 0){
            number = 13;
        }
        if(number == 11||number == 12||number == 13){
            number = 10;
        }
        return number;
    }
}
