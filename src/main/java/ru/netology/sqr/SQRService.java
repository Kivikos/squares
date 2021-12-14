package ru.netology.sqr;

public class SQRService {
    public int calculateSquares(int start, int end) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= start & square <= end) {
                quantity++;
            }
        }
        return quantity;
    }
}
