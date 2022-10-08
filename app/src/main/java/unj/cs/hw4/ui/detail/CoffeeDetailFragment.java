package unj.cs.hw4.ui.detail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import unj.cs.hw4.R;
import unj.cs.hw4.data.Datasource;
import unj.cs.hw4.databinding.FragmentCoffeeBinding;
import unj.cs.hw4.databinding.FragmentCoffeeDetailBinding;
import unj.cs.hw4.model.Coffee;

public class CoffeeDetailFragment extends Fragment {
    private FragmentCoffeeDetailBinding binding;
    private CoffeeDetailViewModel mViewModel;

    public static CoffeeDetailFragment newInstance() {
        return new CoffeeDetailFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentCoffeeDetailBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        int img = CoffeeDetailFragmentArgs.fromBundle(getArguments()).getCurrentCoffee().getImageResourceId();
        int title = CoffeeDetailFragmentArgs.fromBundle(getArguments()).getCurrentCoffee().getTitle();
        int desc = CoffeeDetailFragmentArgs.fromBundle(getArguments()).getCurrentCoffee().getDesc();
        List<Coffee> myDataset = new Datasource().loadCoffee();
        binding.imageView.setImageResource(img);
        binding.textView.setText(view.getContext().getResources().getString(title));
        binding.textView2.setText(view.getContext().getResources().getString(desc));
        binding.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}