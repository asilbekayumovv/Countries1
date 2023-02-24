package uz.itschool.countries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.countries.databinding.ActivityEditCountryBinding

class EditCountry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_country)

        var binding = ActivityEditCountryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var country = intent.getSerializableExtra("country") as Country
        var index = intent.getIntExtra("index", 0)

        binding.population.setText(country.population)
        binding.area.setText(country.area)

        binding.save.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("population", binding.population.text.toString())
            intent.putExtra("area", binding.area.text.toString())
            intent.putExtra("index", index)
            startActivity(intent)
            finish()
        }
    }
}