package com.example.example_navigation.ui.flota

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.example_navigation.R
import com.example.example_navigation.databinding.FragmentEgresosBinding
import com.example.example_navigation.databinding.FragmentFlotaBinding
import com.example.example_navigation.databinding.FragmentHojaDeRutaBinding
import com.example.example_navigation.ui.egresos.EgresosViewModel
import com.example.example_navigation.ui.hojaDeRuta.HojaDeRutaViewModel

class FlotaFragment : Fragment() {

    private lateinit var flotaViewModel: FlotaViewModel
    private var _binding: FragmentFlotaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        flotaViewModel =
            ViewModelProvider(this).get(FlotaViewModel::class.java)

        _binding = FragmentFlotaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tituloFlota
        flotaViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}