package com.example.ngajarpmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DescriptionActivity extends AppCompatActivity {

    ImageView ivAvatar;
    TextView tvNama, tvGender;

    String nama, gender;
    int avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        tvNama = findViewById(R.id.tvDescNama);
        tvGender = findViewById(R.id.tvDescGender);
        ivAvatar= findViewById(R.id.ivDescAvatar);

        getData();
        setData();
    }

    private void getData(){
        if (getIntent().hasExtra("avatar") && getIntent().hasExtra("nama") && getIntent().hasExtra("gender")){

            nama = getIntent().getStringExtra("nama");
            gender = getIntent().getStringExtra("gender");
            avatar = getIntent().getIntExtra("avatar", 1);

        } else {
            Toast.makeText(this, "Data Tidak Ada", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        tvNama.setText(nama);
        tvGender.setText(gender);
        ivAvatar.setImageResource(avatar);
    }
}