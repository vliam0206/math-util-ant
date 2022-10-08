/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lamvnt.mathutil.core;

/**
 *
 * @author DELL
 */

// Ta sẽ clone bộ thư viện/ công cụ Math Util của JDK
// giả lập các hàm của class Math của JDK
// Những gì mà là công cụ dùng cho hàm khác, class khác thì thường sẽ được
// thiết kế là STATIC
// STATIC LÀ CHẤM TRỰC TIẾP THÔNG QUA TÊN CLASS -> KO CÓ NEW
public class MathUtil {
    public static final double PI = 3.141592653589793;
    
    // Hàm tính n! = 1.2.3...n
    // Quy ước:
    // ko có gia thừa cho số âm
    // 0! = 1! = 1
    // 21! vượt quá 18 số 0, vượt kiểu long
    // Hàm của chúng ta design là: chỉ chấp nhận tính n giai thừa (0<=n<=20)
    public static long getFactorial(int n) {
        if (n<0 || n>20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0..20");
        }
        if (n==0 || n==1) {
            return 1;
        }
        // Sống sót đến đây, sure n từ 2 đến 20
        long product = 1; // biến con heo đất, nhân tích lũy
                            // acc - accumulation. góp dần
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    
    // KĨ THUẬT LẬP TRÌNH KIỂU MỚI (VẪN GIỮ NGUYÊN NHỮNG KIẾN THỨC LẬP TRÌNH ĐÃ CÓ)
    // 1 PLUGIN MỚI CHO TRÌNH ĐỘ CỦA DEV - VIẾT CODE
    // CHẤT LƯỢNG KO NÓI = MIỆNG, CHẤT LƯỢNG NÓI = CODE
    // KĨ THUẬT TDD - TEST DRIVEN DEVELOPMENT (ĐƯỢC ĐƯA CHỮ NÀY VÀO CV)
    // VIẾT CODE CÀ VIẾT CODE ĐỂ TEST CODE SONG SONG VỚI NHAU
    // MỖI HÀM DEV VIẾT A PHẢI VIẾT NGAY CÁI TEST CASE, PHẢI VIẾT NGAY HÀNH ĐỘNG
    // KIỂ, THỬ HÀM, ĐỂ BIẾT RẰNG HÀM VỪA VIẾT CHẠY SAI HAY ĐÚNG.
    
    
    //DDT: DATA DRIVEN TESTING --> TỐI ƯU CODE
    
    //CV mục kĩ năng: UnitTest, DTT, TDD
    
}
