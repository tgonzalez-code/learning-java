package demo.collections;

import java.util.*;
import java.util.stream.Collectors;

public class DemoCollectionsQueue {

    public void demoQueue(){
        Deque<String> deque = new LinkedList<>();
        // Agregar elementos (enqueue)
        deque.add("A");
        deque.add("B");
        deque.add("C");
        deque.add("D");
        deque.add("E");

        System.out.println("***** Demo Queue: " + deque);

        // Ver el primer elemento (peek)
        System.out.println("Head Queue element(): " + deque.element()); // Throw an exception if is Empty, don't remove head element
        System.out.println("Head Queue Peek(): " + deque.peek()); // Don't Throw an exception if is Empty, don't remove head element

        // Sacar elementos (dequeue)
        System.out.println("Get and remove Poll(): " + deque.poll()); //Throws Exception – if this deque is empty, remove head element
        System.out.println("Remove(): " + deque.remove()); // , remove head element
        System.out.println("Final Queue: " + deque);

        // Agregar otro
        deque.offer("D"); //
        System.out.println("Cola final: " + deque);

        // 1. Streams + Lambdas
        System.out.println("\n=== Streams + Lambdas ===");
        deque.stream()
                .map(String::toLowerCase) // convertir a minúsculas
                .filter(e -> !"c".equals(e)) // filtrar letras distintas de 'c'
                .forEach(e -> System.out.println("Procesando: " + e));

        // 🔹 2. Collectors: transformar en otra colección
        List<String> listaDuplicada = deque.stream()
                .map(e -> e + e) // duplicar caracteres
                .collect(Collectors.toList());
        System.out.println("Lista duplicada con streams: " + listaDuplicada);

        // 🔹 3. Ejemplo con Java 21 - SequencedCollection
        SequencedCollection<String> seq = deque;
        // LinkedList implementa SequencedCollection en Java 21
        //if (deque instanceof SequencedCollection<String> seq) {
            System.out.println("\n=== Java 21 SequencedCollection ===");
            System.out.println("Primer elemento (getFirst): " + seq.getFirst());
            System.out.println("Último elemento (getLast): " + seq.getLast());
            System.out.println("En orden inverso: " + seq.reversed());
        //}

        // 🔹 4. Java 21 - Pattern Matching con switch
        System.out.println("\n=== Java 21 Pattern Matching ===");
        Object obj = deque.peek();
        switch (obj) {
            case String s -> System.out.println("Es un String: " + s);
            case Integer i -> System.out.println("Es un entero: " + i);
            default -> System.out.println("Otro tipo de objeto");
        }
    }
}
