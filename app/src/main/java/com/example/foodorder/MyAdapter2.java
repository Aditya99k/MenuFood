package com.example.foodorder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder> {

    Context context;
    ArrayList<Profile2> profiles;

    public MyAdapter2(Context c,ArrayList<Profile2> p){
        context=c;
        profiles=p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview2,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(profiles.get(position).getadded()) {
            holder.name.setText(profiles.get(position).getName());
            holder.email.setText(profiles.get(position).getEmail());
            Picasso.with(context).load(profiles.get(position).getProfilePic()).into(holder.profilePic);
        }
        /*else{
            holder.btn.setVisibility(View.INVISIBLE);
            holder.item.setVisibility(View.INVISIBLE);
            holder.price.setVisibility(View.INVISIBLE);
        }*/
        // holder.btn.setVisibility(View.VISIBLE);
        //holder.onClick(position);
        String s1=profiles.get(position).getName();
        String s2=profiles.get(position).getEmail();
        holder.Display(s1,s2);




    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,email,item,price;
        ImageView profilePic;
        Button btn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name2);
            email=(TextView)itemView.findViewById(R.id.email2);
            profilePic=(ImageView)itemView.findViewById(R.id.profilePic2);
            btn=(Button)itemView.findViewById(R.id.checkDetails2);
            item=(TextView)itemView.findViewById(R.id.itemtextview);
            price=(TextView)itemView.findViewById(R.id.pricetextview);

        }

        /*public void onClick(final int position)
        {
               btn.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(context,position+" item is clicked",Toast.LENGTH_SHORT).show();
                   }
               });
        }*/
        public void Display(final String orderedfoodname, final String costprice)
        {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,orderedfoodname+" SELECTED",Toast.LENGTH_SHORT).show();

                    Intent intent=new Intent(context,Main2Activity.class);
                    intent.putExtra("foodname",orderedfoodname);
                    intent.putExtra("costprice",costprice);
                    context.startActivity(intent);









                }
            });

        }
    }

}
