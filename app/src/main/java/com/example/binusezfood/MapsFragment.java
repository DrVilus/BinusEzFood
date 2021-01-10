package com.example.binusezfood;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng my_loc = new LatLng(-6.23063716037066, 106.65751749063372);

            googleMap.addMarker(new MarkerOptions().position(my_loc).title("My Location").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(-6.227869358749536, 106.65763280742621)).title("Warung Bu Kris"));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(-6.231004365840333, 106.65905291909088)).title("Holy Cow"));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(-6.2296820655732, 106.65824531756516)).title("Rumah Makan Pagi Sore"));

            float zoomLevel = 16.0f; //This goes up to 21
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(my_loc, zoomLevel));
            googleMap.setOnMarkerClickListener(map_click);
        }
    };

    private GoogleMap.OnMarkerClickListener map_click = new GoogleMap.OnMarkerClickListener(){

        @Override
        public boolean onMarkerClick(Marker marker) {

            if(!marker.getTitle().contentEquals("My Location")){
                MapActivity.map_location = marker.getTitle();
            }else{
                MapActivity.map_location = "Automatic";
            }
            Toast.makeText(((MapActivity)getActivity()), "Order location set to " + MapActivity.map_location, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(),MainActivity.class);
            startActivity(intent);
            return false;
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}