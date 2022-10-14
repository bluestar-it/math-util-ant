/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluestar.mathutil.core;

/**
 *
 * @author lethi
 */
//Class mô phỏng các hàm tiện ích, dùng chung cho mọi class khác
//Class khác mô phỏng lại class tiện ích java.Math của JDK
//Những cái dùng chung => thiết kế static
public class MathUtil {

    public static final double PI = 3.1415;

//    Ham tiem ich tinh n giai thua
//Quy uoc:
//    - khon tinh giai thua so am
//    0! = 1!
//    21! vuot 18 chu so => tran kieu long
//    khong tinh 21! tro len
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 - 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        // đến được đây n >= 2
        //không xài else khi đã có return
        long product = 1; //biến cộng dồn (ACC - accumulation)
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
//                                                    (DRIVEN)              (TEST)
//    TDD - TEST DRIVEN DEVELOPMENT => VIET CODE CO Y THUC VIET LUON PHAN KIEM THU
//    LA KI THUAT LAP TRINH/ AP DUNG CHO DEV => GIA TANG CHAT LUONG CODE,
//    GIAM THIEU CONG TIM BUG/ PHAT HIEN BUG TU SOM
//    YEU CAU DEV KHI VIET CODE => VIET LUON CAC BO KIEM THU/
//    TEST CASE/ 
//    CAC DOAN CODE DUNG THU HAM => KIEM TRA TINH DUNG DAN
//    => VIET CODE KEM VOI TEST CASE
//    SAU KHI CÓ TÊN HÀM => VIẾT CẢ CÁC TÌNH HUỐNG XÀI (CHẤP NHẬN VIỆC CHẠY HÀM SAI)
//    => TỐI ƯU, CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CHẠY ĐÚNG
//    (Qúa trình SAI - ĐÚNG - SAI -ĐÚNG diễn ra liên tục) 

}
