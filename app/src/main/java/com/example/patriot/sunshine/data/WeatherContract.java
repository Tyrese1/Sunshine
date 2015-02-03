package com.example.patriot.sunshine.data;

import android.provider.BaseColumns;

/**
 * Created by Patriot on 1/29/2015.
 */
public class WeatherContract {

        /* Inner class that defines the table contents of the location table */
        public static final class LocationEntry implements BaseColumns {
            //Table name
            public static final String TABLE_NAME = "location";

            // The location setting string is what will be sent to openweathermap
            // as the location query.
            public static final String COLUMN_LOCATION_SETTING = "location_setting";

            //Human readable location string, provided by the API for styling
            //"Localised name like Warri, Nigeria" is more recognisable that postal code like 23452
            public static final String COLUMN_CITY_NAME = "	city_name";

            // In order to uniquely pinpiont the location on the map when we launch the
            //map intent, we store the latitude and lontitude as returned by openweathermap.
            public static final String COLUMN_COORD_LAT = "coord_lat";
            public static final String COLUMN_COORD_LONG = "coord_long";

        }

/* Inner class that defined the table contents of the weather table */


    /* Inner class that defined the table contents of the weather table */

    /* Inner class that defines the table contents of the location table */
    public static final class WeatherEntry implements BaseColumns {

        public static final String TABLE_NAME = "weather";

        // Column with the foreign key into the location table
        public static final String COLUMN_LOC_KEY = "location_id";

        //Date stored as text with format yyyy-MM-dd
        public static final String COLUMN_DATETEXT = "date";

        // Weather id as returned by API, to identify the icon to be used
        public static final String COLUMN_WEATHER_ID = "weather_id";

        //Short description and long description of the weather, as provided by the API
        //e,g "clear" vs "sky clear"
        public static final String COLUMN_SHORT_DESC = "short_desc";

        // Min and max temperature for the day (stored as floats)
        public static final String COLUMN_MIN_TEMP = "min";
        public static final String COLUMN_MAX_TEMP = "max";

        //pRESSUREis stored as a float representing percentage
        public static final String COLUMN_PRESSURE = "pressure";

        //Humidity is stored as a float representing percentage
        public static final String COLUMN_HUMIDITY = "Humidity";

        //Windspeed is stored as a float representing percentage mph
        public static final String COLUMN_WIND_SPEED = "wind";

        //Degrees are meteorological degrees (e.g, o is north, 180 is south, Stored as floats)
        public static final String COLUMN_DEGREES = "degrees";

        }

        /* Inner class that defines the table contents of the location table */



        }
