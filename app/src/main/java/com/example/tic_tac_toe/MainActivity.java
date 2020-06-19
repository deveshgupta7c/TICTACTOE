package com.example.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int buttons[]={
            R.id.imageView,
            R.id.imageView2,
            R.id.imageView3,
            R.id.imageView4,
            R.id.imageView5,
            R.id.imageView6,
            R.id.imageView7,
            R.id.imageView8,
            R.id.imageView9,
    };

    public int checkwin()
    {
        if (square[1] == square[2] && square[2] == square[3])

            return 1;
        else if (square[4] == square[5] && square[5] == square[6])

            return 1;
        else if (square[7] == square[8] && square[8] == square[9])

            return 1;
        else if (square[1] == square[4] && square[4] == square[7])

            return 1;
        else if (square[2] == square[5] && square[5] == square[8])

            return 1;
        else if (square[3] == square[6] && square[6] == square[9])

            return 1;
        else if (square[1] == square[5] && square[5] == square[9])

            return 1;
        else if (square[3] == square[5] && square[5] == square[7])

            return 1;

        else
            return 0;
    }






    int last=1;
    int square[]={2,3,4,5,6,7,8,9,10,11};
    boolean chance=true;
    public void a11(View view)
    {   if(checkwin()==0) {
        ImageView imageView = (ImageView) view;
        if (chance) {
            imageView.setImageResource(R.drawable.cross);
            imageView.animate().rotation(360).setDuration(1500);
            Log.i("Top Left", "Top Left Cross");
            chance = false;
            String s = imageView.getTag().toString();
            square[Integer.parseInt(s)+1] = 1;
            imageView.setClickable(false);
            last=1;
        } else {
            imageView.setImageResource(R.drawable.circle2);
            imageView.animate().rotation(360).setDuration(1500);
            chance = true;
            String s = imageView.getTag().toString();
            square[Integer.parseInt(s)+1] = 0;
            imageView.setClickable(false);
            last=2;
        }
    }
    else{
        Toast.makeText(this,"Game Over!!! Player"+last+" Wins!!",Toast.LENGTH_LONG);
        for(int i=0;i<9;i++)
        {
            ImageView imageView=(ImageView) findViewById(buttons[i]);
            imageView.setClickable(false);

        }
        chance=true;

    }
    }
    public void play(View view)
    {
        for(int i=0;i<9;i++)
        {
            ImageView imageView=(ImageView) findViewById(buttons[i]);
            imageView.setImageResource(R.drawable.square);
            imageView.animate().rotation(360).setDuration(1500);
            imageView.setClickable(true);
            square[i]=2+i;
            chance=true;
        }
    }





























    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
