package IT21013096;

import java.util.Scanner;

public class AlarmClock {

    private int Hour = 0;
    private int Minute = 0;
    private int Second = 0;

    private int testH = 0;
    private int testM = 0;
    private int testS = 0;

    AlarmClock() {

        Hour = 12;
        Minute = 0;
        Second = 0;
    }

    public void InputAlarm() {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input Hour : ");
            testH = input.nextInt();

            System.out.println("Input Min : ");
            testM = input.nextInt();

            System.out.println("Input Sec : ");
            testS = input.nextInt();

            try {

                if (testH <= 12 && testH >= 0) {

                    if (testM <= 59 && testM >= 0) {

                        if (testS <= 59 && testS >= 0) {

                            System.out.println("Input OK");

                        }

                        else {
                            throw new InvalidNumberException("Invalid Seconds");
                        }
                    } else {
                        throw new InvalidNumberException("Invalid Minutes");
                    }

                } else {
                    throw new InvalidNumberException("Invalid Hours");
                }

            } catch (InvalidNumberException e) {
                System.out.println(e);
            }

        } catch (NumberFormatException e) {
            System.out.println("non numerical values");
        }

    }

    public void ShowAlarm() {

        System.out.println("Alarm");
        System.out.println(Hour + ":" + Minute + ":" + Second);

    }

    public void SetAlarm() {

        if (testH <= 12 && testH >= 0) {

            if (testM <= 59 && testM >= 0) {

                if (testS <= 59 && testS >= 0) {

                    this.Hour = this.testH;
                    this.Minute = this.testM;
                    this.Second = this.testS;

                } else {
                    this.Second = 0;
                    this.Hour = this.testH;
                    this.Minute = this.testM;
                }

            } else {
                this.Minute = 0;

                this.Hour = this.testH;
                this.Second = this.testS;


            }

        } else {
            this.Hour = 0;
            this.Minute = this.testM;
            this.Second = this.testS;
        }

    }

}
