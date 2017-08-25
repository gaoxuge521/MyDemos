package com.yc.mdemos.mydemos.jiazaidonghua7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.victor.loading.newton.NewtonCradleLoading;
import com.yc.mdemos.mydemos.R;

/**
 * @author Yan
 *         create at 15/8/9 22:09
 */
public class NewtonCradleActivity extends Activity {

    private NewtonCradleLoading newtonCradleLoading;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newton_cradle);
        newtonCradleLoading = (NewtonCradleLoading) findViewById(R.id.newton_cradle_loading);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newtonCradleLoading.isStart()) {
                    button.setText(R.string.start);
                    newtonCradleLoading.stop();
                } else {
                    button.setText(R.string.stop);
                    newtonCradleLoading.start();
                }
            }
        });
    }

}
