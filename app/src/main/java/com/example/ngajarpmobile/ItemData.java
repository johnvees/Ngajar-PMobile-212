package com.example.ngajarpmobile;

import java.util.ArrayList;

public class ItemData {
    private static String[] namaKaryawan = {
            "Yohanes Velly",
            "Tsani Chico",
            "Tito Anggoro",
            "Faisal Karin",
            "Ryan Ardito"
    };

    private static String[] genderKaryawan = {
            "Laki-laki",
            "Laki-laki",
            "Laki-laki",
            "Laki-laki",
            "Laki-laki"
    };

    private static int[] avatarKaryawan = {
            R.drawable.avatar1,
            R.drawable.avatar2,
            R.drawable.avatar3,
            R.drawable.avatar4,
            R.drawable.avatar5
    };

    static ArrayList<SetGetItem> getListData() {
        ArrayList<SetGetItem> list = new ArrayList<>();
        for (int position = 0; position < namaKaryawan.length; position++){
            SetGetItem item = new SetGetItem();
            item.setNama(namaKaryawan[position]);
            item.setGender(genderKaryawan[position]);
            item.setAvatar(avatarKaryawan[position]);
            list.add(item);
        }
        return list;
    }
}
