package com.example.binusezfood.dummy;

import android.icu.text.SimpleDateFormat;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class HistoryContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<HistoryContent.Item> ITEMS = new ArrayList<HistoryContent.Item>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(new Item(String.valueOf(i)));
//        }
    }

//    private static HistoryContent.Item createItem(int position) {
//        return new HistoryContent.Item(String.valueOf(position), "Item " + position, makeDetails(position));
//    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Item {
        public final String id;
        public final String details;
        public final String date;
        public final int total_price;


        @RequiresApi(api = Build.VERSION_CODES.N)
        public Item(String id, String details, int total_price) {
            this.id = id;
            this.details = details;
            this.date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            this.total_price = total_price;
        }

    }
}
