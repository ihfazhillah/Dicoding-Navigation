package com.ihfazh.dicodingnavigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailCategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailCategoryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String EXTRA_NAME = "extra name";
    public static final String EXTRA_DESCRIPTION = "extra description";

    // TODO: Rename and change types of parameters
    private String mName;
    private String mParam2;

    public DetailCategoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetailCategoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailCategoryFragment newInstance(String param1, String param2) {
        DetailCategoryFragment fragment = new DetailCategoryFragment();
        Bundle args = new Bundle();
        args.putString(EXTRA_NAME, param1);
        args.putString(EXTRA_DESCRIPTION, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = DetailCategoryFragmentArgs.fromBundle(getArguments()).getName();
            mParam2 = DetailCategoryFragmentArgs.fromBundle(getArguments()).getDescription();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvName, tvDescription;
        tvName = view.findViewById(R.id.tv_category_name);
        tvDescription = view.findViewById(R.id.tv_category_description);

        tvName.setText(mName);
        tvDescription.setText(mParam2);
    }
}