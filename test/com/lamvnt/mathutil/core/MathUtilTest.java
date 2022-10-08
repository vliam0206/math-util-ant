/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lamvnt.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author DELL
 */
public class MathUtilTest {
    // hàm getF() đc thiết kế trả về long nếu n đưa vào 0..20
    //  hàm getF() đc thiết kế NÉM RA ỄPCTION NẾU TA ĐƯA VÀO N<0 || N>20
    // tức là nếu gọi getF(-5) thì CHÕ GỌI SẼ NHẬN VỀ EXCEPTION TÊN LÀ
    // IllegalArgumentException
    // đưa cà chớn, nhận ngoại lệ!!!
    // bắt xem hàm mình có đúng ném ra ngoại lệ ko nếu data cà chớn
    // THẤY NGOẠI LỆ MỪNG GỚT NƯỚC MẮT :))
    @Test(expected = Exception.class)
    // vietsub: khi chạy hà này, kiểm tra dùm xem 
    //có 1 ngoại lệ thuộc nhóm/ class IllegalArgumentException xuất hiện hay ko
    // nó xuất hiện = cách nó đc new IllegalArgumentException ở đâu đó
    // nếu có xuất hiện, mừng quá, đúng như thiết kế, MÀU XANH
    // KÌ VỌNG MÀY XUẤT HIỆN, DÙ MÀY LÀ EXCEPTION, VÀ MÀY XH THẬT, MÀU XANH
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        
    }   
    
    @Test  // tên hàm test bao hàm luôn ý nghĩa test cái gì
            // quy ước dân kiểm thử
            // hàm này muốn test hàm giai thừa khi đưa tham số đúng
            // phải trả về đúng
            // viết code phải theo quy tắc - CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell() {
        // Test case #1: kiểm thử tình huống 0! xem có đúng ko
        // n=0, hy vọng hàm ói về expected =1; actual thực tế
        // hàm trả về mấy, chạy thử mới biết
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // so sánh 2 giá trị coi tương đồng ko? có: đúng, ko: BUG
        // so sánh = sout() và dùng mắt để luận kết quả, XƯA RỒI
        // chơi màu mới ngầu
        Assert.assertEquals(expected, actual);
        
        // Test case #2: kiểm thử tình huống 0! xem có đúng ko
        // n=1, hy vọng hàm ói về expected =1; actual thực tế
        // hàm trả về mấy, chạy thử mới biết
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        // Test case #3: n=2; 2! expected = 2?
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
        
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {                      
        // Test case #4: n=3; 3! expected = 6?
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        // Test case #5: n=4; 4! expected = 24?
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        // Test case #6: n=5; 5! expected = 120?
        Assert.assertEquals(120, MathUtil.getFactorial(5));
         // Test case #7: n=6; 6! expected = 720?
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
       //--> đáng lẽ 1 test case phải có 1 hàm riêng??
    }
    @Test
    public void tryJUnitFirst() {
        Assert.assertEquals(69, 69);
    }
}

// CLASS NÀY TA SẼ VIẾT CÁC ĐOẠN CODE NHƯ BÌNH THƯỜNG
// NHƯNG CODE NÀY DÙNG ĐỂ TEST CODE CHÍNH BÊN MATHUTIL
// VIẾT CODE ĐỂ TEST CODE CHÍNH, THÌ CÁI ĐOẠN TEST NÀY ĐC GỌI 
// TÊN LÀ TEST SCRIPT
// TEST SCRIPT LÀ NHỮNG ĐOẠN CODE ĐC VIẾT RA ĐỂ TEST CODE khác, so sánh giá trị
// trả về của hàm chính cần test với giá trị kì vọng
// những đoạn code này/ test script này sẽ PHẢI BAO GỒM CÁC TEST CASE BÊN TRONG
// TEST SCRIPT CHỨA CÁC TEST CASE
// TRONG TEST SCRIPT/ CLASS NÀY SẼ CÓ TEST 5! 6! 7! -5! -> TEST 

