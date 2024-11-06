package com.example.menu1;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    private TextView textView;
    private String[] textOptions = {"Text Option 1", "Text Option 2", "Text Option 3"};

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragments_first, container, false);
        textView = view.findViewById(R.id.text_view);


        registerForContextMenu(textView);
        return view;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getActivity().getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.option1) {
            textView.setText("Первый бум");
            return true;
        } else if (item.getItemId() == R.id.option2) {
            textView.setText("Второй бум");
            return true;
        } else if (item.getItemId() == R.id.option3) {
            textView.setText("Мега бум");
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }
}
