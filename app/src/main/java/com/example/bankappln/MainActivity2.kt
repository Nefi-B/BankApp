package com.example.bankappln

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main2.*
import com.example.bankappln.fragments.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val homeFragment = HomeFragment()
        val transferFragment = TransferFragment()
        val paymentFragment = PaymentFragment()
        val savingsFragment = SavingsFragment()
        val menuFragment = MenuFragment()


        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> makeCurrentFragment(homeFragment)
                R.id.transfer -> makeCurrentFragment(transferFragment)
                R.id.payment -> makeCurrentFragment(paymentFragment)
                R.id.savings -> makeCurrentFragment(savingsFragment)
                R.id.menu -> makeCurrentFragment(menuFragment)
            }
           true
        }
    }



    private fun makeCurrentFragment(fragment: Fragment) =
    supportFragmentManager.beginTransaction().apply {
        replace(R.id.fl_wrapper,fragment)
        commit()

    }

}




