package design_partner.iterator;

import java.util.Iterator;

/**
 * @author liusy
 * @since 2021/9/13上午12:14
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList);
        Iterator<Object> iterator = myArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
