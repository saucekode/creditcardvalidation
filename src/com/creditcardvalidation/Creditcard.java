package com.creditcardvalidation;

public class Creditcard {
    private long creditCardNumber;
    private int prefix;
    private final int FOUR = 4;
    private final int FIVE = 5;
    private final int THIRTYSEVEN = 37;
    private final int SIX = 6;

    public void setDigit(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getDigit() {
        return creditCardNumber;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    private int getPrefix(){
        return prefix;
    }

    public String getCardType(){
        return switch(getPrefix()){
            case FOUR -> "Visa";
            case FIVE -> "Mastercard";
            case THIRTYSEVEN -> "American Express";
            case SIX -> "Discover";
            default -> throw new IllegalStateException("Card type does not exist");
        };
    }

}
