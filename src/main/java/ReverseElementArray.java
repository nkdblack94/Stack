import java.util.Stack;

public class ReverseElementArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("original array");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = stack.pop();
        }
        System.out.println("after reversing the array");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
