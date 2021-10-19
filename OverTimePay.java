package com.company;

public class OverTimePay {
    static String calculateOverTimePay (Double punchIn, Double punchOut , int hourlyPay , Double overtimeFactor) {
        Double totalPay = 0.0 ;
        Double regularPay = 0.0;
        Double overtimePay = 0.0;
        if (punchIn < 0 || punchIn > 24 || punchOut > 24 || punchOut < 0) {
            String s = "Enter the right values";
            return s;
        }else if (punchIn > punchOut) {
            String s = "Travelling in time machine!!";
            return s;
        }else if (punchIn >= 0 && punchIn < 9 && punchOut > 0 && punchOut < 9) {
            totalPay = (punchOut - punchIn) * hourlyPay * overtimeFactor;

        } else if (punchIn >= 0 && punchIn < 9 && punchOut >= 9 && punchOut <= 17) {
            regularPay = (punchOut - 9) * hourlyPay;
            overtimePay = (9 - punchIn) * hourlyPay * overtimeFactor;
            totalPay = regularPay + overtimePay;

        } else if (punchIn >= 0 && punchIn < 9 && punchOut > 17 && punchOut <= 24) {
            regularPay = Double.valueOf(8 * hourlyPay);
            overtimePay = ((9-punchIn) + (punchOut - 17)) * hourlyPay * overtimeFactor;
            totalPay = regularPay + overtimePay;

        } else if ((punchIn >= 9 && punchIn <= 17 && punchOut >= 9 && punchOut <= 17)) {
            totalPay = (punchOut - punchIn) * hourlyPay;
        } else if (punchIn >= 9 && punchIn <= 17 && punchOut > 17 && punchOut <= 24) {
            regularPay = (17 - punchIn) * hourlyPay;
            overtimePay = (punchOut - 17) * hourlyPay * overtimeFactor;
            totalPay = regularPay + overtimePay;
        } else if (punchIn > 17 && punchIn <= 24 && punchOut > 17 && punchOut <= 24) {
            totalPay = (punchOut - punchIn) * hourlyPay * overtimeFactor;
        }

        String s = "$" + Double.toString(totalPay);
        return s;

    }
    public static void main (String[] args) {
        System.out.println(calculateOverTimePay(24.0, 0.0, 30 , 1.5));
    }

        }

