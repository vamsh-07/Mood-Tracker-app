package com.example.moodtracker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moodtracker.databinding.FragmentLogMoodBinding

class LogMoodFragment : Fragment() {
    private var _binding: FragmentLogMoodBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentLogMoodBinding.inflate(inflater, container, false)
        binding.saveMoodButton.setOnClickListener {
            val mood = binding.moodInput.text.toString()
            val note = binding.noteInput.text.toString()
            // TODO: Save mood & note
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
