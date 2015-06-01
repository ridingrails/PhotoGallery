package com.projects.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by clarignon on 5/31/15.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
