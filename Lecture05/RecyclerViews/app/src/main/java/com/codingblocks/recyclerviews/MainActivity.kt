package com.codingblocks.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val courses = genNRandomCourses(200)

        rvCourses.layoutManager = LinearLayoutManager(this)
        rvCourses.adapter = CourseAdapter(courses)

    }
}
