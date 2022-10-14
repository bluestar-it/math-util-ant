/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.bluestar.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.bluestar.mathutil.core.MathUtil.getFactorial; // kỹ thuật import chỉ dành cho static
//.* => dùng đc tất cả  

/**
 *
 * @author bluestar
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6},
        {5040, 7}
        };
    }

    //        int a[] = {5, 10, 15, 20, 25};
//        int b[][] = {{1, 0},
//        {1, 1},
//        {2, 2},
//        {6, 3},
//        {24, 4},
//        {120, 5},
//        {720, 6}
//
//        };
    //bộ data là mảng 2 chiều, 2 cột uéng vs expected và n , dòng ứng test case
    //mảng object, số dùng wrapper class  - class gói primitive
    //ánh xạ lần lượt các cột của mỗi dòng và expected và n
    //giá trị thay đổi sau mỗi vòng for
    @Parameterized.Parameter(value = 0) // map cột 0 của mảng 
    public long expected;

    @Parameterized.Parameter(value = 1)// map cột 1 của mảng 
    public int n;

//    kiểm thử các test case với data đc trích ra từ mảng map vào biến
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n)); // import static rồi => không cần class.something
    }

}

//Phân tích cách viết code test
//Assert.assertEquals(1, MathUtil.getFactorial(0)); 
//=> lặp lệnh, khác data để kiểm tra các tình huống xài hàm
//test script
//Đoạn code dùng JUnit/ Unit testing framework, dùng để kiểm thử hàm code chính SRC PACKAGE => test script
//Muốn test => phải phác thảo các test case
// test script sẽ sử dụng các test case
//1 test script có thẻ xài DDT để dễ bảo trì code test
//code chính có thể xài TDD
