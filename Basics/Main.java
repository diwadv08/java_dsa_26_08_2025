package Basics;


interface Interator1{
    int next();
    boolean hasNext();
}
interface Iterabele{
    Interator1 getInterator1();
}

class IteratorClass implements Iterabele{
    public int[] arr = {10,20,30,40,80};
    @Override
    public Interator1 getInterator1(){
        return new MyOwnClass();
    }
    private class MyOwnClass implements Interator1{
        int index=0;
        int[] arr={2,3,4,5};
        @Override
        public boolean hasNext(){
            return index<arr.length;
        }
        @Override
        public int next(){
            while (!hasNext()) {
                throw new RuntimeException("No more elements");
            }
            return arr[index++];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        IteratorClass className=new IteratorClass();
        Interator1 it=className.getInterator1();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
