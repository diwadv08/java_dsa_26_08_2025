package Basics.Olds;
interface Iterator1{
    int next();
    boolean hasNext();
}
interface Iterable1{
    Iterator1 getIterator();
}
class IteratorConstructor implements Iterable1{
    @Override
    public Iterator1 getIterator(){
        return new MyNewIterator();
    }
    private class MyNewIterator implements Iterator1 {
        int [] myArr={10,20,30,40,50};
        int index=0;

        @Override
        public boolean hasNext(){
            return index<myArr.length;
        }

        @Override
        public int next(){
            if(!hasNext())
                throw new RuntimeException("No More Elements");
            return myArr[index++];
        }
    }
}
public class BasicIterator {
    public static void main(String[] args) {
        IteratorConstructor myCon = new IteratorConstructor();
        Iterator1 it = myCon.getIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}