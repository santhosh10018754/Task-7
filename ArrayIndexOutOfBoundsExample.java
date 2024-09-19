package task7;

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        try {
           
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

	}

}
