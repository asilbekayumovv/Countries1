package uz.itschool.countries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import uz.itschool.countries.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = mutableListOf<Country>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createUser()

        var adapter = Adapter(this, list)
        binding.main.adapter = adapter

        binding.main.setOnItemClickListener { _, _, i, _ ->
            var user = list[i]
            var intent = Intent(this, MoreInfoActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        }


    }

    private fun createUser() {
        list.add(
            Country(
                "Uzbekistan",
                "38,93 mln",
                "652,860 km²",
                R.drawable.uzbekistan,
            
            )
        )
        list.add(
            Country(
                "Spain",
                "2,87 mln",
                "27,400 km²",
                R.drawable.spain
           
            )
        )

        list.add(
            Country(
                "Argentina",
                "43,85 mln",
                "2,38 mln km²",
                R.drawable.argentina
        )
        )
        list.add(
            Country(
                "kazakhstan",
                "77 265",
                "470 km²",
                R.drawable.kazak
        )
        )
        list.add(
            Country(
                "Portugal",
                "32,86 mln",
                "1,24 mln km²",
                R.drawable.portugal
       
        )
        )
        list.add(
            Country(
                "Italy",
                "45,19 mln",
                "2,73 mln km²",
                R.drawable.italy
            
            )
        )
        list.add(
            Country(
                "Russia",
                "2,96 mln",
                "28,470 km²",
                R.drawable.russia
       
            )
        )
        list.add(
            Country(
                "Australia",
                "25,49 mln",
                "7,68 mln km²",
                R.drawable.australia            )
        )
        list.add(
            Country(
                "Azerbaijan",
                "10,13 mln",
                "82,658 km²",
                R.drawable.azerbajian
            )
        )
        list.add(
            Country(
                "Brazil",
                "212,55 mln",
                "8,35 mln km²",
                R.drawable.brazil
            )
        )
        list.add(
            Country(
                "China",
                "1,43 bln",
                "9,38 mln km²",
                R.drawable.china)
        )
        list.add(
            Country(
                "Canada",
                "37,74 mln",
                "9,09 mln km²",
                R.drawable.canada         )
        )
        list.add(
            Country(
                "England",
                "5,09 mln",
                "51,060 km²",
                R.drawable.england)
        )
        list.add(
            Country(
                "Croatia",
                "4,10 mln",
                "55,960 km²",
                R.drawable.croatia)
        )


        list.add(
            Country(
                "Turkmenistan",
                "59.39 mln",
                "1.22 mln km²",
                R.drawable.turkmenistan )
        )
        list.add(
            Country(
                "Kyrgyzstan",
                "6,692 mln",
                "199 900 km²",
                R.drawable.kyr )
        )
        list.add(
            Country(
                "Iran",
                "87,92 mln",
                "1 648 000 km²",
                R.drawable.iran )
        )
        list.add(
            Country(
                "USA",
                "331,9 mln",
                "9 834 000 km²",
                R.drawable.usa
            )
        )
        list.add(
            Country(
                "Wales",
                "3,136 mln",
                "20,779 km²",
                R.drawable.wales )
        )
        list.add(
            Country(
                "Egypt",
                "109,3 mln",
                "1 002 000 km²",
                R.drawable.egypt     )
        )
    }
}