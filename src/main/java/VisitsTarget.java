/*  You are given an array of non-negative integers, visits, which represents
*   how many people visited a website on consecutive days.
*   Visits[0] is the number of visitors on the first day.
*   Visits[1] is the number of visitors on the second day and so on.
*
*   Your task is to return the index i of the first day when the
*   total number of visitors reaches a given target.
*   So: visits[0] + visits[1] + visits[i] >= target. If the sum of all
*   daily visits never reaches the target return -1.    */


public class VisitsTarget {
    public static int solution(int[] visits, int target) {

        int sumOfVisits = 0;
        int result = -1;

        for(int i = 0; i < visits.length; i++) {
            if((sumOfVisits + visits[i])  >= target) {
                result = i;
                break;
            }
            else {
                sumOfVisits+= visits[i];
            }
        }
        return result;
    }

    public static void main (String[] args) {

        //uncomment block code per test case to check for accuracy!
        //test case 1 solution = 3
        int target = 700;
        int[] visits = {300, 200, 100, 200, 500};

        //test case 2 solution = 0
        /*int target = 900;
        int visits[] = {900, 821, 1090};*/

        //test case 3 solution = -1
        /*int target = 2001;
        int visits[] = {700, 800, 500};*/

        System.out.println(solution(visits, target));
    }

}
