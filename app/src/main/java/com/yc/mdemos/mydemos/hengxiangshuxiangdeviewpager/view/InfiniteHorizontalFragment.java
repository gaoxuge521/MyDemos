package com.yc.mdemos.mydemos.hengxiangshuxiangdeviewpager.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.yc.mdemos.mydemos.R;
import com.yc.mdemos.mydemos.hengxiangshuxiangdeviewpager.view.infinite.Constants;
import com.yc.mdemos.mydemos.hengxiangshuxiangdeviewpager.view.infinite.InfiniteHorizontalPagerAdapter;
import com.yc.mdemos.mydemos.hengxiangshuxiangdeviewpager.view.infinite.ViewFactory;


public class InfiniteHorizontalFragment extends Fragment implements ViewFactory {

	private int mBgColor;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		mBgColor = getResources().getColor(R.color.sample_bg);
		ViewPager verticalPager = (ViewPager) inflater.inflate(
				R.layout.fragment_infinite_horizontal, container, false);
		verticalPager.setAdapter(new InfiniteHorizontalPagerAdapter(this, 0));
		verticalPager.setCurrentItem(Constants.START_INDEX);
		return verticalPager;
	}

	@Override
	public View makeView(int vertical, int horizontal) {
		Button btn = new Button(getActivity());
		btn.setText("Horizontal " + horizontal);
		btn.setBackgroundColor(mBgColor);
		return btn;
	}
}
