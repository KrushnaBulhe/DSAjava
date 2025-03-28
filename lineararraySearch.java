import java.util.*;

public class lineararraySearch {

    // for finding integer(linear search)
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;

    }

    // function for finding the string (linear search)
    public static int searchString(String names[], String nameKey) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameKey)) {
                return i;
            }
        }

        return -1;
    }

    // function for finding largest and smallest in an array (linear search)

    public static int largestArray(int numbers[]) {

        int largest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];

            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("smallest is " + smallest);
        return largest;

    }

    // searching an element by binary search

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisions

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right half
                start = mid + 1;
            } else { // left half
                end = mid - 1;
            }
        }

        return -1;
    }

    // reverse of an array

    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swaping

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;

        }
    }


    //making of possible pairs of given array

    public static void pairsArray(int numbers[]){
        int totPairs = 0 ;
        for(int i = 0 ; i<numbers.length ; i++){
            for(int j = i + 1 ; j<numbers.length ; j++){
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")" + " ");
                totPairs++;
            }
            System.out.println();
        }

        System.out.println("Total pairs formed are " + totPairs);
    }



    //printing of subarrays of given array

    public static void subArrays (int numbers[]) {
        int total = 0 ;
        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for(int j = i ; j<numbers.length ; j++){
                int end = j;
                for(int k = start ; k <= end ; k++){     //used to print the subarrays
                    System.out.print(numbers[k] + " ");
                }

                total ++ ;

                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println(total);
    }




    //finding which subarray has a maximum sum    [ by using brute force approach ]

    public static void maxSubArraySum (int numbers[]) {

        int maxSum = Integer.MIN_VALUE ; 
        int currentSum = 0 ;

        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for(int j = i ; j<numbers.length ; j++){
                int end = j;
                currentSum = 0 ;
                for(int k = start ; k <= end ; k++){     
                    //subarrays sum
                    currentSum += numbers[k];
                }

                System.out.println(currentSum);
                
                if(maxSum < currentSum ){
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum subarray sum is " + " " + maxSum);
    }



    //finding which subarray has a maximum sum    [ by using Kadane's approach ]

    public static void Kadane(int Num[]){
        int cs = 0 ;
        int ms = Integer.MIN_VALUE ;

        for(int i=0 ; i<Num.length ; i++){
            cs += Num[i];
            if (cs < 0){
                cs = 0 ;
            }

            ms = Math.max(cs ,ms) ;
        }

        System.out.println("Maximum subarray sum is " + " " + ms);

    }


    //Trapping of Rain water 

    public static int trappedWater(int height[]){

        int n = height.length ;
        //calculating left max boundry - array

        int leftMax[] = new int[n];

        leftMax[0] = height[0] ;

        for(int i = 1 ; i<n ; i++){

            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }

        //calculating right max boundry - array

        int rightMax[] = new int[n];

        rightMax[n-1] = height[n-1];

        for(int i = n-2 ; i>=0 ; i--){

            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }

        //loop 
        int trappedWater = 0 ;
        for (int i = 0 ; i<n ; i++){
            int waterLevel = Math.min(leftMax[i] , rightMax[i]) ;
            trappedWater += waterLevel - height[i];
        }

        return trappedWater ;
    }


    //Array Assignment questions

    // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    public static boolean duplicates(int nums[]){
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                return true ;
            } 
            }
            return false ;
        }


    // You are given an array prices where prices[i] is the price of a given stock on the ith day. 
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    public static int buyAndSellStock (int prices[]){
        int maxProfit = 0 ;
        int buyPrice = Integer.MAX_VALUE ;

        for(int i=0 ; i<prices.length ; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice ;
                maxProfit = Math.max(maxProfit , profit) ;
            } else {
                buyPrice = prices[i] ;
            }
        }
        return maxProfit ;
    }


    //Given n non-negative integers representing an elevation map where the width of 
    //each bar is 1, compute how much water it can trap after raining. 

    public static int totalWater(int heights[]){
        //left max boundary

        int n = heights.length ;

        int leftMax[] = new int[n];
        leftMax[0] = heights[0] ;

        for(int i = 1 ;i<n ; i++ ){
            leftMax[i] = Math.max(heights[i] , leftMax[i-1]);
        }

        //right max boundary

        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];

        for(int i = n-2 ; i>=0 ; i--) {
            rightMax[i] = Math.max(heights[i] , leftMax[i+1]);
        }


        int total = 0 ;
        for(int i = 0 ; i<n ; i++){
            int waterlevel = Math.min(leftMax[i] , rightMax[i]);
            total += waterlevel - heights[i];
        }

        return total ;




    }

    






    public static void main(String[] args) {    

        // int numbers[] = { 10, 20, 30, 40, 50, 60, 85, 90};

        int numbers[] = {2,4,6,8,10};
    
        int Num[] = {-2,-3,4,-1,-2,1,5,-3};

        int key = 45;

        Arrays.sort(numbers); // binary search works only on sorted array

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key Found at " + index);
        }

        String names[] = { "prasad", "krushna", "piyush", "om", "kishor" };

        String nameKey = "om";

        int index2 = searchString(names, nameKey);

        if (index2 == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key Found at " + index2);
        }

        System.out.println("largest element is " + largestArray(numbers));

        System.out.println("The number is at index " + binarySearch(numbers, key));


        //printing pairs of array

        pairsArray(numbers);

        
        //printing subarrays of array

        subArrays(numbers);


        // printing of maximum subarray sum
        maxSubArraySum(numbers);

         // printing of maximum subarray sum by using Kadane's algorithm

         Kadane(Num);


        

        //trapping of rainwater 

        int height[] = {4,2,0,6,3,2,5};
        System.out.println("The total water trapped inside bars is "+ " " + trappedWater(height));

        //function calling for assignment questions 
        int nums[] = {1, 2, 3} ;
        System.out.println(duplicates(nums));

        int prices[]= {7, 1, 5, 3, 6, 4} ;
        System.out.println(buyAndSellStock(prices));

        int heights[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1} ;
        System.out.println(totalWater(heights));


        // printing reverse array

        reverseArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();



    }
}
