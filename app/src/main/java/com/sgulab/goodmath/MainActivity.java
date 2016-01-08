package com.sgulab.goodmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.kexanie.library.MathView;

public class MainActivity extends AppCompatActivity {

    private MathView formula_two;
    String tex = "This come from string. You can insert inline formula:" +
            " \\(ax^2 + bx + c = 0\\) " +
            "or displayed formula: $$\\sum_{i=0}^n i^2 = \\frac{(n^2+n)(2n+1)}{6}$$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        formula_two = (MathView) findViewById(R.id.formula_two);
        formula_two.setText(tex);
    }
}
