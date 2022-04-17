package package8_forEach;

public class Q2 {
    public static void main(String[] args) {

        // String[] list = {"fruits", "vegetables", "meat", "milk"};
        // print array with for each loop
        // print length of each element

        // Part 2:
        // Print all the elements from array using for eachLoop
        // If an element starts with 'v' then quit the loop

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String element : list) {
            System.out.print(element + " : " + element.length() + " " ); // fruits : 6 vegetables : 10 meat : 4 milk : 4

        }

        System.out.println();
        for (String item:list
             ) {
            if (item.startsWith("v")){
                break;

            }

            System.out.println(item);
        }


    }
}
