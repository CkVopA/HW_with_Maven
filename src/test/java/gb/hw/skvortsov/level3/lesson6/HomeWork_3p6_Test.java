package gb.hw.skvortsov.level3.lesson6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork_3p6_Test {


    private HomeWork_3p6 hw;

    @BeforeAll
    static void startAll(){
        System.out.println("START all test");
    }

    @BeforeEach
    void startUp(){
        System.out.println("Начало теста");
        hw = new HomeWork_3p6();
    }

    @AfterEach
    void endTest(){
        System.out.println("Тест завершается");
        System.out.println();
    }

    @AfterAll
    static void endAfterAll(){
        System.out.println("E N D");
    }

    @DisplayName("Сумма чисел массива")
    @Test
    void test1(){
        int[] arrT = {1, 3, 1, 5};
        Assertions.assertEquals(10, hw.sumOfArray(arrT));
    }

    @DisplayName("Сумма массива нулей")
    @Test
    void test2(){
        int[] arrT = {0, 0, 0, 0};
        Assertions.assertEquals(0, hw.sumOfArray(arrT));
    }

    @DisplayName("Сдвиг массива чисел вправо")
    @Test
    void test3(){
        int[] arr = {0,0,0,0,1};
        int[] ex = {1,0,0,0,0};
        Assertions.assertArrayEquals(ex, hw.shiftArray(arr, 1));
    }

    @DisplayName("Сдвиг массива чисел влево")
    @Test
    void test4(){
        int[] arr = {0,1,0,0,0};
        int[] ex = {1,0,0,0,0};
        Assertions.assertArrayEquals(ex, hw.shiftArray(arr, -1));
    }

    @DisplayName("Сдвиг массива чисел на 0")
    @Test
    void test5(){
        int[] arr = {0,1,0,1,0};
        int[] ex = {0,1,0,1,0};
        Assertions.assertArrayEquals(ex, hw.shiftArray(arr, 0));
    }

    @DisplayName("Параметризированный тест проверки баланса массива")
    @ParameterizedTest
    @MethodSource("data")
    void paramTest(boolean expected, int[] arr){
        Assertions.assertTimeout(Duration.ofSeconds(4), ()->{
            Assertions.assertEquals(expected, hw.checkBalance(arr));
        });
    }
    static Stream<Arguments> data(){
        int[] arr0 = {0,0,0};
        int[] arr1 = {0,4,2,1,5};
        int[] arr2 = {1,1,1,3};
        int[] arr3 = {3,0,0,0,0,0,0,1,2};
        int[] arr4 = {2,4,6,8};
        int[] arr5 = {1,1,5};

        return Stream.of(
                Arguments.arguments(true, arr0),
                Arguments.arguments(true, arr1),
                Arguments.arguments(true, arr2),
                Arguments.arguments(true, arr3),
                Arguments.arguments(false, arr4),
                Arguments.arguments(false, arr5)
        );
    }
}