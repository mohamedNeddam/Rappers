package com.example.rappers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rappers.adapter.RapperAdapter
import com.example.rappers.databinding.FragmentRapperListBinding

class RapperListFragment : Fragment() {
    private lateinit var letterId: String

    lateinit  var recyclerView : RecyclerView
    private var _binding : FragmentRapperListBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            letterId = it.getString("letter").toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRapperListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val letterId = activity?.intent?.extras?.getChar("char")

        recyclerView = binding.RapperRecycleView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RapperAdapter(requireContext() ,letterId.toCharArray()[0] ?: 'A')

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}