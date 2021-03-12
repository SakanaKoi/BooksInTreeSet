package com.company;

public class Books implements Comparable<Books>{
    String author, title, date;

    public Books(String author, String title, String date) {
        this.author = author;
        this.title = title;
        this.date = date;
    }

    @Override
    public int compareTo(Books o) {
        if (this.author.compareTo(o.author) > 0) {
            return 1;
        }
        else if (this.author.compareTo(o.author) == 0) {
            return 0;
        }
        else return -1;
    }

    @Override
    public String toString() {
        return "{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                "} + \n";
    }
}
