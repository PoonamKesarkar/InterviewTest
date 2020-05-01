package com.example.machinetestapplication.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.machinetestapplication.R;
import com.example.machinetestapplication.databinding.BranchListItemBinding;
import com.example.machinetestapplication.model.Branch;
import com.example.machinetestapplication.util.CommonMethods;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class BranchAdapter extends RecyclerView.Adapter<BranchAdapter.ViewHolder> {
    private ArrayList<Branch> listdata;
    private Context context;

    public BranchAdapter(Context context, ArrayList<Branch> listdata) {
        this.listdata = listdata;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        BranchListItemBinding listItemBinding= DataBindingUtil.inflate(layoutInflater,R.layout.branch_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItemBinding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.listItemBinding.setBranch(listdata.get(position));

        if (new CommonMethods().isInternetConnection(context)) {
            //Used glide for loading image
            Glide.with(context)
                    .load(listdata.get(position).getImage())
                    .placeholder(R.drawable.branch_logo)
                    .into(holder.listItemBinding.imgBranch);

        } else {
            holder.listItemBinding.imgBranch.setBackgroundResource(R.drawable.branch_logo);
        }

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private BranchListItemBinding listItemBinding;

        public ViewHolder(@NonNull BranchListItemBinding itemView) {
            super(itemView.getRoot());
            listItemBinding = itemView;
        }
    }
}
