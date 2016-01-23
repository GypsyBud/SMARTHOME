package com.example.manchanda.smarthome;

import android.content.Context;
import android.content.Intent;

/**
 * Created by manchanda on 17/1/16.
 */
public class CommonUtilities {


        static String LOGIN_URL(String Ip)
        {
            return "http://"+Ip+":8080/logincheck";
        }

        static String DATA_URL(String Ip)
    {
        return "http://"+Ip+":8080/data";
    }


        static final int Code_LoginRequest=2;


        static final int Code_Data=1;

        static final String DISPLAY_MESSAGE_ACTION =
                "com.example.manchanda.smarthome.DISPLAY_MESSAGE";

        static final String EXTRA_MESSAGE = "message";


        static void displayMessage(Context context, String message,int check) {
            Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
            intent.putExtra(EXTRA_MESSAGE, message);
            intent.putExtra("check",check);
            context.sendBroadcast(intent);
        }
}
