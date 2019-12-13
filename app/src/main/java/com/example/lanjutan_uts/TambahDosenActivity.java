package com.example.lanjutan_uts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.EditText;
import android.widget.ImageView;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class TambahDosenActivity extends AppCompatActivity {
        private static final Object FILE_ACCES_REQUEST_CODE = ;
        private EditText txtNama, txtNidn, txtAlamat, txtGelar, txtEmail, txtFoto;
        private ImageView imgDosen;
        private ProgressDialog progressDialog;
        private static final int GALLERY_REQUEST_CODE = 58;
        private static final int FILE_ACCESS_REQUEST_CODE = 58;
        private String stringImg = "";
        private boolean isUpdate = false;
        private String idDosen = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_dosen);

        if (ActivityCompat.checkSelfPermission( this,
                Manifest.permission.READ_EXTERNAL_STORAGE) != PERMISSION_GRANTED)
        ActivityCompat.requestPermissions( this, new String[]{
                Manifest.permission.READ_EXTERNAL_STORAGE
                ,FILE_ACCESS_REQUEST_CODE);

        }

    }

    public EditText getTxtNidn() {
        return txtNidn;
    }

    public EditText getTxtAlamat() {
        return txtAlamat;
    }

    public EditText getTxtGelar() {
        return txtGelar;
    }

    public EditText getTxtEmail() {
        return txtEmail;
    }

    public EditText getTxtFoto() {
        return txtFoto;
    }

    public ImageView getImgDosen() {
        return imgDosen;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK)
            switch (requestCode){
                case GALLERY_REQUEST_CODE;
                    Uri selectedImage = data.getData();
                    imgDosen.setImageURI(selectedImage);

                    String[] filePathColum = {MediaStore.Images.Media.DATA};
                    Cursor cursor = getContentResolver().query(selectedImage,
                            filePathColum, null, null, null;

                    cursor.moveToFirst();
                    int columnIndex = cursor.getColumnIndex(filePathColum[0]);

                    String imgDecodableString = cursor.getString(columnIndex);
                    txtFoto.setText(imgDecodableString);
                    cursor.close();
}
