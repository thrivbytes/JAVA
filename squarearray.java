public class squarearray {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    System.out.println("Number\tSquare");
    System.out.println("------------------");
    for(int i = 0 ; i < arr.length ; i++){
      int square = arr[i] * arr[i];
      System.out.println(arr[i] + "\t" + square);
    }
  }
}
