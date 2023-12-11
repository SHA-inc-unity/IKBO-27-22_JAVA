/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Artem
 */

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.pages = 1;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTile(String title){
        this.title = title;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public String getAuthor(){
        return author;
    }

    public String getTile(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public void OutInfoString(){
        System.out.println(this.title+", author "+this.author+", pages "+this.pages);
    }


    public String toString(){
        return this.title+", author "+this.author+", pages "+this.pages;
    }
}