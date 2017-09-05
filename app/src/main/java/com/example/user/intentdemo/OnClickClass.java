package com.example.user.intentdemo;

import android.content.Context;
import android.content.Intent;

/**
 * Created by user on 05-09-2017.
 */

public class OnClickClass {
    public static void click(Context context, int id, int flag) {
        Intent intent;
        switch (id) {
            case R.id.button8:
                 intent = new Intent(context, MainActivity.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;
            case R.id.button9:
                 intent = new Intent(context, MainActivity2.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;
            case R.id.button10:
                 intent = new Intent(context, MainActivity3.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;
            case R.id.button11:
                 intent = new Intent(context, MainActivity4.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;
            case R.id.button12:
                 intent = new Intent(context, MainActivity5.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;
            case R.id.button13:
                 intent = new Intent(context, MainActivity6.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;
            case R.id.button14:
                 intent = new Intent(context, MainActivity7.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;

            case R.id.button15:
                 intent = new Intent(context, MainActivity8.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;
            case R.id.button16:
                 intent = new Intent(context, MainActivity9.class);
                if (flag == 0) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(flag);
                    context.startActivity(intent);
                }
                break;
        }
    }
}
