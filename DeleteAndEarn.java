/*
You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:

Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
Return the maximum number of points you can earn by applying the above operation some number of times.
*/
class Solution {
    public int deleteAndEarn(int[] nums) 
    {
         //Indetify maximum number present in the input array
        int maxNum = 0;
        for(int num : nums){
            maxNum = Math.max(num,maxNum);
        }
        //Declare the array to store sum of each number i.e (equivalent to number * frequencey)
        int[] sums = new int[maxNum+1]; //zero indexed
        for(int num : nums){
            sums[num] += num;
        }         
        //Now we can use DP approach to solve this; we know that if we collect points from any digit (earn the sum amount), we cannot consider its adjacent neighbour (as they will be deleted) so we have to use it with two step back value OR use the one step back value directly.
        int backOne=0,backTwo=0;
        for(int currPoints : sums){
            int maxPoints = Math.max(currPoints+backTwo, backOne);
            backTwo = backOne;
            backOne = maxPoints;
        }        
        return backOne;
    }
}