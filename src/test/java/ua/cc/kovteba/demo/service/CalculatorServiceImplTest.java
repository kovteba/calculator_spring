package ua.cc.kovteba.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private static CalculatorService calculatorService = new CalculatorServiceImpl();


    private static String s1 = "11+12*2+(2*(2+10)-1)";
    private static String s1Res = "58";

    private static String s2 = "7+22/3-4+33";
    private static String s2Res = "43,333333333";

    private static String s3 = "85-32+5*4+(13-5)";
    private static String s3Res = "81";

    private static String s4 = "5+36+98/2+8-14";
    private static String s4Res = "84";

    private static String s5 = "16*5-9+(44-18)-4";
    private static String s5Res = "93";

    private static String s6 = "25+89/5+94-13";
    private static String s6Res = "123,8";

    private static String s7 = "8*4+97+3*7";
    private static String s7Res = "150";

    private static String s8 = "29-7*7-9+66";
    private static String s8Res = "37";

    private static String s9 = "56/2+(73-52)-4";
    private static String s9Res = "45";

    private static String s10 = "88-55*9+7-3";
    private static String s10Res = "-403";

    private static String s11 = "21+8*7*5-(54/2-1)*2";
    private static String s11Res = "249";

    private static String s12 = "5*5*5*5-2/(21*2+2)+(1*2+1)";
    private static String s12Res = "627,954545455";

    private static String s13 = "5/7*98-8+5/48-(87/5+65)-156";
    private static String s13Res = "-176.29583333333";

    private static String s14 = "4/7+59-(84/2)+(84*2)-(62/4*3)";
    private static String s14Res = "139.07142857143";

    private static String s15 = "4/87-9-(8/(4*9-8)+5*(4/7+6))-15";
    private static String s15Res = "−57,096880131";

    private static String s16 = "4/(45-78/2)-45*(78+2/5)*78/3";
    private static String s16Res = "−91727,333333333";

    private static String s17 = "0.5*8.25-8*(7.2/3-6)*(7.9-12)+7";
    private static String s17Res = "−106,955";

    private static String s18 = "2.6-5.8+8/(78.2/8)*7.9-8/(8+2.1)";
    private static String s18Res = "2,473393938";

    private static String s19 = "4.7+5.9/9.7*(7.9-5/1.9)*(78.5/6)";
    private static String s19Res = "46,62558781";

    private static String s20 = "9.1/7*9.4-(7.3/8*9.4)-(7.6/8)*(7.1/6.5)";
    private static String s20Res = "2,604807692";


    @Test
    void calculate() {
        System.out.println(s1Res + " = " + calculatorService.calculate(s1));
        System.out.println(s2Res + " = " + calculatorService.calculate(s2));
        System.out.println(s3Res + " = " + calculatorService.calculate(s3));
        System.out.println(s4Res + " = " + calculatorService.calculate(s4));
        System.out.println(s5Res + " = " + calculatorService.calculate(s5));
        System.out.println(s6Res + " = " + calculatorService.calculate(s6));
        System.out.println(s7Res + " = " + calculatorService.calculate(s7));
        System.out.println(s8Res + " = " + calculatorService.calculate(s8));
        System.out.println(s9Res + " = " + calculatorService.calculate(s9));
        System.out.println(s10Res + " = " + calculatorService.calculate(s10));
        System.out.println(s11Res + " = " + calculatorService.calculate(s11));
        System.out.println(s12Res + " = " + calculatorService.calculate(s12));
        System.out.println(s13Res + " = " + calculatorService.calculate(s13));
        System.out.println(s14Res + " = " + calculatorService.calculate(s14));
        System.out.println(s15Res + " = " + calculatorService.calculate(s15));
        System.out.println(s16Res + " = " + calculatorService.calculate(s16));
        System.out.println(s17Res + " = " + calculatorService.calculate(s17));
        System.out.println(s18Res + " = " + calculatorService.calculate(s18));
        System.out.println(s19Res + " = " + calculatorService.calculate(s19));
        System.out.println(s20Res + " = " + calculatorService.calculate(s20));

    }
}