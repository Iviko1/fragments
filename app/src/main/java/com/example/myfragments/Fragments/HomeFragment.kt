package com.example.myfragments.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myfragments.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var navController: NavController

    private lateinit var editText: EditText

    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editTextNumber)

        button = view.findViewById(R.id.button)

        navController = Navigation.findNavController(view)

        button.setOnClickListener {

            val amounts = editText.text.toString().toInt()

            val action = HomeFragmentDirections.actionNavigationHomeToNavigationNotification(amounts)

            navController.navigate(action)

        }


    }
}