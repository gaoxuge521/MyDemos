package com.yc.mdemos.mydemos.searchsousuo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import com.cjj.sva.JJSearchView;
import com.cjj.sva.anim.controller.JJAroundCircleBornTailController;
import com.cjj.sva.anim.controller.JJBarWithErrorIconController;
import com.cjj.sva.anim.controller.JJChangeArrowController;
import com.cjj.sva.anim.controller.JJCircleToBarController;
import com.cjj.sva.anim.controller.JJCircleToLineAlphaController;
import com.cjj.sva.anim.controller.JJCircleToSimpleLineController;
import com.cjj.sva.anim.controller.JJDotGoPathController;
import com.cjj.sva.anim.controller.JJScaleCircleAndTailController;
import com.yc.mdemos.mydemos.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SearchAnimationActivity extends AppCompatActivity {
    JJSearchView mJJSearchView;
    @Bind(R.id.rg)
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_animation);
        ButterKnife.bind(this);
        mJJSearchView = (JJSearchView) findViewById(R.id.jjsv);
        mJJSearchView.setController(new JJChangeArrowController());

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
            case R.id.action1:
                mJJSearchView.setController(new JJAroundCircleBornTailController());
                break;
            case R.id.action2:
                mJJSearchView.setController(new JJBarWithErrorIconController());
                break;
            case R.id.action3:
                mJJSearchView.setController(new JJChangeArrowController());
                break;
            case R.id.action4:
                mJJSearchView.setController(new JJCircleToBarController());
                break;
            case R.id.action5:
                mJJSearchView.setController(new JJCircleToLineAlphaController());
                break;
            case R.id.action6:
                mJJSearchView.setController(new JJCircleToSimpleLineController());
                break;
            case R.id.action7:
                mJJSearchView.setController(new JJDotGoPathController());
                break;
            case R.id.action8:
                mJJSearchView.setController(new JJScaleCircleAndTailController());
                break;
        }
            }
        });
    }

    public void start(View v) {
        mJJSearchView.startAnim();
    }

    public void reset(View v) {
        mJJSearchView.resetAnim();
    }
}
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        switch (id) {
//            case R.id.action1:
//                mJJSearchView.setController(new JJAroundCircleBornTailController());
//                break;
//            case R.id.action2:
//                mJJSearchView.setController(new JJBarWithErrorIconController());
//                break;
//            case R.id.action3:
//                mJJSearchView.setController(new JJChangeArrowController());
//                break;
//            case R.id.action4:
//                mJJSearchView.setController(new JJCircleToBarController());
//                break;
//            case R.id.action5:
//                mJJSearchView.setController(new JJCircleToLineAlphaController());
//                break;
//            case R.id.action6:
//                mJJSearchView.setController(new JJCircleToSimpleLineController());
//                break;
//            case R.id.action7:
//                mJJSearchView.setController(new JJDotGoPathController());
//                break;
//            case R.id.action8:
//                mJJSearchView.setController(new JJScaleCircleAndTailController());
//                break;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
