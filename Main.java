package lab_7;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        MyList myList = new MyList(new Coffee(15.0, 150, 30, "beans", 20.0));
        myList.add(new Coffee(25.0, 450, 10, "beans", 32.0));
        myList.add(new Coffee(35.0, 99, 24, "beans", 23.0));

        Coffee coffee = new Coffee(15.0, 150, 30, "beans", 20.0);

        MyList emptyList = new MyList();
        emptyList.add(new Coffee(15.0, 150, 30, "beans", 20.0));

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Coffee(15.0, 150, 30, "beans", 20.0));
        arrayList.add(new Coffee(15.0, 150, 30, "beans", 20.0));
        arrayList.add(coffee);
        MyList list2 = new MyList(arrayList);

        for (lab_7.Coffee Coffee : list2) {

            System.out.println(Coffee);

        }

        System.out.println("-------------------------------------------------");
        ListIterator listIterator = list2.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println("-------------------------------------------------");
        System.out.println(list2.contains(coffee));

    }
}
