package com.projects.photogallery;

import android.support.v4.app.Fragment;


public class PhotoGalleryActivity extends SingleFragmentActivity {

    public Fragment createFragment() {
        return new PhotoGalleryFragment();
    }
}
