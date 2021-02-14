package com.creditcardvalidation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditcardTest {
    Creditcard creditCard;

    @BeforeEach
    void setUp() {
        creditCard = new Creditcard();
    }

    @AfterEach
    void tearDown() {
        creditCard = null;
    }

    @Test
    void testThatCreditCardNumberCanBeInputted(){
        long creditCardNumber = 4388576018402626L;
        creditCard.setDigit(creditCardNumber);
        assertEquals(creditCardNumber, creditCard.getDigit());
    }

    @Test
    void testForCreditCardType(){
        creditCard.setPrefix(4);
        assertEquals("Visa", creditCard.getCardType());
    }

    @Test
    void testForSumOfDoubleOfEvenNumbersInDigit(){
        long creditCardNumber = 4388576018402626L;
        creditCard.setDigit(creditCardNumber);
    }

}