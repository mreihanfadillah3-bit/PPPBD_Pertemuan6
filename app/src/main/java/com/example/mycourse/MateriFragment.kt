package com.example.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycourse.databinding.FragmentMateriBinding

class MateriFragment : Fragment() {

    private var _binding: FragmentMateriBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMateriBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMateri = listOf(
            Materi("1. Linear Layout", "Materi Praktikum 1"),
            Materi("2. Relative Layout", "Materi Praktikum 2"),
            Materi("3. Constraint Layout", "Materi Praktikum 3"),
            Materi("4. Activity & Intent", "Materi Praktikum 4"),
            Materi("5. UI Component", "Materi Praktikum 5"),
            Materi("6. Style, Option Menu & Tabs Layout", "Materi Praktikum 6")
        )

        binding.rvMateri.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMateri.adapter = MateriAdapter(listMateri)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
