package com.example.touchlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent (MotionEvent event) {
        if (this.gestureDetector.onTouchEvent(event)){
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Toast toast1 = Toast.makeText(MainActivity.this, "Двойное нажатие",
                Toast.LENGTH_SHORT);
        toast1.show();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Toast toast1 = Toast.makeText(MainActivity.this, "Отпущенное одиночное нажатие",
                Toast.LENGTH_SHORT);
        toast1.show();
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Toast toast1 = Toast.makeText(MainActivity.this, "Скроллинг",
                Toast.LENGTH_SHORT);
        toast1.show();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        Toast toast1 = Toast.makeText(MainActivity.this, "Удержание",
                Toast.LENGTH_SHORT);
        toast1.show();

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Toast toast1 = Toast.makeText(MainActivity.this, "Свайпинг",
                Toast.LENGTH_SHORT);
        toast1.show();
        return true;
    }
}