
public class IterateStringArrayExample {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "danang", "inam", "sultan", "jusril"};

        // Using a for loop 
        for (int i = 0; i < stringArray.length; i++) {
            String a = stringArray[i];
            System.out.print(a + " ");
        }
        System.out.println();

        // Using an enhanced for loop
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        String [] oldArray = {"Hello", "danang", "inam", "sultan", "jusril"};
        String newElement = "kita";
        String [] newArray = new String[oldArray.length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        newArray[newArray.length - 1] = newElement;

        for(String s : newArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
