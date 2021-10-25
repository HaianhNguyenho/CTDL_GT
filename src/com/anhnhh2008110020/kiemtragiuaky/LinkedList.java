package com.anhnhh2008110020.kiemtragiuaky;

public class LinkedList {
    String color;
    int id;
    Double weight;
    Node head;
    Node tail;
    public LinkedList() {
        this.color = "Vàng";
        this.id = 2003;
        this.weight = 3.0;
        this.head = null;
        this.tail = null;
    }
    public String color(){
        return this.color;
    }
    public int id(){
        return this.id;
    }
    public Double weight(){
        return this.weight;
    }
}

