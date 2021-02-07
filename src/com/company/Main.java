package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------List-------------------");
        List list = new ArrayList(); //список как обычный массив, без ограничений
        System.out.println("size "+list.size());
        List list1 = new Vector(); // список для будущей синхронизации
        List list2 = new LinkedList(); // список-очередь (имеет связи)

        list.add(101);
        list.remove(0); // удалить
        list.add(1); //доб.
        list.add(2);
        list.add(13);
        list.add(5);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i)); //показать.
        }

        System.out.println("----------------------------Queue-------------------");
        Queue q1 =new LinkedList(); // очередь не сортированая, первым пришёл первым ушёл
        q1.add(1);
        q1.add(3);//доб.
        q1.add(2);
        q1.offer(4);
        q1.offer(5);
        q1.offer(6);//доб.
        q1.remove(2);// удалить

        List list3 = (List) q1; //сортировка но в виде списка
        Collections.sort(list3);

        while (q1.size()>0){
            System.out.println(q1.poll()); // возвращает элемент из очереди и удалеёт его данные
            System.out.println(q1.peek()); // показать элемент из очереди
        }

        Queue q2 = new PriorityQueue();// очередь сортированая

        System.out.println("----------------------------Map-------------------");
        Map map1 = new HashMap(); // обычный массив + ключ
        Map map2 = new Hashtable(); // для синхронизации
        Map map3 = new LinkedHashMap(); // очередь
        Map map = new TreeMap(); //сортированный
        map.put("1", "One");
        map.put("3", "Three");
        map.put("2", "Two");
        System.out.println(map.get("3"));
        Set set4 = map.entrySet();
        for (Object o:set4){
            System.out.println(o);
        }


        System.out.println("----------------------------Set-------------------");
        // уникальные значения в Array, всё на основе массива
        Set set = new HashSet(); //обычный
        Set set1 = new LinkedHashSet(); // очередь
        Set set2 = new TreeSet(); // сортированный
        set.add(1);
        set.add("bb");
        set.add(15);
        for (Object o:set){
            System.out.println(o);
        }
    }
}
