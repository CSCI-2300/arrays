import java.util.ArrayList;

public class Example {

    public static void main(String []args) {
        int []values = new int[10];
        System.out.println("Length of values array is: " + values.length);
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+" ");
        }
        System.out.println("");
        System.out.println("Length of values array is: " + values.length);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Length of numbers array list is: " + numbers.size());
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("");
        System.out.println("Length of numbers array list is: " + numbers.size());

    }
}
