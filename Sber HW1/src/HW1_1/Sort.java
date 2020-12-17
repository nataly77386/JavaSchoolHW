package HW1_1;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[5];
        AddElem(array);
        BubbleSort(array);

    }

    private static void AddElem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() *100);
            System.out.println(array[i]);
        }
    }

    public static void BubbleSort(int[] array){
        boolean sorted=false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                    System.out.println(ArrayToStr(array));
                }
            }
        }

    }

    public static String ArrayToStr(int[] array){
        String tempArr = new String();
        for (int i=0; i<array.length;i++){
            tempArr+=array[i];
        }
        return tempArr;
    }


}


