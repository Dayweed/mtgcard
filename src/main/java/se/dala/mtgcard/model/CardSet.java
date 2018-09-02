package se.dala.mtgcard.model;

public final class CardSet {
    private String name;
    private String setInfo;
    private int cardAmount;

    public CardSet(String name, String info, int cardAmount) {
        this.name = name;
        this.setInfo = info;
        this.cardAmount = cardAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetInfo() {
        return setInfo;
    }

    public void setSetInfo(String setInfo) {
        this.setInfo = setInfo;
    }

    public int getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(int cardAmount) {
        this.cardAmount = cardAmount;
    }
}
