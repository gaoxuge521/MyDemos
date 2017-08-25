package com.yc.mdemos.mydemos.yanshenfangda;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.meetic.marypopup.MaryPopup;
import com.yc.mdemos.mydemos.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PopupImageActivity extends AppCompatActivity {

    //    @Bind(R.id.toolbar) Toolbar toolbar;
//    @Bind(R.id.image) View image;
    MaryPopup popup;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.image)
    ImageView image;
    @Bind(R.id.image2)
    ImageView image2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_image);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        popup = MaryPopup.with(this)
                .cancellable(true)
                .draggable(true)
                .center(true)
                .inlineMove(false)
                .scaleDownDragging(true)
                .shadow(false)
                .scaleDownCloseOnDrag(true)
                .openDuration(300)
                .closeDuration(500)
                .blackOverlayColor(Color.parseColor("#33000000"))
                .backgroundColor(Color.parseColor("#000000"));

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View popupImage = LayoutInflater.from(PopupImageActivity.this).inflate(R.layout.popup_image, null, false);
                ImageView mimg = (ImageView) popupImage.findViewById(R.id.mimg);
                mimg.setImageResource(R.drawable.bj);
                popup .content(popupImage)
                        .from(image2)
                        .show();
            }
        });
    }

    @OnClick(R.id.image)
    public void onClickCardView() {
        View popupImage = LayoutInflater.from(this).inflate(R.layout.popup_image, null, false);
        ImageView mimg = (ImageView) popupImage.findViewById(R.id.mimg);
        mimg.setImageResource(R.drawable.effeil);
        popup .content(popupImage)
                .from(image)
                .show();
    }

    @Override
    public void onBackPressed() {
        if (popup.isOpened()) {
            popup.close(true);
        } else {
            super.onBackPressed();
        }
    }
}
