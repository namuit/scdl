package net.rdrei.android.scdl.ui;

import net.rdrei.android.scdl.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DemoFragmentAdapter extends FragmentPagerAdapter {
	
	private static int[] SLIDES = {R.layout.demo_hello, R.layout.demo_step1};

	public DemoFragmentAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int key) {
		int layoutId = SLIDES[key];
		
		Fragment fragment = DemoFragment.newInstance(layoutId);
		return fragment;
	}

	@Override
	public int getCount() {
		return SLIDES.length;
	}

}
