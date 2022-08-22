package arrays;

import java.security.MessageDigest;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

class P1_array_crud {
    int currentSize;
    int arr[];
    P1_array_crud(int capacity){
        this.arr=new int[capacity]; 
        int currentSize = 0; 
      }
    void insert(int index,int value){
        if(index > currentSize){
            throw new RuntimeException("index can not be greater than current size!");
        }
        if(currentSize==arr.length){
            System.out.println("array is empty!");
            return;
        }
        for(int i =currentSize-1;i >= index;i--){
            arr[i+1]=arr[i];
        }

        arr[index]=value;
        currentSize++;
        System.out.println("Element added");
        print();

    }
    void delete(){
        if (currentSize==0){
           System.out.println("array is empty!");
           return;

        }
        for(int i =index;i <currentSize;i++){
            arr[i]=arr[i+1];
        }

        arr[currentSize-1]=0;
        currentSize--;
        System.out.println("Element removed");
        print();

    }
    int search(int val){
        for(int i =0;i<arr.length;i++){
            if (arr[i]==val){
                return i;
            }
        }
        System.out.println("not found!");
        return -1;
    }
    void update(int valToSearch,int valToUpdate){
        int index = search(valToSearch)
        if (index == -1){
            return;
        }
        else {
            arr[index] = valToUpdate;
            System.out.println("value updated");
            print();

        }
    }
    void print(){
        for (int ele:arr){
            System.out.println(ele + ",");
        }
    }
    public static void main(String[] args) {
        P1_array_crud obj = new P1_array_crud(5);
        //obj.insert(0, 1);
        //obj.insert(1, 2);
        Scanner scanner = new Scanner(System.in);
        int choice;
        int index;
        int value;
        while (true){
            System.out.println("Array crud op's : ");
            System.out.println("1. Insert op's ");
            System.out.println("2. Remove op's ");
            System.out.println("3. Search op's ");
            System.out.println("4. Update op's ");
            System.out.println("EXIT");
            choice = scanner.nextInt()
        }
    }
}
enum ArrayOperations{
    INSERT,DELETE,SEARCH,UPDATE,PRINT,EXIT
}