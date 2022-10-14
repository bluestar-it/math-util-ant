package com.bluestar.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

//Mỗi @ là 1 test case
//Class dùng viết những câu lệnh test hàm code chính (class MathUtil)
//Có những lời gọi hàm => getFactorial()
//Có những lệnh so sánh giữa Expected với Actual value
//Sai -> đỏ, Đúng -> xanh
//nhanh, đỡ hại mắt, chỉ cần nhìn màu
//Buộc phải dùng các Unit testing framework: JUnit, TestNG (java)
//                                            xUnit, MSTest, NUnit (C#)
//                                            PHPUnit (PHP)
//  Viết code để test code => Unit Testing
//Đoạn code dùng JUnit/ Unit testing framework, dùng để kiểm thử hàm code chính SRC PACKAGE => test script
//Muốn test => phải phác thảo các test case
// test script sẽ sử dụng các test case
public class MathUtilTest { //Tên file buộc có test 

//     test exception : so sánh, đo lường ngoại lệ có xuất hiện hay ko khi value sai
//      thay vì so expected với actual 
//      => xem exception có xuất hiện ko => có thì hàm tốt
//      exception xuất hiện => green
    @Test(expected = Exception.class)
    //      lưu ý loại exception => sai loại => test case sai
    //    quăng exception => tạo object mới
    //    .class : đo object vừa được tạo ra có thuộc exception hay ko
    public void testFactorialGivenWrongArgumentThrowsException() {
        //test case #3: đưa data n âm hoặc quá lớn
        //              hàm được thiết kế ném về ngoại lệ
        //Thấy ngoại lệ xuất hiện như kì vọng => passed test  => màu xanh
        System.out.println("Hope to see the Exception Illegal Argument Exception!");
        MathUtil.getFactorial(-5);

    }

    @Test

    public void testFactorialGivenRightArgumentReturnsWell2() {

        //        test case #4: n = 3 , expected: 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));

        //        test case #5: n = 4 , expected: 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));

        //        test case #6: n = 5 , expected: 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));

    }

    @Test

    //coding convention
    //tên  hàm của test script => phải nói lên ý nghĩa việc test
    // tình huống này muốn test hàm getF() với tham số tử tế
    public void testFactorialGivenRightArgumentReturnsWell() {
        //        test case #1: n=0 , expected: 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //compare expected vs actual

        Assert.assertEquals(expected, actual);

        //        test case #2: n = 1 , expected: 1
        Assert.assertEquals(expected, MathUtil.getFactorial(1));

        //        test case #3: n = 2 , expected: 2
        Assert.assertEquals(2, MathUtil.getFactorial(2));

    }

    @Test
//   => cho thu vien JUnit tu dong generate ra ham public static void main()
//    bien thanh main()
//    gui main() cho JVM chay b - JAVA VIRTUAL MACHINE
//    mat test => ko co main => ko chay duoc => no runable method

    public void tryJUnitComparison() {
        //thu nghiem viec so sanh expected voi actual => mau sac dun sai
        //xài hàm của JUnit nhưng ko bừa bãi => phải theo quy tắc
        //quy tắc nằm ở @ - annotation
        Assert.assertEquals(200, 200);

    }

    //QUY TẮC XANH ĐỎ
    // ALL GREEN => GREEN : EXPECTED == ACTUAL FOR ALL TEST CASE
    // ONLY 1 RED => RED : EXPECTED != ACTUAL FOR ONLY 1 TEST CASE => WRONG FUNCTION
    // nếu đã liệt kê các test case => buộc phải đúng hết
//  EXPECTED == ACTUAL => test case passed
//  EXPECTED != ACTUAL => test case failed
//                      Expected đúng => hàm sai
//                      expected sai => lỗi QC tính toán
}
