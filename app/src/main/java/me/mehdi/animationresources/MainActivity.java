package me.mehdi.animationresources;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    ImageView heartImage;
    ConstraintLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.start);
        heartImage = findViewById(R.id.heart);
        rootLayout = findViewById(R.id.root);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animate_one);
                Animation animation2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animate_two);
                Animation rootAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animate_root);

                v.startAnimation(animation1);
                heartImage.startAnimation(animation2);
                rootLayout.startAnimation(rootAnim);
            }
        });

    }
}
