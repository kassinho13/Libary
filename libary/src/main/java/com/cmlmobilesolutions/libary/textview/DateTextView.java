package com.cmlmobilesolutions.libary.textview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTextView extends AppCompatEditText {
    public DateTextView(Context context) {
        super(context);
        setDate();
    }

    public DateTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setDate();
    }

    public DateTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void setDate(){

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String today = dateFormat.format(Calendar.getInstance().getTime());
        setText(today);


    }

   
}
