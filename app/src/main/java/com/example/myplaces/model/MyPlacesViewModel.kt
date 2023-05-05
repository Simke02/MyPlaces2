package com.example.myplaces.model

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.lifecycle.ViewModel
import com.example.myplaces.R
import com.example.myplaces.data.MyPlaces

class MyPlacesViewModel: ViewModel() {
    var myPlacesList: ArrayList<String> = ArrayList<String>()
    fun addPlace(place: String){
        myPlacesList.add(place);
    }
}