package task7;

public class StringIndexOutOfBoundsExample {

	public static void main(String[] args) {
		String str = "Hello";
        try {
            System.out.println(str.charAt(5)); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }

	}

}
