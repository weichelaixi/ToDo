package com.example.chewei.todo.com.example.chewei.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.chewei.todo.R;
import com.example.chewei.todo.com.example.chewei.bean.NoteBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/27.
 */

public class ItemAdapter extends RecyclerView.Adapter {
    Context mContext;
    List<NoteBean> noteBeanList;
    LayoutInflater inflater;
    MyViewHolder myViewHolder;

    public ItemAdapter(Context mContext, ArrayList<NoteBean> lists){
        this.mContext = mContext;
        this.noteBeanList = lists;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_time_line,parent);
        myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //时间轴竖线的layout
        RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) myViewHolder.line.getLayoutParams();
        if(position == 0){

        }else{

        }
        holder.itemView.setTag(position);

    }

    @Override
    public int getItemCount() {
        return noteBeanList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public RelativeLayout title;
        public View line;
        public TextView date;
        public TextView content;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (RelativeLayout) itemView.findViewById(R.id.rl_title);
            line = (View) itemView.findViewById(R.id.v_line);
            date = (TextView) itemView.findViewById(R.id.txt_date_time);
            content = (TextView) itemView.findViewById(R.id.txt_date_content);
        }
    }
}
