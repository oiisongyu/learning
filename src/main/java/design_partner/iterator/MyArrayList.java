package design_partner.iterator;

import java.util.Iterator;

/**
 * @author liusy
 * @since 2021/9/13上午12:08
 */
public class MyArrayList {
    int index = 0;
    private Object[] array= new Object[10];

    public void add(Object o){
        if (index >= array.length){
            Object[] newArray = new Object[array.length*2];
            System.arraycopy(array,0,newArray,0,array.length);
            array = newArray;
        }
        array[index] = o;
        index++;
    }

    public int size(){
        return array.length;
    }

    public Iterator<Object> iterator(){
        return new ArrayList_Iterator();
    }

    private class ArrayList_Iterator implements Iterator<Object>{
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < array.length;
        }

        @Override
        public Object next() {
            Object o = array[currentIndex];
            currentIndex ++;
            return o;
        }
    }
}
