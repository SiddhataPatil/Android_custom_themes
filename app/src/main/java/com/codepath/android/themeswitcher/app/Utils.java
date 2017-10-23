package com.codepath.android.themeswitcher.app;

import android.content.Intent;

/**
 * Created by siddhatapatil on 10/22/17.
 */

public class Utils {
    private static int sTheme;

    public final static int THEME_MATERIAL_LIGHT = 0;
    public final static int THEME_PASTELS_LIGHT = 1;
    public final static int THEME_CONSOLE = 2;

    public static void changeToTheme(ThemeActivity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(ThemeActivity activity) {
        switch (sTheme) {
            default:
            case THEME_MATERIAL_LIGHT:
                activity.setTheme(R.style.Theme_Material_Light);
                break;
            case THEME_PASTELS_LIGHT:
                activity.setTheme(R.style.Theme_Pastels_Light);
                break;
            case THEME_CONSOLE:
                activity.setTheme(R.style.Theme_Console);
                break;
        }
    }
}