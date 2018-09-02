package se.dala.mtgcard.model;

import java.util.List;

public final class CardSet {
    private String name;
    private String info;
    private List<Card> cardList;

    public CardSet(String name, String info, int cardAmount, List<Card> cardList) {
        this.name = name;
        this.info = info;
        this.cardList = cardList;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String setInfo(String info) {
        this.info = info;
        return info;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public List <Card> setCardList(List<Card> cardList) {
        this.cardList = cardList;
        return cardList;
    }

    public Card addCardToCardList(Card newCard) {
        cardList.add(newCard);
        return cardList.get(cardList.size());
    }
}
