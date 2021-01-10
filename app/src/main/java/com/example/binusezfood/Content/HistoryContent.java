package com.example.binusezfood.Content;

import android.icu.text.SimpleDateFormat;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class HistoryContent {

    public static final List<HistoryContent.Item> ITEMS = new ArrayList<HistoryContent.Item>();

    public static class Item {
        public final String id;
        public final String details;
        public final String date;
        public final int total_price;
        public final String location;


        @RequiresApi(api = Build.VERSION_CODES.N)
        public Item(String id, String details, int total_price, String location) {
            this.id = id;
            this.details = details;
            this.total_price = total_price;
            this.location = location;
            this.date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());

        }

    }
}
