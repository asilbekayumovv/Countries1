package uz.itschool.countries


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import uz.itschool.countries.databinding.ActivityMoreInfoBinding


class MoreInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMoreInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var user: Country = intent.getSerializableExtra("user") as Country
        binding.img.load(user.img) {
            placeholder(R.drawable.ic_launcher_background)
            error(androidx.appcompat.R.drawable.abc_btn_radio_material_anim)
        }


        binding.name.text = user.name
        binding.population.text = user.population
        binding.area.text = user.area

    }
}