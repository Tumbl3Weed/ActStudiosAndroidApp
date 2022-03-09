package com.example.myapplication.ui.schools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentSchoolsBinding


class SchoolsFragment : Fragment() {

    private var _binding: FragmentSchoolsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val schoolViewModel =
            ViewModelProvider(this).get(SchoolsViewModel::class.java)

        _binding = FragmentSchoolsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSchools
        schoolViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}