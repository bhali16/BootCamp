package com.bootcamp.arraylist;

public class Warray {
    public int size;
    public int elementCount = 0;

    public int[] temp;

    public int getSize() {
        return this.elementCount;
    }

    public void add(int element){
        this.temp[this.elementCount] = element;
        this.elementCount++;
    }

    public void remove(int index){
        int toRemove = this.temp[index];
        int tempSize = this.size - 1;
        int[] newTemp = new int[tempSize];
        for (int i=0, counter=0; i<this.elementCount; i++){
            int currentElement = this.temp[i];
            if(currentElement == toRemove && i == index){
                System.out.print("Element removed at index "+ index + " " + this.temp[index]);
            }else{
                newTemp[counter] = this.temp[i];
                counter++;
            }
        }
        this.temp = newTemp.clone();
    }

    public void get(int index){
        System.out.println("Element on given index is :"+this.temp[index]);
    }

    public void getAll(){
        for(int i=0; i<this.temp.length; i++){
            System.out.print("\n"+ "["+i+"]"+ this.temp[i]);
        }
    }

    public Warray(int size, int[] temp, int elementCount){
        this.size = size;
        this.temp = temp;
        this.elementCount = elementCount;
    }


}
