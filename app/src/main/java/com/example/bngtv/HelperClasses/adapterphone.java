package com.example.bngtv.HelperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bngtv.R;

import java.util.ArrayList;

public class adapterphone extends RecyclerView.Adapter<adapterphone.PhoneViewHold>  {

    ArrayList<phonehelper> phoneLaocations;
    final private ListItemClickListener mOnClickListener;

    public adapterphone(ArrayList<phonehelper> phoneLaocations, ListItemClickListener listener) {
        this.phoneLaocations = phoneLaocations;
        mOnClickListener = listener;
    }

    @NonNull

    @Override
    public PhoneViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.phonerecyclercard, parent, false);
        return new PhoneViewHold(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHold holder, int position) {


        phonehelper phonehelper = phoneLaocations.get(position);
        holder.image.setImageResource(phonehelper.getImage());
        holder.title1.setText(phonehelper.getTitle1());
        holder.title2.setText(phonehelper.getTitle2());
//        holder.relativeLayout.setBackground(phonehelper.getgradient());
    }

    @Override
    public int getItemCount() {
        return phoneLaocations.size();

    }

    public interface ListItemClickListener {
        void onphoneListClick(int clickedItemIndex);
    }

    public class PhoneViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {


        ImageView image;
        TextView title1,title2;
        RelativeLayout relativeLayout;


        public PhoneViewHold(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            //hooks

            image = itemView.findViewById(R.id.phone_image);
            title1 = itemView.findViewById(R.id.phone_title);
            title2 = itemView.findViewById(R.id.txt__test);
            relativeLayout = itemView.findViewById(R.id.card_relativeLayout);

        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onphoneListClick(clickedPosition);
        }
    }

}
