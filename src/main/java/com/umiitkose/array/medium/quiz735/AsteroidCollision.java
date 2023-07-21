package com.umiitkose.array.medium.quiz735;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        System.out.println(Arrays.toString(asteroidCollision.asteroidCollision(new int[]{5, 10, -5})));
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> collisionStack = new Stack<>();

        for (int asteroid : asteroids) {
            while (true) {

                if (collisionStack.size() == 0) {
                    collisionStack.push(asteroid);
                    break;
                } else {
                    int prev = collisionStack.peek();

                    if (!(prev > 0 && asteroid < 0)) {
                        collisionStack.push(asteroid);
                        break;
                    }
                    if (Math.abs(asteroid) == Math.abs(prev)) {
                        collisionStack.pop();
                        break;
                    } else {
                        if (Math.abs(asteroid) > Math.abs(prev)) {
                            collisionStack.pop();
                        } else if (Math.abs(prev) > Math.abs(asteroid)) {
                            break;
                        }
                    }
                }
            }
        }

        int n = collisionStack.size();
        int[] remainAsteroids = new int[n];
        while (n > 0) {
            remainAsteroids[--n] = collisionStack.pop();
        }

        return remainAsteroids;
    }
}

/**
 * We are given an array asteroids of integers representing asteroids in a row.
 * <p>
 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
 * <p>
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: asteroids = [5,10,-5]
 * Output: [5,10]
 * Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
 * Example 2:
 * <p>
 * Input: asteroids = [8,-8]
 * Output: []
 * Explanation: The 8 and -8 collide exploding each other.
 * Example 3:
 * <p>
 * Input: asteroids = [10,2,-5]
 * Output: [10]
 * Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 */