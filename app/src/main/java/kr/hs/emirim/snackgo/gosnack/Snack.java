package kr.hs.emirim.snackgo.gosnack;

import android.graphics.Bitmap;

/**
 * Created by 내컴퓨터 on 2016-06-10.
 */
public class Snack {
    public String name;
    public Bitmap image;

    public Snack(String name,Bitmap image)
    {
        this.name=name;
        this.image=image;
    }
}
