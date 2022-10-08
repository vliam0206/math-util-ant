/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.lamvnt.mathutil.main;

import com.lamvnt.mathutil.core.MathUtil;

/**
 *
 * @author DELL
 */
public class Main {
    
    // ten pakage viet theo ten mien viet nguoc
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    //psvm ->tab
        System.out.println("This message come from the main() method.");
        tryTDDFirst();
    }
    
    public static void tryTDDFirst() {
        // Test case #1 - tình huống cài app số 1
        // 1. dua vao 1 variable n=0; hy vọng hàm trả về expected = 1;
        //      thực tế hàm trả về mấy, actual, đoán xem? :)) chạy hàm mới biết!!! ->nhin
        long expected = 1;
        long actual = MathUtil.getFactorial(0); // xài hàm vừa viết
        // so sánh 2 giá trị để biết hàm viết đúng hay ko
        // 3 THỨ NÀY TỔ HỢP NÊN 1 THỨ GỌI LÀ TEST CASE - TÌNH HUỐNG XÀI APP/ XÀI HÀM
        System.out.println("0! Status: | Expected = " + expected
                                   + " | Actual = " + actual);
        // vietsub: 0! có bằng 1 hay ko?
        
        // Test case #2:
        // n=1; hy vọng trả về expected = 1;
        //      thực tế hàm trả về mấy, actual, đoán xem? :)) chạy hàm mới biết!!!
        expected = 1;
        actual = MathUtil.getFactorial(1); // xài hàm vừa viết
        // so sánh 2 giá trị để biết hàm viết đúng hay ko
        // 3 THỨ NÀY TỔ HỢP NÊN 1 THỨ GỌI LÀ TEST CASE - TÌNH HUỐNG XÀI APP/ XÀI HÀM
        System.out.println("1! Status: | Expected = " + expected
                                   + " | Actual = " + actual);
        // vietsub: 1! có bằng 1 hay ko?
        
        // Test case #3:
        // n=2; hy vọng trả về expected = 2;
        //      thực tế hàm trả về mấy, actual, đoán xem? :)) chạy hàm mới biết!!!
        expected = 2;
        actual = MathUtil.getFactorial(2); // xài hàm vừa viết
        // so sánh 2 giá trị để biết hàm viết đúng hay ko
        // 3 THỨ NÀY TỔ HỢP NÊN 1 THỨ GỌI LÀ TEST CASE - TÌNH HUỐNG XÀI APP/ XÀI HÀM
        System.out.println("2! Status: | Expected = " + expected
                                   + " | Actual = " + actual);
        // vietsub: 1! có bằng 1 hay ko?
    }
}
