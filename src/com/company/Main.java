package com.company;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Books book1 = new Books("Карлос Сафон", "Лабиринт призраков", "2016");
        Books book2 = new Books("Янн Мартел", "Жизнь Пи", "2001");
        Books book3 = new Books("Франц Кафка", "Дневники и письма", "1995");
        Books book4 = new Books("Василий Орехов", "Линия огня", "2008");
        Books book5 = new Books("Даниэль Пеннак", "Собака Пес", "2009");
        Books[] bookList = {book1, book2, book3, book4, book5};

        TreeSet<Books> bookTree = new TreeSet<>(Arrays.asList(bookList));
        System.out.println(bookTree);
    }
}
