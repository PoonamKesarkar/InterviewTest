package com.example.machinetestapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.machinetestapplication.R;
import com.example.machinetestapplication.databinding.BranchListItemBinding;
import com.example.machinetestapplication.databinding.UniversityListItemBinding;
import com.example.machinetestapplication.model.Branch;
import com.example.machinetestapplication.model.University;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class UniversityAdapter extends RecyclerView.Adapter<UniversityAdapter.ViewHolder>{
    private ArrayList<University> listdata;
    private Context context;

    public UniversityAdapter(Context context, ArrayList<University> listdata) {
        this.listdata = listdata;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        UniversityListItemBinding listItemBinding= DataBindingUtil.inflate(layoutInflater, R.layout.university_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItemBinding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.listItemBinding.setUniversity(listdata.get(position));
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private UniversityListItemBinding listItemBinding;

        public ViewHolder(@NonNull UniversityListItemBinding itemView) {
            super(itemView.getRoot());
            listItemBinding = itemView;
        }
    }
}
