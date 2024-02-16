public class RemoveDuplicate {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "apple", "orange", "banana", "grape"};

        System.out.println("Original array length: " + strings.length);

        System.out.print("Array elements are: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }

        System.out.println("\nThe new length of the array is: " + removeDuplicates(strings));
    }

    public static int removeDuplicates(String[] strings) {
        int index = 0;
        for (int i = 1; i < strings.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (strings[i].equals(strings[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                strings[index++] = strings[i];
            }
        }

        return index;
    }
}
