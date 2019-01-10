package com.example.zhuqifan.surfaceviewgame.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class TranslateUtil {
    public static float dp2px(Context context, float dpVal){
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, context.getResources().getDisplayMetrics());
    }
}
