package com.ikkifik.myandroidapp.rapsodiapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMember: RecyclerView
    private var list: ArrayList<Member> = arrayListOf()
    private var title: String = "Home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = title

        rvMember = findViewById(R.id.rv_member)
        rvMember.setHasFixedSize(true)

        list.addAll(MemberData.listData)
        showRecyclerCardView()

    }

    private fun showRecyclerCardView() {
        rvMember.layoutManager = LinearLayoutManager(this)
        val cardViewMemberAdapter = CardViewMemberAdapter(list)
        rvMember.adapter = cardViewMemberAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.about ->{
                val moveAbout = Intent(this, AboutActivity::class.java)
                startActivity(moveAbout)
            }
        }
    }


}