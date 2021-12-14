package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSquares() {
        SQRService service = new SQRService();
        int start = 100;
        int end = 9801;
        int expected = 90;

        int actual = service.calculateSquares(start, end);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquaresRangeUnderSquareOfNumberTen() {
        SQRService service = new SQRService();
        int start = 80;
        int end = 90;
        int expected = 0;

        int actual = service.calculateSquares(start, end);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquaresRangeOverSquareOfNumberNinetyNine() {
        SQRService service = new SQRService();
        int start = 9802;
        int end = 9803;
        int expected = 0;

        int actual = service.calculateSquares(start, end);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquaresLikeInExample() {
        SQRService service = new SQRService();
        int start = 200;
        int end = 300;
        int expected = 3;

        int actual = service.calculateSquares(start, end);

        assertEquals(expected, actual);
    }

}