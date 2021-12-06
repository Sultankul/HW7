package com.example.hw7.fragments.homeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw7.R;
import com.example.hw7.models.Model;

import java.util.ArrayList;

public class homeFragment extends Fragment {

    private HomeAdapter adapter;
    private ArrayList<Model> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }
    private void createList() {
        list = new ArrayList<>();
        list.add(new Model("his work seems so peaceful besides the hard labour. out in nature collecting mushrooms. i truly wish him good harvests and health", R.drawable.image));
        list.add(new Model("who plays genshin impact and picks 50 up daily", R.drawable.image));
        list.add(new Model("You guys need to do a segment like, ", R.drawable.image));
        list.add(new Model("Fun fact : everything in Japan was expensive business ngl", R.drawable.image));
        list.add(new Model("I absolutely love watching how people do things the old ways.", R.drawable.image));




    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.rv_recycler);
        adapter = new HomeAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }
}