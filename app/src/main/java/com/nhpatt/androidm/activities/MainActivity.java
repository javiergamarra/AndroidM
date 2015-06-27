package com.nhpatt.androidm.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.nhpatt.androidm.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Class destination = getDestinationActivity(view);
        startActivity(new Intent(this, destination));
    }

    private Class getDestinationActivity(View view) {
        switch (view.getId()) {
            case R.id.applinks:
                return AppLinksActivity.class;
            case R.id.coordinator_layout:
                return CoordinatorLayoutActivity.class;
            case R.id.direct_share:
                return DirectShareActivity.class;
            case R.id.fab:
                return FABActivity.class;
            case R.id.material_edit_text:
                return MaterialEditTextsActivity.class;
            case R.id.observable_binding:
                return ObservableBindingActivity.class;
            case R.id.permissions:
                return PermissionsActivity.class;
            case R.id.snackbar:
                return SnackbarActivity.class;
            case R.id.tablayout:
                return TabLayoutActivity.class;
            case R.id.vector_drawable:
                return VectorDrawableActivity.class;
            default:
                return BindingActivity.class;
        }
    }
}