// @Test @ đc gọi là ANNOTATION, kí hiệu, flag để đánh dấu đoạn code
// mang 1 ý nghĩa nào đó. Và khi biên dịch/compile code thì
// thư viện đi kèm nó sẽ tự động generate thêm code cho mình tùy theo \
// @
// ví dụ @Test thì thư viện JUnit này import nó sẽ ngầm ngầm tự generate
// hàm này thành public static void main() và gửi main() này cho JVM
// Kix thuật dùng tư viện, bị ép phải theo cú pháp của nó qua những
// @, thư viện này gọi là FRAMEWORK
// FRAMEWORK là thư viện: là những file .jar .dll chứa 1 đống class bên trong
// ép ta phải xài theo cách của nó, theo dàn khung code mà nó quy ước
// dàn khung, template, ta điền nốt code vào chô trống

// THƯ VIỆN - library, .jar .dll chứa 1 đống class bên trong
// ta thoải mài dùng hàm của nó theo cách của ta

// Quy tắc chơi xanh đỏ
// XANH: KHI TẤT CẢ CÁC TEST CASE ĐỀU XANH, TỨC LÀ TẤT CẢ
//                      EXPECTED PHẢI == ACTUAL
// ĐỎ: CHỈ CẦN CÓ 1 TEST CASE MÀU ĐỎ --> XEM NHƯ HÀM TOANGGGGG
//          CHỈ CẦN CÓ 1 EXPECTED != ACTUAL, XEM NHƯ BỎ ĐI HẾT CÁC TEST CASE
// 1 THẰNG GÂY SAI CHO TẤT CẢ
// LÝ DO: hàm đac đúng thì phải đúng hết cho các case đã đc nêu ra
//          chỉ cần 1 sự ko == nhau của actual với expected, hàm ko
//          ổn định về kết qur trả về --> SAI

// KO THỂ TEST HẾT CÁC CASE (NL2) NHƯNG ĐÃ TEST CASE NÀO THÌ PHẢI NGON/XANH CASE ĐÓ

// NÓI THÊM VỀ MÀU ĐỎ:
// ĐỎ XẢY RA KHI: CÓ 1 SỰ KO BẰNG NHAU CỦA EXPECTED VÀ ACTUAL
// LÝ DO GÌ EXPECTED != ACTUAL
// CÓ 2 LÝ DO
// Lí do 1: EXPECTED ĐÙNG, MÌNH TÍNH BÊN NGÒAI = TAY KHI CHƯA CÓ HÀM
//          ACTUAL SAI, TÌNH HUỐNG NÀY HÀM CÙI BẮP, BUG BUG!!!!
// Lí do 2: EXPECTED SAI, VỨT LUÔN TEST CASE NÀY ĐI, ANH CHÀNG QC/DEV BỊ NGÁOOOO
// KÌ VỌNG MÀ SAI, HY VỌNG GÌ Ở ACTUAL?!


//DDT: DATA DRIVEN TESTING --> TỐI ƯU CODE
// tách bộ data kiểm thử ra 1 chỗ
// lát hồi nhồi/nạp/fill/điền/feed data này tuần tự vào chỗ kiểm thử
// ví dụ tách data đã kiểm thử ở trên thành
/**
 * 1    0
 * 1    1
 * 2    2
 * 6    3
 * 24   4
 * 120  5
 * 720  6
 * Arr[7][2]
 */
//  Assert.assertEquals(720, MathUtil.getFactorial(6));
// thay vì lệnh so sánh gọi viết cho từng case, ta biến lệnh này
// trở thành tổng quát, ko điền data cụ thể, mà sẽ lấy từ đâu đó

// Assert.assertEquals(???, MathUtil.getFactorial(???));

// ??? này sẽ lấy từ tập data ở trên!!!
// code gọn hơn, đẹp hơn, sễ bảo trì hơn, kiểm soát đc đủ thiếu các case
// kĩ thuật tách code test ra khỏi data của nó, lát hòi fill lại sau
// đc GỌI LÀ KĨ THUẬT VIẾT TEST CASE THEO KIỂU THAM SỐ HÓA - PARAMETERIZED
// HOẶC CÒN GỌI LÀ      DDT - DATA DRIVEN TESTING
// VIẾT KIỂM THỬ HƯỚNG VỀ TÁCH DATA RIÊNG RA!!!

// MẢNG LÀ 1 ĐỐNG VALUE CÙNG KIỂU
