package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date; // 未来某天日期

    @SerializedName("cond")
    public More more; // 未来某天天气概况

    @SerializedName("tmp")
    public Temperature temperature; // 未来某天气温

    public class More {

        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {

        public String max; // 最高气温

        public String min; // 最低气温
  }
}
