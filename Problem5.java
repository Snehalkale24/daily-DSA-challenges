public class Problem5 {
    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int[] leaders = new int[n]; 
        int count = 0;
        
        int maxFromRight = arr[n - 1];
        leaders[count++] = maxFromRight;
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders[count++] = arr[i];
                maxFromRight = arr[i];
            }
        }
        
        System.out.print("Leaders: [");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(leaders[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }
}
