package com.example.convidados.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.convidados.adapter.GuestAdapter
import com.example.convidados.databinding.FragmentAllGuestsBinding
import com.example.convidados.viewModel.AllGuestsViewModel

class AllGuestsFragment : Fragment() {

    private var _binding: FragmentAllGuestsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val adapter = GuestAdapter()
    private lateinit var homeViewModel: AllGuestsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel =
            ViewModelProvider(this).get(AllGuestsViewModel::class.java)

        _binding = FragmentAllGuestsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //recycler view
        _binding!!.recyclerGuests.layoutManager = LinearLayoutManager(context)
        _binding!!.recyclerGuests.adapter = adapter

        homeViewModel.getAll()
        homeViewModel.listGuests().observe(viewLifecycleOwner) {
            adapter.updateGuest(it)
        }
        return root
    }


    override fun onStart() {
        super.onStart()
        homeViewModel.getAll()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}