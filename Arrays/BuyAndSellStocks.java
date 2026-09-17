package com.example.Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[]arr = new int[]{7,1,4,5,6,3};
        System.out.println(stock(arr));
    }
    public static int stock(int []arr){
        int min = arr[0],profit = 0;
        for(int i = 0;i<arr.length;i++){
            int cost = arr[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(arr[i],min);
        }
        return profit;
    }
}
/*How  i will get the price first it will the current value - min element
* now once i got the cost i have to compare the cost with profit in order to maintain
* the highest profit and next i have to find the minimum value via which i will
* return the highest profit which will be the min[i] with min value
* */