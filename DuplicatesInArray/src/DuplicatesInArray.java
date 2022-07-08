public class DuplicatesInArray {
    public static void main(String [] args){
        int [] arr = {2, 3, 1, 1, 6, 3, 2, 8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])-1] < 0)
                System.out.println(Math.abs(arr[i]));
            else
                arr[Math.abs(arr[i])-1] *= -1;
        }
    }
}
