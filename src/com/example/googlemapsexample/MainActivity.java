package com.example.googlemapsexample;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
	
	GoogleMap googleMap;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB) @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        
//      googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//      googleMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
      googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
      
      
      googleMap.setMyLocationEnabled(true);
      
      final LatLng Pune = new LatLng(18.500486, 73.866899);
      Marker pune = googleMap.addMarker(new MarkerOptions()
                                .position(Pune)
                                .title("Pune")
                                .snippet("Population: 54,137,400")
                               .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        
    }
    
}
