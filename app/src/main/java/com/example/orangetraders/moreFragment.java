package com.example.orangetraders;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orangetraders.databinding.FragmentMoreBinding;

public class moreFragment extends Fragment {

    FragmentMoreBinding binding;
    public moreFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMoreBinding.inflate(inflater, container, false);

        //Fragment Transaction to Profile Screen
        binding.viewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profileFragment profileFragment = new profileFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, profileFragment);
                transaction.commit();
            }
        });

        //Fragment Transaction to My Ads Screen
        binding.myAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myAdFragment myAdFragment = new myAdFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, myAdFragment);
                transaction.commit();
            }
        });

        //Fragment Transaction to Favourite Ads Screen
        binding.favAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                favouriteAdsFragment favouriteAdsFragment = new favouriteAdsFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, favouriteAdsFragment);
                transaction.commit();
            }
        });

        //Fragment Transaction to Car Ads Screen
        binding.usedCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bodystyleFragment bodystyleFragment = new bodystyleFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, bodystyleFragment);
                transaction.commit();
            }
        });

        //Fragment Transaction to Contact Us Screen
        binding.contactUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactUsFragment contactUsFragment = new contactUsFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, contactUsFragment);
                transaction.commit();
            }
        });
        return binding.getRoot();
    }
}