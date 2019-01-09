package com.stackroute;

import java.util.Calendar;
import java.text.*;

public class DateOfWeek {

    public static void main(String[] args)
    {

                Calendar c = Calendar.getInstance();


                c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

                System.out.println();

                DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
                System.out.println("First day of week:\t\t"+ df.format(c.getTime()));

                for (int i = 0; i <6; i++) {
                    c.add(Calendar.DATE,1);
                }
                System.out.println("Last day of week:\t\t"  + df.format(c.getTime()));
                System.out.println();
            }
}



