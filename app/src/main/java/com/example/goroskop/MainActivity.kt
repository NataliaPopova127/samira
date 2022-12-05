package com.example.goroskop

import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {
    var tree : String = ""
    lateinit var calendar : Calendar
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Goroskop)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle(getString(R.string.app_name))

        when (resources.configuration.uiMode.and(Configuration.UI_MODE_NIGHT_MASK)) {
            Configuration.UI_MODE_NIGHT_NO -> back.background = getDrawable(R.color.back)
            Configuration.UI_MODE_NIGHT_YES -> back.background = getDrawable(R.color.black)
        }

        calendarView.setOnDateChangeListener { view, year, month , dayOfMonth ->
            calendar = GregorianCalendar(year,month + 1,dayOfMonth)
        }
    }

    fun btnStartClick(view: View) {
        try{
            var bornDay = calendar.get(Calendar.DAY_OF_MONTH)
            var bornMonth = calendar.get(Calendar.MONTH)

            //декабрь == 0

            if(bornDay >= 23 && bornMonth == 0
                || bornDay <= 1  && bornMonth == 1
                || bornDay >= 25 && bornMonth == 6
                || bornDay <= 4 && bornMonth == 7)
                tree = "яблоня"
            else if(bornDay >= 2 && bornMonth == 1
                || bornDay <= 11  && bornMonth == 1
                || bornDay >= 5 && bornMonth == 7
                || bornDay <= 14 && bornMonth == 7)
                tree = "пихта"
            var intent : Intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("tree", tree)
            startActivity(intent)
            finish()
        }
        catch (e : java.lang.Exception){
            Toast.makeText(this,"Ошибка", Toast.LENGTH_LONG).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.darkTheme -> {
                back.background = getDrawable(R.color.black)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            R.id.lightTheme -> {
                back.background = getDrawable(R.color.back)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}