package unj.cs.hw4.ui.favorite;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import unj.cs.hw4.R;
import unj.cs.hw4.adapter.CoffeeAdapter;
import unj.cs.hw4.adapter.FavoriteAdapter;
import unj.cs.hw4.data.Datasource;
import unj.cs.hw4.databinding.FragmentCoffeeBinding;
import unj.cs.hw4.databinding.FragmentFavoriteBinding;
import unj.cs.hw4.model.Coffee;

public class FavoriteFragment extends Fragment{

    private FavoriteViewModel mViewModel;
    private FragmentFavoriteBinding binding;
    public static FavoriteFragment newInstance() {
        return new FavoriteFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentFavoriteBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        List<Coffee> myDataset = new Datasource().loadCoffee();
        RecyclerView recyclerView = view.findViewById(R.id.listFavorite);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        FavoriteAdapter adapter = new FavoriteAdapter(getContext(), myDataset);
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