package com.example.booking_res.view.activity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.booking_res.R;
import com.example.booking_res.Helper.FragmentManagerHelper;
import com.example.booking_res.repo.BaseRepo;
import com.example.booking_res.repo.SignInRepo;
import com.example.booking_res.view.fragment.MainFragment;
import com.example.booking_res.viewmodels.UserViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MAIN_ACTIVITY_TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Thiết lập Edge-to-Edge Layout
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setDecorFitsSystemWindows(false);
        }

        setContentView(R.layout.activity_main);

        FragmentManagerHelper.getInstance().init(getSupportFragmentManager(), R.id.fragmentContainer);

        FragmentManagerHelper.getInstance().replaceFragment(MainFragment.newInstance(), false);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}