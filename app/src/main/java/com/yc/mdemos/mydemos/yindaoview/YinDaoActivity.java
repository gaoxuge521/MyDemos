package com.yc.mdemos.mydemos.yindaoview;

import android.graphics.RectF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.yc.mdemos.mydemos.R;

public class YinDaoActivity extends AppCompatActivity {
    private HighLight mHightLight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yin_dao);
        findViewById(R.id.id_btn_amazing).post(
                new Runnable()
                {
                    @Override
                    public void run()
                    {
                        showTipMask();
                    }
                }

        );

    }

    private void showTipMask()
    {
        mHightLight = new HighLight(YinDaoActivity.this)//
                .anchor(findViewById(R.id.id_container))//如果是Activity上增加引导层，不需要设置anchor
//                .addHighLight(R.id.id_btn_important, R.layout.info_up,
//                        new HighLight.OnPosCallback()
//                        {
//                            @Override
//                            public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo)
//                            {
//                                marginInfo.leftMargin = rectF.right - rectF.width() / 2;
//                                marginInfo.topMargin = rectF.bottom;
//                            }
//                        })//
//                .addHighLight(R.id.id_btn_amazing, R.layout.info_down, new HighLight.OnPosCallback()
//                {
//                    /**
//                     * @param rightMargin 高亮view在anchor中的右边距
//                     * @param bottomMargin 高亮view在anchor中的下边距
//                     * @param rectF 高亮view的l,t,r,b,w,h都有
//                     * @param marginInfo 设置你的布局的位置，一般设置l,t或者r,b
//                     */
//                    @Override
//                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo)
//                    {
//                        marginInfo.rightMargin = rightMargin + rectF.width() / 2;
//                        marginInfo.bottomMargin = bottomMargin + rectF.height();
//                    }
//
//                });
                .addHighLight(R.id.id_btn_important_right,R.layout.info_gravity_right_up, new HighLight.OnPosCallback(){


                    @Override
                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                        marginInfo.rightMargin = rightMargin;
                        marginInfo.topMargin = rectF.top + rectF.height();
                    }
                })
                .addHighLight(R.id.id_btn_whoami, R.layout.info_gravity_left_down, new HighLight.OnPosCallback() {


                    @Override
                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                        marginInfo.leftMargin = rectF.right - rectF.width()/2;
                        marginInfo.bottomMargin = bottomMargin + rectF.height();
                    }
                })
                .setClickCallback(new HighLight.OnClickCallback() {
                    @Override
                    public void onClick() {
                        Toast.makeText(YinDaoActivity.this,"clicked",Toast.LENGTH_SHORT).show();
                    }
                });

        mHightLight.show();
    }


    public void remove(View view)
    {
        mHightLight.remove();
    }

    public void add(View view)
    {
        mHightLight.show();
    }


}
