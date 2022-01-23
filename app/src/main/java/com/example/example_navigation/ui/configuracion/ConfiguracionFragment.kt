package com.example.example_navigation.ui.configuracion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.example_navigation.R
import com.example.example_navigation.databinding.FragmentConfiguracionBinding
import com.example.example_navigation.databinding.FragmentFlotaBinding
import com.example.example_navigation.databinding.FragmentHojaDeRutaBinding
import com.example.example_navigation.ui.flota.FlotaViewModel
import com.example.example_navigation.ui.hojaDeRuta.HojaDeRutaViewModel

class ConfiguracionFragment : Fragment() {

    private lateinit var configuracionViewModel: ConfiguracionViewModel
    private var _binding: FragmentConfiguracionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        configuracionViewModel =
            ViewModelProvider(this).get(ConfiguracionViewModel::class.java)

        _binding = FragmentConfiguracionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tituloConfiguracion
        configuracionViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
