/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bluestar.mathutil.main;

import com.bluestar.mathutil.core.MathUtil;

/**
 *
 * @author lethi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This statement come from the main method");
        tryTDDFirst();
//        testFactorialGivenWrongArgumentThrowsException();

    }

    public static void testFactorialGivenWrongArgumentThrowsException() {
        //test case #3: đưa data n âm hoặc quá lớn
        //              hàm được thiết kế ném về ngoại lệ
        //Thấy ngoại lệ xuất hiện như kì vọng => passed test  => màu xanh
        System.out.println("Hope to see the Exception Illegal Argument Exception!");
        MathUtil.getFactorial(-5);

    }

//    ham duoc viet ra de thu ki thuat viet code kieu TDD
//    get / dùng thử code bên core
    public static void tryTDDFirst() {
//test case #1 (tình huống kiểm thử số 1)
//Input: n=1
//goị hàm getFactorial ̣(1)
//ky vong tra ve 1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
//        so sánh expected vs actual => function đúng với case đang test( n=1)
        System.out.println("Test 1! | status: "
                + "Expected:" + expected
                + " | Actual: " + actual);

        //test case #2 (tình huống kiểm thử số 1)
//Input: n=2
//goị hàm getFactorial ̣(2)
//ky vong tra ve 2
        expected = 2;
        actual = MathUtil.getFactorial(2);
//        so sánh expected vs actual => function đúng với case đang test( n=1)
        System.out.println("Test 2! | status: "
                + "Expected:" + expected
                + " | Actual: " + actual);

    }

//     TEST CASE:
//     - 1 tifh huống xài, kiểm thử app, test chức năng mà 
//     -phải đưa vào data giạ̉ mẫu , test)
//     -dưa ra giá trị kì vọng
//     Chờ hàm xử lí => trả kết quả
//     Nhìn và so sánh kq với giá trị kì vọng ₫> TEST CASE PASSED / FAILED
}
