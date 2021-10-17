package vn.edu.usth.weatheractivity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WeatherForcastFragment extends Fragment{
    private ViewGroup fragmentweatherforecast;

    private class WeatherForcastFragment () {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout, fragmentweatherforecast, container, false);
        return inflate;
    }
}
