package com.umiitkose.top150.arrayandstring;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        boolean b = jumpGame.canJump(new int[]{2, 3, 1, 1, 4});
        System.out.println(b);
    }

    public boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int jump = nums[0];
        int index = 0;
        int toplam = 0;
        for (int i = nums[0] - 1; i < nums.length; i++) {
            if (nums.length != toplam) {
                if (jump == 0) {
                    return false;
                }

                toplam = jump + index;
                jump = nums[jump];
                index = jump;
            } else {
                return true;
            }
        }

        return false;
    }


}
