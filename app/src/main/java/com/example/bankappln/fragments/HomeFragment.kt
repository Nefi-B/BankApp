package com.example.bankappln.fragments



import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bankappln.MainActivity
import com.example.bankappln.R
import com.example.bankappln.RecyclerViewAdapter

import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
     lateinit var adapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>
     lateinit var layoutManager: RecyclerView.LayoutManager


     override fun onCreateView(
          inflater: LayoutInflater, container: ViewGroup?,
          savedInstanceState: Bundle?
     ): View? {
          // Inflate the layout for this fragment
          return inflater.inflate(R.layout.fragment_home, container, false)
     }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
          super.onViewCreated(view, savedInstanceState)


          layoutManager = LinearLayoutManager(context)
          recyclerView.layoutManager = layoutManager

          adapter = RecyclerViewAdapter()
          recyclerView.adapter = adapter
     }




}



