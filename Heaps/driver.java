package Heaps;

public class driver {
    public static void main(String[] args) {
        Min_heap min_heap = new Min_heap(10);
        Max_heap max_heap = new Max_heap(10);
        max_heap.insert(5);
        max_heap.insert(10);
        max_heap.insert(20);
        max_heap.insert(30);
        max_heap.delete();
        max_heap.insert(50);
        System.out.println(max_heap.getMax());
    }
}
