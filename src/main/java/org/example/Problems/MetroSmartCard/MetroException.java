package org.example.Problems.MetroSmartCard;


public class MetroException extends RuntimeException {
    MetroException(String message) {
        super(message);
    }
}

class InsufficientCardBalance extends RuntimeException {
    InsufficientCardBalance(String message) {
        super(message);
    }
}

class MinimumCardBalanceException extends RuntimeException {
    MinimumCardBalanceException(String msg) {
        super(msg);
    }
}