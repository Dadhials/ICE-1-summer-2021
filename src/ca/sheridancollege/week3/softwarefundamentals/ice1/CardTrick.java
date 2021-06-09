/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * 
 * Student Name: Supreet Dadhiala
 * Student ID: 991583230
 */


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            Random random = new Random();
            int ranValue = random.nextInt();
            c.setValue(ranValue);
            Random random2 = new Random();
            int ranValue2 = random.nextInt(4); // to generat between numbers 0-3. 
            c.setSuit(Card.SUITS[ranValue2]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the card value");
        int cardValue = in.nextInt();
        System.out.println("Enter the suit, you would like: ");
        String suitValue = in.next();
        
        // Creating new user card
        Card card = new Card();
        card.setValue(cardValue);
        card.setSuit(suitValue);
        
        // and search magicHand here
        for(int j = 0; j < magicHand.length; j++){
            if(card.equals(magicHand[j])){
                System.out.println("You have the same matching card!");
            } else{
                System.out.println("Sorry, your card didn't match!");
            }
        }
        //Then report the result here
        
       
    }
    
}
