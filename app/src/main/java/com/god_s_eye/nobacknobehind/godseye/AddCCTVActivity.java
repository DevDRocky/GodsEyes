package com.god_s_eye.nobacknobehind.godseye;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;

/**
 * Created by suni1 on 2017-06-22.
 */

public class AddCCTVActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcctv);

        InitMapView();
    }

    private void InitMapView()
    {
        //다음지도
        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey("22d40639040389f49922077b56dc2f6a");

        RelativeLayout mapViewContainer = (RelativeLayout) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
    }
}
