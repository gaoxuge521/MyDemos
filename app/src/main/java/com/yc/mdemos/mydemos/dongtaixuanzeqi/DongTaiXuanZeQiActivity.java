package com.yc.mdemos.mydemos.dongtaixuanzeqi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.mingle.entity.MenuEntity;
import com.mingle.sweetpick.BlurEffect;
import com.mingle.sweetpick.CustomDelegate;
import com.mingle.sweetpick.DimEffect;
import com.mingle.sweetpick.RecyclerViewDelegate;
import com.mingle.sweetpick.SweetSheet;
import com.mingle.sweetpick.ViewPagerDelegate;
import com.yc.mdemos.mydemos.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DongTaiXuanZeQiActivity extends AppCompatActivity {
    @Bind(R.id.rg)
    RadioGroup rg;
    private SweetSheet mSweetSheet;
    private SweetSheet mSweetSheet2;
    private SweetSheet mSweetSheet3;
    private RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dong_tai_xuan_ze_qi);
        ButterKnife.bind(this);
        rl = (RelativeLayout) findViewById(R.id.rl);
        setupViewpager();
        setupRecyclerView();
        setupCustomView();

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if (id == R.id.action_recyclerView) {
                    if (mSweetSheet2.isShow()) {
                        mSweetSheet2.dismiss();
                    }
                    if (mSweetSheet3.isShow()) {
                        mSweetSheet3.dismiss();
                    }
                    mSweetSheet.toggle();

                }
                if (id == R.id.action_viewpager) {
                    if (mSweetSheet.isShow()) {
                        mSweetSheet.dismiss();
                    }
                    if (mSweetSheet3.isShow()) {
                        mSweetSheet3.dismiss();
                    }
                    mSweetSheet2.toggle();
                }
                if (id == R.id.action_custom) {
                    if (mSweetSheet.isShow()) {
                        mSweetSheet.dismiss();
                    }
                    if (mSweetSheet2.isShow()) {
                        mSweetSheet2.dismiss();
                    }
                    mSweetSheet3.toggle();
                }
            }
        });

    }

    private void setupCustomView() {


        mSweetSheet3 = new SweetSheet(rl);
        CustomDelegate customDelegate = new CustomDelegate(true,
                CustomDelegate.AnimationType.DuangLayoutAnimation);
        View view = LayoutInflater.from(this).inflate(R.layout.layout_custom_view, null, false);
        customDelegate.setCustomView(view);
        mSweetSheet3.setDelegate(customDelegate);
        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSweetSheet3.dismiss();
            }
        });
    }

    private void setupRecyclerView() {

        ArrayList<MenuEntity> list = new ArrayList<>();
        //添加假数据
        MenuEntity menuEntity1 = new MenuEntity();
        menuEntity1.iconId = R.drawable.ic_account_child;
        menuEntity1.title = "code";
        MenuEntity menuEntity = new MenuEntity();
        menuEntity.iconId = R.drawable.ic_account_child;
        menuEntity.title = "QQ";
        list.add(menuEntity1);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        list.add(menuEntity);
        // SweetSheet 控件,根据 rl 确认位置
        mSweetSheet = new SweetSheet(rl);

        //设置数据源 (数据源支持设置 list 数组,也支持从菜单中获取)
        mSweetSheet.setMenuList(list);
        //根据设置不同的 Delegate 来显示不同的风格.
        mSweetSheet.setDelegate(new RecyclerViewDelegate(true));
        //根据设置不同Effect 来显示背景效果BlurEffect:模糊效果.DimEffect 变暗效果
        mSweetSheet.setBackgroundEffect(new BlurEffect(8));
        //设置点击事件
        mSweetSheet.setOnMenuItemClickListener(new SweetSheet.OnMenuItemClickListener() {
            @Override
            public boolean onItemClick(int position, MenuEntity menuEntity1) {

                //根据返回值, true 会关闭 SweetSheet ,false 则不会.
                Toast.makeText(DongTaiXuanZeQiActivity.this, menuEntity1.title + "  " + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }

    private void setupViewpager() {


        mSweetSheet2 = new SweetSheet(rl);

        //从menu 中设置数据源
        mSweetSheet2.setMenuList(R.menu.menu_sweet);
        mSweetSheet2.setDelegate(new ViewPagerDelegate());
        mSweetSheet2.setBackgroundEffect(new DimEffect(0.5f));
        mSweetSheet2.setOnMenuItemClickListener(new SweetSheet.OnMenuItemClickListener() {
            @Override
            public boolean onItemClick(int position, MenuEntity menuEntity1) {

                Toast.makeText(DongTaiXuanZeQiActivity.this, menuEntity1.title + "  " + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.swee_menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {

        if (mSweetSheet.isShow() || mSweetSheet2.isShow()) {
            if (mSweetSheet.isShow()) {
                mSweetSheet.dismiss();
            }
            if (mSweetSheet2.isShow()) {
                mSweetSheet2.dismiss();
            }
        } else {
            super.onBackPressed();
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_recyclerView) {
            if (mSweetSheet2.isShow()) {
                mSweetSheet2.dismiss();
            }
            if (mSweetSheet3.isShow()) {
                mSweetSheet3.dismiss();
            }
            mSweetSheet.toggle();

            return true;
        }
        if (id == R.id.action_viewpager) {
            if (mSweetSheet.isShow()) {
                mSweetSheet.dismiss();
            }
            if (mSweetSheet3.isShow()) {
                mSweetSheet3.dismiss();
            }
            mSweetSheet2.toggle();
            return true;
        }
        if (id == R.id.action_custom) {
            if (mSweetSheet.isShow()) {
                mSweetSheet.dismiss();
            }
            if (mSweetSheet2.isShow()) {
                mSweetSheet2.dismiss();
            }
            mSweetSheet3.toggle();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

