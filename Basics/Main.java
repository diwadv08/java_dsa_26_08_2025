package Basics;

interface Iterator1<T>{
    T next();
    boolean hasNext();
}
interface Iterable1<T>{
    Iterator1<T> getIterator1();
}
class MyConIterator<T> implements Iterable1<T>{
    private T[] myArr;
    MyConIterator(T[] arr){
        this.myArr=arr;
    }

    @Override
    public Iterator1<T> getIterator1(){
        return new MyInnerClass();
    }
    private class MyInnerClass implements Iterator1<T>{
        int index=0;
        @Override 
        public boolean hasNext(){
            return index < myArr.length;
        }
        public T next(){
            if(!hasNext())
                throw new RuntimeException("No More Elements");
            return myArr[index++];
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Integer[] intArr={1,6,7,8,10};
        MyConIterator<Integer> myCon=new MyConIterator<>(intArr);
        Iterator1<Integer> it=myCon.getIterator1();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        String[] strArr={"Hello","Bye","World"};
        MyConIterator<String> myCon1=new MyConIterator<>(strArr);
        Iterator1<String> it1=myCon1.getIterator1();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}