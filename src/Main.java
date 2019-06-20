import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


//    public static void check_upper(String x)
//    {
//        String[] alphabet_lower = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//
//    }
//
//    public static void check_lower(String x)
//    {
//        String[] alphabet_upper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//
//    }

    public static List<String> sort(List<String> list1, String[] list2, List<String> sorted)
    {
        for(int i = 0; i<list2.length;i++) {
            if(sorted.size()== 3)
            {
                break;
            }
            for (int j = 0; j < list1.size(); j++){
                if(list2[i].equals(list1.get(j)))
                {
                    sorted.add(list1.get(j));
                    break;
                }
            }
        }
        return sorted;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<String> unsorted_list =new ArrayList<String>();
        List<String> sorted_list =new ArrayList<String>();
        String[] alphabet_lower = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] alphabet_upper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};


        System.out.println("Enter the first letter: ");
        unsorted_list.add(in.next());
        System.out.println("Enter the second letter: ");
        unsorted_list.add(in.next());
        System.out.println("Enter the third letter: ");
        unsorted_list.add(in.next());

        System.out.println("The unsorted list is:" +unsorted_list);

        sorted_list = sort(unsorted_list,alphabet_lower,sorted_list);
        
        System.out.println("The sorted list is:" +sorted_list);



    }
}
