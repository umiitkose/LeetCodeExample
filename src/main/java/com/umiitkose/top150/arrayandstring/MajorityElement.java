package com.umiitkose.top150.arrayandstring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        int max = Collections.max(hm.values());
        //return hm.getKey(max);
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

}
