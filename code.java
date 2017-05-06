import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        
        //list of integers to store the given graph points
        ArrayList<Integer> graph = new ArrayList<Integer>();
        

        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            graph.add(v); //adding each input number to the list.
        }
        
        
        //setting both min and max to the first element on the list.
        int min = graph.get(0);
        int max = graph.get(0);
        //sum is 0 at this point. 
        int sum = 0;
        
        /*this is the loop where the magic happens.
        I iterate through each number and perform the following operations
        if current element is > than max, then current element is assigned to max
        the contrary goes for min
        and then substract max from min. 
        I added a temporary storage variable called tempSum
        if tempSum > sum then tempSum is assigned to sum*/
        for(int x: graph){
            if (x > max){
                max = x;
            }
            else if(x < max){
                min = x;
                int tempSum = max - min;
                if(tempSum > sum){
                    sum = tempSum;
                }
            }
            
        }
        /*At the end, if sum is anything other than 0, I print the value of sum
        preceded by a - sign.
        Otherwise, I just print the value 0. I do it as a String but that's not necessary*/
        if(sum != 0){
            System.out.println("-" + sum);
        }
        else{
            System.out.println("0");
        }
    }
}
