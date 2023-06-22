// file for different database set up not currently used on this version

package com.prog.greetopiaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirthdayRVAdapter extends RecyclerView.Adapter<BirthdayRVAdapter.ViewHolder> {

    // variable for our array list and context
    private ArrayList<BirthdayModal> birthdayModalArrayList;
    private Context context;

    // constructor
        public BirthdayRVAdapter(ArrayList<BirthdayModal> birthdayModalArrayList, Context context) {
        this.birthdayModalArrayList = birthdayModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.birthday_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // on below line we are setting data
        // to our views of recycler view item.
        BirthdayModal modal = birthdayModalArrayList.get(position);
        holder.birthdayNameTV.setText(modal.getRecipientName());
        holder.birthdayAgeTV.setText(modal.getRecipientAge());
    }

    @Override
    public int getItemCount() {
        // returning the size of our array list
        return birthdayModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our text views.
        private TextView birthdayNameTV, birthdayAgeTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
            birthdayNameTV = itemView.findViewById(R.id.idTVRecipientName);
            birthdayAgeTV = itemView.findViewById(R.id.idTVRecipientAge);
        }
    }

}
