package vn.edu.usth.weatheractivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.MenuItem;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment ff = ForecastFragment.newInstance("","");
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.container, ff).commit();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("weather", "onStart() called ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("weather", "onStop() called ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("weather", "onDestroy() called ");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("weather", "onPause() called ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("weather", "onResume() called ");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i("weather", "onCreate() called ");

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.search) {
            Log.i("Weather", "Menu search clicked");
            return true
        }
        return super.onOptionsItemSelected(item);
    }

    public class HomeFragmentPaperAdapter extends FragmentPaperAdapter {
        private final int PAGE_COUNT = 3;
        private String titles[] = new String[]{"Hanoi,VietNam","Paris,France","Toulouse,France"};
        public HomeFragmentPaperAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public intgetCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int page) {
            switch (page) {
                case 0:
                    return new WeatherForcastFragment();
                case 1:
                    return new WeatherForcastFragment();
                case 2:
                    return new WeatherForcastFragment();
            }
            return new Fragment();
        }

        @Override
        public CharSequence getPageTitle(int page) {
            return titles[page]
        }
    }

}