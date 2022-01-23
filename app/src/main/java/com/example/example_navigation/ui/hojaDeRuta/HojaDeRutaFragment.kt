package com.example.example_navigation.ui.hojaDeRuta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.example_navigation.databinding.FragmentHojaDeRutaBinding

class HojaDeRutaFragment : Fragment() {

    private lateinit var rutaViewModel: HojaDeRutaViewModel
    private var _binding: FragmentHojaDeRutaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        rutaViewModel =
            ViewModelProvider(this).get(HojaDeRutaViewModel::class.java)

        _binding = FragmentHojaDeRutaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textoRuta
        rutaViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}