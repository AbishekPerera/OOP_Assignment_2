package IT21013096;

import java.util.ArrayList;

/**
 * IT21013096
 * Perera A.S.A
 */
public class MainApp {

    public static void main(String[] args) {
        
        AlarmClock Ac1 = new AlarmClock();
        AlarmClock Ac2 = new AlarmClock();

        Ac1.InputAlarm();
        Ac1.SetAlarm();

        Ac2.InputAlarm();
        Ac2.SetAlarm();

        ArrayList<AlarmClock> Alarm = new ArrayList<AlarmClock>();

        Alarm.add(Ac1);
        Alarm.add(Ac2);

        Alarm.get(0).ShowAlarm();
        Alarm.get(1).ShowAlarm();


    }
}