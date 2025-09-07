package demo.collections;

import java.util.*;

public class DemoCollections {

    public static void demoCollections(){
        System.out.println("\n=== Java Collections Demo ===");

        // 1. LIST (mantiene orden, permite duplicados)
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A"); // duplicado permitido
        System.out.println("List: " + list);
        System.out.println("Elemento en posición 1: " + list.get(1));

        // 2. SET (no permite duplicados, no garantiza orden)
        Set<String> set = new HashSet<>();
        set.add("X");
        set.add("Y");
        set.add("X"); // duplicado, se ignora
        System.out.println("Set: " + set);

        // 3. LINKEDHASHSET (mantiene orden de inserción)
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Uno");
        linkedSet.add("Tres");
        linkedSet.add("Dos");
        linkedSet.add("Dos"); // ignorado
        System.out.println("LinkedHashSet (mantiene orden): " + linkedSet);

        // 4. TREESET (ordena automáticamente)
        Set<String> treeSet = new TreeSet<>(Arrays.asList("Perro", "Gato", "Ratón"));
        System.out.println("TreeSet (ordenado): " + treeSet);

        // 5. MAP (clave → valor, no acepta claves duplicadas)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Uno");
        map.put(2, "Dos");
        map.put(3, "Tres");
        map.put(2, "Dos Nuevo"); // sobrescribe el valor en la clave 2
        System.out.println("Map: " + map);
        System.out.println("Valor de la clave 2: " + map.get(2));

        // 6. LINKEDHASHMAP (mantiene orden de inserción)
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(101, "Rojo");
        linkedMap.put(102, "Verde");
        linkedMap.put(103, "Azul");
        System.out.println("LinkedHashMap (mantiene orden): " + linkedMap);

        // 7. TREEMAP (claves ordenadas)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Cinco");
        treeMap.put(2, "Dos");
        treeMap.put(9, "Nueve");
        System.out.println("TreeMap (ordenado por clave): " + treeMap);

        // 8. ITERACIÓN CON FOR-EACH
        System.out.println("Iterando sobre List:");
        for (String s : list) {
            System.out.println("- " + s);
        }

        System.out.println("Iterando sobre Map con entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

    }
}
