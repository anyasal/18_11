package org.example;
public class Main {
    public static void main(String[] args) {
        try {
            // Создание правильной дроби
            Fraction validFraction = new Fraction(3, 7);
            System.out.println("Дробь создана успешно: " + validFraction.getNumerator() + "/" + validFraction.getDenominator());

            // Попытка создания дроби с нулевым знаменателем
            Fraction invalidFraction = new Fraction(5, 0);
        } catch (NullDenominatorException e) {
            System.err.println(e.getMessage()); // Обработка исключения
        }
    }
}