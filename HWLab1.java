import java.util.Random;

public class HWLab1 {
    int Array[] = {22,33,44,55,66,77,88};
    public void print(int [] items) {
        System.out.print("[");
        for (int i = 0; i < items.length; i++) {
            if (i == items.length - 1) {
                System.out.print(items[i]);

            }else {
                System.out.print(items[i] + ",");
            }
        }
        System.out.println("]");
    }

    public void ForReverse(int[] n) {
        int lastItem = n.length - 1;
        for (int i = 0; i < n.length / 2; i++) {
            int temp = n[i];
            n[i] = n[lastItem];
            n[lastItem] = temp;
            lastItem--;
        }
    }

    public void ForCloneArray(int[] from, int[] to) {
        int size = from.length;
        for (int i = 0; i < size; i++) {
            to[i] = from[i];
        }
    }

    public void ForRemove(int elem){
        int size = Array.length - 1;
        int temp[] = new int[size];

        if (Array[size] == elem) {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = Array[i];
            }
            Array= temp;

        }else {
            boolean isFound = false;
            for (int i = 0; i < size; i++) {
                if (Array[i] == elem || isFound) {
                    Array[i] = Array[i + 1];
                    isFound = true;
                }
            }
            if (isFound){
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = Array[i];
                }
                Array = temp;
            }
            else {System.out.println("  Not found! the element");}
        }
    }
    public void ForRemoveRandom(){
        Random r = new Random();

        while (Array.length != 0){
            int index = r.nextInt(Array.length);
            ForRemove(Array[index]);
        }
    }

    public static void main(String[] args) {
        HWLab1 hw=new HWLab1();
        hw.print(hw.Array);
        hw.ForRemove(33);
        hw.print(hw.Array);
        hw.ForReverse(hw.Array);
       hw.print(hw.Array);




    }


}
