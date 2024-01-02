/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author admin
 */
public class MathUtil {
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be < 20 or > 20");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;
        
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        
        return product;
        
        
        
        
    }
}
