package ru.itis.ing304.dz2;

public class Main {
    public static void main(String[] args) {
        try{
            List304ImpAsLinkedList<Integer> list = new List304ImpAsLinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println("List: " + list.toString());
            System.out.println("Element on index 1: " + list.get(1));
            list.delete(0);
            System.out.println("List after delete: " + list.toString());
            System.out.println("Extract element: " + list.pop());
            System.out.println("Count of elements in list: " + list.getSize());
            System.out.println("Hello world!");

        }
        catch (EmptyElementException | IndexOutOfBoundsException | EmptyArrayException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}