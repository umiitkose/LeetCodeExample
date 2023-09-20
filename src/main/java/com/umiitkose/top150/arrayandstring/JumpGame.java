package com.umiitkose.top150.arrayandstring;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        boolean b = jumpGame.canJump(new int[]{2, 3, 1, 1, 4});
        System.out.println(b);
    }

    public boolean canJump(int[] nums) {
        int jump = 0;
        int length = nums.length;
        for (int num : nums) {
            jump = num;
        }
        return false;
    }


}
