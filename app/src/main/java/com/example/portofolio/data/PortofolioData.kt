package com.example.portofolio.data

import com.example.portofolio.R

object PortofolioData {
    private val title = arrayOf(
        "Chat App",
        "Travel App",
        "Contact App",
        "Food App",
        "Event Organized App",
        "Daily Profile App",
        "Petshop App",
        "Family Plan App",
        "Task Manager App",
        "Offine Automation App"
    )

    private val poster = arrayOf(
        R.drawable.chat,
        R.drawable.travel,
        R.drawable.phoneapp,
        R.drawable.food,
        R.drawable.event,
        R.drawable.dailyprofile,
        R.drawable.petshop,
        R.drawable.familyplan,
        R.drawable.taskmanager,
        R.drawable.office
    )

    private val link = arrayOf(
        "https://search.muz.li/NmU5MmY5YTM4",
        "https://pin.it/3ttUnfs",
        "https://pin.it/77qUdZ7",
        "https://pin.it/2RdMJ7Y",
        "https://pin.it/2LhIJHX",
        "https://pin.it/B8Zq5fV",
        "https://pin.it/6JUvToT",
        "https://pin.it/3tWyoXW",
        "https://pin.it/6xnCZEw",
        "https://pin.it/7pnOqvu",
    )

    val listAppAndroid: ArrayList<Portofolio>
    get() {
        val list = arrayListOf<Portofolio>()
        for (i in link.indices) {
            val android = Portofolio()
            android.title = title[i]
            android.image = poster[i]
            android.link = link[i]
            list.add(android)
        }
        return list
    }

    private val titleExperience = arrayOf(
        "Android Associated Developer",
        "Android Pemula",
        "Memulai Program Bahasa Kotlin",
        "Memulai Bahasa Program Python",
        "SOLID Principle"
    )

    private val detailExperience = arrayOf(
        "sertifikat ini merupakan sertifikat yang diterbitkan langsung oleh Google untuk devolper Android",
        "Android pemula merupakan course yang  diadakan oleh dicoding untuk belajar program android",
        "memulai progres bahasa kotlin merupakan coourse yang bertujuan untuk mempelajari bahas kotlin",
        "memulai progres bahasa kotlin merupakan coourse yang bertujuan untuk mempelajari bahas python",
        "solid principle mempeljari tentang oop, cleand code, dll"
    )

    private val imageExperience = intArrayOf(
        R.drawable.aad,
        R.drawable.androidcert,
        R.drawable.kotlincert,
        R.drawable.pythoncert,
        R.drawable.solidcert
    )

    val listDataExperience:ArrayList<Portofolio>
        get() {
            val list = arrayListOf<Portofolio>()
            for (position in titleExperience.indices) {
                val experience = Portofolio()
                experience.title = titleExperience[position]
                experience.detail = detailExperience[position]
                experience.image = imageExperience[position]
                list.add(experience)
            }

            return list
        }
}