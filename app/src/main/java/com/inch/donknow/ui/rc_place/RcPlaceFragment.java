package com.inch.donknow.ui.rc_place;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.inch.donknow.databinding.FragmentRcPlaceBinding;

public class RcPlaceFragment extends Fragment {

    private FragmentRcPlaceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RcPlaceViewModel rcPlaceViewModel = new ViewModelProvider(this).get(RcPlaceViewModel.class);

        binding = FragmentRcPlaceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRcPlace;
        rcPlaceViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
