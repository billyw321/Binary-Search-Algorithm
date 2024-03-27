// V 1.2
// William Weney
package Midterm_PACK;
import java.util.Arrays;
public class Midterm {
    public static void main(String[] args) {
        // DECLARING ARRAYS
        // FIRST IS TIME
        int[] sourceTime_00e1 = {230524, 230641, 105950, 1444041, 213232, 803647, 104147, 185124, 062155, 440747};
        Arrays.sort(sourceTime_00e1); // SORT
        // NEXT IS THE ID
        int[] computerId_02d = {756, 478, 666, 123, 654, 951, 852, 658, 458, 256};
        Arrays.sort(computerId_02d); // SORT
        // NEXT IS THE STATUS
        int[] coordStatus_07d = {1241, 2235, 2324, 1814, 1425, 2130, 1855, 1751, 0234, 439};
        Arrays.sort(coordStatus_07d); // SORT
        // DECLARE POSTIONAL VARIABLES
        int lower_pos = 0;
        int upper_pos_1 = computerId_02d.length - 1;
        int upper_pos_2 = sourceTime_00e1.length - 1;
        int upper_pos_3 = coordStatus_07d.length - 1;
        // USE BINARY SEARCH FUNCTION TO FIND NUMBERS WE NEED, ASSIGNED TO VARIABLE
        int search_id = binary_search(lower_pos, upper_pos_1, computerId_02d, 1855); // FOR ID
        int search_time = binary_search(lower_pos, upper_pos_2, sourceTime_00e1, 213232); // FOR TIME
        int search_status = binary_search(lower_pos, upper_pos_3, coordStatus_07d, 2130); // FOR COORD STATUS
        // CONSOLE OUTPUT BELOW
        if (search_status == -1){
            System.out.println("                        >>>>>>FAILED<<<<<<");
            System.out.println("Flight AAL4542 ID, source time, or coordination status not valid.");
        }else{
            System.out.println("                        >>>>>>SUCCESS<<<<<<");
            System.out.println("The flight American Airlines AAL452 departed at hhmmss at 9:32:32 P.M. with computer ID:1855, with coordination status at 4:37 P.M.");
        }
    }
    // BINARY SEARCH FUNCTION TO FIND NUMBERS WE NEED
    public static int binary_search(int lower_position, int upper_position, int []arr, int search){
        while (lower_position<=upper_position){
            int middle = (lower_position+upper_position)/2;
            if (arr[middle] == search){
                return(middle); // RESULT
            }
            if (arr[middle]< search){
                lower_position = middle +1;
            } else{
                upper_position = middle -1;
            }
        }
        return -1;
    }
}
