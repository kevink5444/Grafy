package com.kelompok4.grafy

import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class SettingAdapter(var mContext: Context, var resources: Int,var items:List<Settings>): ArrayAdapter<Settings>(mContext,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources,null)
        val imageView:ImageView = view.findViewById(R.id.photo1)
        val bagian: TextView = view.findViewById(R.id.textview1)
        val deskripsi : TextView = view.findViewById(R.id.textview2)
        var mItem: Settings = items [position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo1))
        bagian.text = mItem.bagian
        deskripsi.text = mItem.deskripsi
        return view
    }
}

private fun ImageView.setImageDrawable(drawable: Unit) {

}

private fun Resources.getDrawable(photo1: String) {

}
