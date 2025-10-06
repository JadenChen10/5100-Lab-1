import java.util.ArrayList;

public class Lab1 {
    public static void main(String[] args) {
        // --------- Part 1: Array ---------
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {5, 4, 3, 2, 1};
        int[] z = new int[5];

        for (int i = 0; i < 5; i++) {
            if (x[i] > y[i]) {
                z[i] = x[i];
            } else {
                z[i] = y[i];
            }
        }

        System.out.print("Array x = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Array y = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        // --------- Part 2: ArrayList ---------
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aurora");
        names.add("Isabella");
        names.add("Chloe");
        names.add("Natalie");
        names.add("Sophia");

        System.out.print("Names = { ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            if (i < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Names (switched) = { ");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            String newName;

            if (name.length() > 1) {
                char first = name.charAt(0);
                char last = name.charAt(name.length() - 1);
                String middle = name.substring(1, name.length() - 1);

                newName = last + middle + first;

                newName = newName.substring(0,1).toUpperCase() + newName.substring(1).toLowerCase();
            } else {
                newName = name; 
            }

            System.out.print(newName);
            if (i < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}
