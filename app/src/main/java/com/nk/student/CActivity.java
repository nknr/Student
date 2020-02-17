package com.nk.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.nk.student.databinding.ActivityMainBinding;

public class CActivity extends BaseActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        RecyclerAdapter adapter = new RecyclerAdapter();
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
        adapter.setContentValueList(Constant.getActivityList());
        adapter.setListener(position -> {
            Class className = adapter.getItemAtPosition(position).getClassName();
            Log.d("Activity ", " move from " + getClass().getSimpleName() + " to " + className.getSimpleName());
            startActivity(new Intent(this, adapter.getItemAtPosition(position).getClassName()));
        });
    }
}
