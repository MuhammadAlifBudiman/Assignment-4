package unj.cs.hw4.ui.coffee;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.List;

import unj.cs.hw4.adapter.CoffeeAdapter;
import unj.cs.hw4.data.Datasource;
import unj.cs.hw4.databinding.FragmentCoffeeBinding;
import unj.cs.hw4.model.Coffee;
import unj.cs.hw4.R;

public class CoffeeFragment extends Fragment{
    private FragmentCoffeeBinding binding;
    private  RecyclerView.LayoutManager layoutManager ;
    private List<Coffee> myDataset;
    private RecyclerView.Adapter<CoffeeAdapter.ItemViewHolder> adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentCoffeeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        List<Coffee> myDataset = new Datasource().loadCoffee();
        RecyclerView recyclerView = view.findViewById(R.id.listCoffee);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        CoffeeAdapter adapter = new CoffeeAdapter(getContext(), myDataset);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}