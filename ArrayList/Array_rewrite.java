public class Array_rewrite {
    public static void main(String[] args) {
        // создание массива размерностью 5
        int[] arr1 = new int[5];
        System.out.println(arr1.length);
        
        // creation a new array
        
        /* That is, we have created a new object - array (through "new"),
        and there are no longer references to the previous object.*/
        
        arr1 = new int[25];
        System.out.println(arr1.length);
    }
}
