import java.util.*;

class second_largest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int i = 0 ; i < size; i++){
            int ans = Arrays.toString(array[i])
            System.out.println(Arrays.toString(array));

        }
        

    }
    
}
