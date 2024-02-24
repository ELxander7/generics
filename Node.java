package ru.itis.ing304.dz2;

public class Node<T> {
    T value;
    Node<T> next;
    Node<T> prev;
    public Node(T value){
        this.value = value;
    }

}
