package com.parham.msu.criminal_intent11

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.parham.msu.criminal_intent11.databinding.ListItemCrimePoliceBinding
import java.text.SimpleDateFormat
import java.util.*

class CrimePoliceHolder(private val binding: ListItemCrimePoliceBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(crime: Crime) {
        binding.apply {
            crimeTitle.text = crime.title
            crimeDate.text = SimpleDateFormat("EEE MMM dd HH:mm z yyyy", Locale.getDefault()).format(crime.date)
            root.setOnClickListener {
                Toast.makeText(
                    binding.root.context,
                    "Serious crime ${crime.title} clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            contactPoliceButton.setOnClickListener {
                // Handle button click event for contacting the police
                // For example, you can launch a new activity or show a dialog
            }
        }
    }
}