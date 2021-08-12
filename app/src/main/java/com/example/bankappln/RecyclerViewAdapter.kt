package com.example.bankappln

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView





class RecyclerViewAdapter: RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>() {

    val image :IntArray= intArrayOf(R.drawable.paytm,R.drawable.cash, R.drawable.gpay, R.drawable.paypal, R.drawable.visa, R.drawable.mastercard,R.drawable.cash, R.drawable.paypal,R.drawable.paytm,R.drawable.cash, R.drawable.gpay, R.drawable.paypal, R.drawable.visa, R.drawable.mastercard,R.drawable.cash, R.drawable.paypal)


     val textTitle :Array<String> = arrayOf("Paytm","Envato Payment", "Gpay", "Paypal", "VisaCard","MasterCard", "Envato Payment", "Paypal","Paytm","Envato Payment", "Gpay", "Paypal", "VisaCard","MasterCard", "Envato Payment", "Paypal")
    val textTitle1 :Array<String> = arrayOf("+$900","+$1200", "-$50", "+$436", "+$20", "-$450","+$90", "+$30","+$900","+$1200", "-$50", "+$476", "+$20", "-$470","+$910", "+$80")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image: ImageView
        var textTitle: TextView
       var textTitle1:TextView

        init {
            image = itemView.findViewById(R.id.image_view)
            textTitle= itemView.findViewById(R.id.text_view1)
            textTitle1 =itemView.findViewById(R.id.text_view2)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_view, parent, false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.image.setImageResource(image[position])
        holder.textTitle.text = textTitle[position]
        holder.textTitle1.text = textTitle1[position]

    }

    override fun getItemCount(): Int {
        return textTitle.size
    }
}
