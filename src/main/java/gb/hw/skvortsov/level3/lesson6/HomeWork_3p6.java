package gb.hw.skvortsov.level3.lesson6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class HomeWork_3p6 {
    public static final Logger log = LoggerFactory.getLogger(HomeWork_3p6.class);

    public static void main(String[] args) {

        HomeWork_3p6 hw = new HomeWork_3p6();

        int[] arr = {1,2,3,4,1,1};
        System.out.println(hw.checkBalance(arr));
        hw.shiftArray(arr, -2);
    }

    public boolean checkBalance (int [] arr) {
        int sumOfMembers = 0;
        for (int j : arr) {
            if (sumOfMembers == sumOfArray(arr) - sumOfMembers) {
                return true;
            } else sumOfMembers += j;
        }
        log.info("Массив не сбалансированный!");
        return false;
    }

    public int sumOfArray (int[] arr){
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        log.info("Посчитана сумма массива");
        return sum;
    }

    public  int[] shiftArray (int [] ar, int n){
        int stepShift = n;
        int xSafety;
        while (stepShift != 0) {
            if (n%ar.length == 0) {
                log.info("Массив остался такого же вида");
                break;
            }
            if (n>0) {
                xSafety = ar[ar.length - 1];
                for (int i = ar.length - 1; i >= 0; i--) {
                    if (i > 0) {
                        ar[i] = ar[i - 1];
                    } else {
                        ar[0] = xSafety;
                        xSafety = ar[ar.length - 1];
                        stepShift--;
                    }
                }
            }
            if (n<0) {
                xSafety = ar[0];
                for (int i = 0; i < ar.length; i++) {
                    if (i < ar.length-1){
                        ar[i] = ar[i+1];
                    }
                    else if (i == ar.length-1) {
                        ar[i] = xSafety;
                        xSafety = ar[0];
                        stepShift++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(ar));
        return ar;
    }
}
