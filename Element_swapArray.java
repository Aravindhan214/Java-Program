public class array {
   public static void main(String[] args) {
      long arr[] = { 1,2,3,4,5,6,7,8,9,11};
      
      System.out.println("The array elements before swapping are-");
      for (long i : arr) {
         System.out.print(i + " ");
      }
   
      int firstIndex = 1, secondIndex = 3,Third=5,fourth=7;
      
      long temp1 = arr[firstIndex];
      
      arr[firstIndex] = arr[secondIndex];
      arr[secondIndex] = temp1;

      long temp2 = arr[Third];

      arr[Third] = arr[fourth];
      arr[fourth] = temp2;
      System.out.println("\nThe array elements after swapping are-");
      for (long i : arr) {
         System.out.print(i + " ");
      }
   }
}
