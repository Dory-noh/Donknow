package com.inch.donknow.ui.rc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.inch.donknow.databinding.FragmentRcBinding;

public class RcFragment extends Fragment {

    private FragmentRcBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RcViewModel rcViewModel = new ViewModelProvider(this).get(RcViewModel.class);

        binding = FragmentRcBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRc;
        rcViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
