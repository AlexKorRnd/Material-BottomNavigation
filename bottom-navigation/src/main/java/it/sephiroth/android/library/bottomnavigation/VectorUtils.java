package it.sephiroth.android.library.bottomnavigation;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.ContextCompat;

public class VectorUtils {

    public static Drawable loadVector(Context context, int iconResource) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            return ContextCompat.getDrawable(context, iconResource);
        else
            return VectorDrawableCompat.create(context.getResources(), iconResource, context.getTheme());
    }

}
