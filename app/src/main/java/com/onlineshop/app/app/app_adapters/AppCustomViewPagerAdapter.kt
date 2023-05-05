package com.onlineshop.app.app.app_adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.onlineshop.app.app.app_fragment.CartFragment
import com.onlineshop.app.app.app_fragment.OrdersFragment
import com.onlineshop.app.app.app_fragment.ProfileFragment
import com.onlineshop.app.app.app_fragment.ShopFragment

class AppCustomViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                ShopFragment()
            }
            1->{
                CartFragment()
            }
            2->{
                OrdersFragment()
            }
            3->{
                ProfileFragment()
            }
            else-> Fragment()
        }
       }

}