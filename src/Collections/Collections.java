package Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        System.out.println("Set Collection");
        setCollection();
        System.out.println("List Collection");
        listCollection();
        System.out.println("Queue Collection");
        queueCollection();
        System.out.println("Map Collection");
        mapCollection();
        System.out.println("Unchangeable Collection");
        unchangeableList();
    }
    public static void setCollection(){
        Set <String> set = new HashSet();
            set.add("Orange");
            set.add("banana");
            set.add("Orange");
            set.add("lemon");
            set.add("Mango");

        //System.out.println("The size of the Set : " + set.size());
        //System.out.println("The elements of the set : " + set);

        var i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for (String item:
             set) {
            System.out.println(item);
        }

        set.forEach(item -> System.out.println(item));

        set.forEach(System.out::println);
    }

    public static void listCollection(){
        List list = new ArrayList();
        list.add("Orange");
        list.add("banana");
        list.add("Orange");
        list.add("lemon");
        list.add("Mango");
        System.out.println(list.get(3));
        System.out.println("The size of the list : " + list.size());
        System.out.println("The elements of the list : " + list);
    }

    public static void queueCollection(){
        Queue queue = new LinkedList();
        queue.add("Orange");
        queue.add("banana");
        queue.add("Orange");
        queue.add("lemon");
        queue.add("Mango");

        System.out.println("The size of the queue : " + queue.size() );
        System.out.println("The queue elements : " + queue );
        queue.remove();
        System.out.println("The queue after element removal : " + queue);
        System.out.println("The Head of the queued : " + queue.peek());
    }

    public static void mapCollection(){
        Map <String,Integer> map = new HashMap();
        map.put("apple", 95);
        map.put("mango", 23);
        map.put("lemon", 55);
        map.put("peach", 6);
        map.put("apple", 95);

        //System.out.println("The size of the map : " + map.size());
        //System.out.println(map);
        //System.out.println("The calories of lemon: " + map.get("lemon"));
        //map.remove("lemon");
        //System.out.println(map);
        for (var key:
             map.entrySet()) {
            System.out.println(key.getValue());
        }

        map.forEach((k,v) -> System.out.println("The Fruit " + k +" has " + v +" calories"));
    }

    public static void unchangeableList(){
        List unchangeable = List.of("apple", "mango" , "banana");
        try{
        unchangeable.add("mark");
        unchangeable.remove(1);
        }catch(Exception e){
            System.out.println("This list is unchangeable -> You can remove or add to it");
            e.printStackTrace();
        };
    }
}
