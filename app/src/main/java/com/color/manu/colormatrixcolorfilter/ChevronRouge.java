package com.color.manu.colormatrixcolorfilter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Manu on 16/12/2014.
 */
public class ChevronRouge extends View {
    public ChevronRouge(Context context) {
        super(context);
    }

    public ChevronRouge(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ChevronRouge(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float[] colorMatrix = {
                0, 0, 0, 0, 0, //red
                1, 1, 1, 0, 0, //green
                1, 1, 1, 0, 0, //blue
                0, 0, 0, 1, 0 //alpha
        };

        Paint MyPaint = new Paint();
        ColorFilter colorFilter = new ColorMatrixColorFilter(colorMatrix);
        MyPaint.setColorFilter(colorFilter);

        Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chevron);
        canvas.drawBitmap(myBitmap, 100, 100, MyPaint);
    }
}
