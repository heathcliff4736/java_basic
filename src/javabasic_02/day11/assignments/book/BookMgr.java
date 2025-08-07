package javabasic_02.day11.assignments.book;

import javabasic_02.day10.morningtest.Account;

public class BookMgr {
    Book[] booklist = new Book[5];
    private int totalPrice = 0;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist() {
        for (int i = 0; i < booklist.length; i++) {
            System.out.println(booklist[i].getTitle());
        }
    }

    public void printTotalPrice() {
        for (int i = 0; i < booklist.length; i++) {
            totalPrice += booklist[i].getPrice();
        }
        System.out.println("전체 책 가격의 합 : "+totalPrice);
    }
}
