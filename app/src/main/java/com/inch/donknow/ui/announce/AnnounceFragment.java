package com.inch.donknow.ui.announce;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.inch.donknow.databinding.FragmentAnnounceBinding;

public class AnnounceFragment extends Fragment {

    private FragmentAnnounceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AnnounceViewModel announceViewModel = new ViewModelProvider(this).get(AnnounceViewModel.class);

        binding = FragmentAnnounceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAnnounce;
        announceViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
