package Array;
import java.util.Scanner;

class MyList{
    private int size;
    private static final int default_byte=16;
    private int capacity;
    private int[] arr;
    MyList(){
        size=0;
        capacity=default_byte;
        arr=new int[default_byte];
    }
    void addAtEnd(int value){
        if(size==capacity)
            expandArray();
        arr[size++]=value;
        System.out.println(value+" inserted at the End!");
        System.out.println("Size: "+size);
        System.out.println("Capacity: "+capacity);
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    int length(){
        return size;
    }
    void expandArray(){
        capacity*=2;
        arr=java.util.Arrays.copyOf(arr, capacity);
    }
    void shrinkedData(){
        capacity/=2;
        arr=java.util.Arrays.copyOf(arr, capacity);
    }
    void insertAt(int pos,int val){
        if(size==capacity)
            expandArray();
        if(pos>size || pos<0){
            System.out.println("Invalid Check the Position!!");
        }
        for(int i=size-1;i>=pos;i--)
            arr[i+1]=arr[i];
        arr[pos]=val;
        size++;
    }
    void delete(int pos){
        if(pos>size || pos<0){
            System.out.println("Invalid Check the Position!!");
        }
        for(int i = pos; i < size - 1; i++)
            arr[i]=arr[i+1];
        size--;
        System.out.println("Element at position " + pos + " deleted.");

        if(capacity>default_byte && capacity>3*size)
            shrinkedData();
    }
    void deleteLast(){
        size--;
    }
    void insertAtFront(int val){
        if(size==capacity)
            expandArray();
        for(int i=size-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=val;
        size++;
    }
    void modifyData(int pos,int val){
        System.out.println("Og Data");
        display();
        for(int i=0;i<size;i++)
            if(i==pos)
                arr[i]=val;
        System.out.println("Modified Data");
        display();
    }
    void clear(){
        for(int i=0;i<size;i++)
            arr[i]=0;
        size=0;
    }
    void findValue(int pos){
        if(pos>size || pos<0)
            System.out.println("Invalid");
        System.out.println("The value of at "+pos+" is " +arr[pos]);
    }
    boolean isPresent(int val){
        for(int i=0;i<size;i++)
            if(arr[i]==val)
                return true;
        return false;
    }
}

public class NewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos,val;
        MyList myList= new MyList();
        while(true){
            System.out.println("\n=========== Menu List Starts =========");
            System.out.println("1.Insert At End");
            System.out.println("2.View All List");
            System.out.println("3.Insert At End");
            System.out.println("4.Delete the particular item");
            System.out.println("5.Exit and Loops Stops");
            System.out.println("6.Delete At End");
            System.out.println("7.Insert At Begining");
            System.out.println("8.Modify Existing Data");
            System.out.println("9.Erase All Data");
            System.out.println("10.Search the Value at position");
            System.out.println("11.Is value is there Or Not");
            System.out.println("0.Exit Process");
            System.out.println("=========== Menu List Ends =========");
            System.out.print("Enter Your Choice\t");
            int myChoice = sc.nextInt();
            switch (myChoice) {
                case 1:
                    System.out.print("Give you data to add\t");
                    val=sc.nextInt();
                    myList.addAtEnd(val);
                    break;
                case 2:
                    System.out.print("Overall Data\n");
                    myList.display();
                    break;
                case 3:
                    System.out.println("Position for the value which to be modified");
                    pos=sc.nextInt();
                    if(myList.length()>pos){
                        System.out.println("New Value!!");
                        val=sc.nextInt();
                        myList.insertAt(pos,val);
                    }
                    else{
                        System.out.println("There was no "+pos+"th - position");
                    }
                    break;
                case 4:
                    System.out.println("Position for the value which to be deleted");
                    pos=sc.nextInt();
                    if(myList.length()>pos){
                        myList.delete(pos);
                    }
                    else{
                        System.out.println("There was no "+pos+"th - position");
                    }
                    break;
                case 5:
                    System.out.println("Are you sure want to stop the execution give 0??");
                    val=sc.nextInt();
                    if(val==0){
                        System.exit(0);
                    }
                    break;
                case 6:
                    System.out.println("Deleting the last value");
                    myList.deleteLast();
                    break;
                
                case 7:
                    System.out.println("Insert at Begining");
                    System.out.println("Value to be Inserted at front");
                    val=sc.nextInt();
                    myList.insertAtFront(val);
                    break;
                case 8:
                    System.out.println("Modify the existing value");
                    System.out.println("Enter the postion");
                    pos=sc.nextInt();
                    System.out.println("Enter the new data");
                    val=sc.nextInt();
                    myList.modifyData(pos,val);
                    break;
                case 9:
                    System.out.println("Delete all Data");
                    myList.clear();
                    break;
                case 10:
                    System.out.println("Find the value in the position");
                    System.out.println("Enter Position");
                    pos=sc.nextInt();
                    myList.findValue(pos);
                    break;
                
                case 11:
                    System.out.println("Whether Value is there or Not");
                    System.out.println("Enter Value");
                    val=sc.nextInt();
                    System.out.println(myList.isPresent(val));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a valid value");
                    break;
            }
        }
    }
}