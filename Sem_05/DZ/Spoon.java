package DZ;

import java.sql.Array;

public class Spoon {
    public static int phil[];

    public Spoon() {
        phil = new int[5];
    }

    public static boolean findSpoon(int num ) {
        boolean spooning = false;
        if (num == 0) {
            if (phil[num] != 1 && phil[phil.length - 1] != 1) {
                spooning = true;
            } else spooning = false;

        } else if (num == 4) {
            if (phil[0] != 1 && phil[num] != 1) {
                spooning = true;
            } else spooning = false;

        } else {
            if (phil[num - 1] != 1 && phil[num +1 ] != 1) {
                spooning = true;
            } else spooning = false;
        }

        if (spooning) {
            phil[num] = 1;
            num++;
            System.out.println(num + "-й Философ взял ложки...");
        } System.out.println(num + "-й Философ не может взять ложки...");
        return spooning;
    }
}
