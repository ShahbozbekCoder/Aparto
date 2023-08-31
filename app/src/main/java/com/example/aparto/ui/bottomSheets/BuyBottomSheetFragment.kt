package com.example.aparto.ui.bottomSheets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aparto.R
import com.example.aparto.databinding.FragmentBuyBottomSheetBinding
import com.example.aparto.databinding.FragmentSellBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BuyBottomSheetFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentBuyBottomSheetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentBuyBottomSheetBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun getTheme(): Int {
        return R.style.AppBottomSheetDialogThemeCustom
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}