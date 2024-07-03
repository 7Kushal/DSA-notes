package Heaps;

public class Max_heap {
    int cap;
    int index;
    int[] arr;
    Max_heap(int cap){
        this.cap=cap;
        arr=new int[cap];
        index=-1;
    }
    int getMax(){
        if(index==-1)return -1;
        return arr[0];
    }
    boolean insert(int data){
        if(index+1==cap)return false;
        arr[index+1] = data;
        shiftup(index+1);
        index++;
        return true;
    }
    boolean delete(){
        if(index==-1)return false;
        arr[0]=arr[index];
        index--;
        shiftDown();
        return true;
    }
    private void shiftup(int i) {
       while(true){
        if(arr[i/2]<arr[i]){
            swap(i/2,i);
            i=i/2;
        }
        else
        break;
       }
    }
    private void shiftDown(){
        int ind=0;
        while(true){
            int left = 2*ind+1;
            int right = 2*ind+2;
            int max = arr[ind];
            if(left>index)break;

            if(arr[left]>max)max=arr[left];
            if(right<=index&&arr[right]>max)max = arr[right];

            if(max==arr[ind])break;
            if(max==arr[left]){
                swap(ind,left);
                ind=left;
            }
            else{
                swap(ind,right);
                ind=right;
            }

        }

    }
    private void swap(int index2, int left) {
        int temp = arr[index2];
        arr[index2]=arr[left];
        arr[left]=temp;
    }

}
