package com.example.goroskop

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    var text : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Goroskop)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        when (resources.configuration.uiMode.and(Configuration.UI_MODE_NIGHT_MASK)) {
            Configuration.UI_MODE_NIGHT_NO -> back2.background = getDrawable(R.color.back)
            Configuration.UI_MODE_NIGHT_YES -> back2.background = getDrawable(R.color.black)
        }


        var result : Bundle? = intent.extras
        if(result != null){
            text = result.getString("tree")!!
        }
        setTitle(text)
        if(text == "яблоня"){
            ivTree.setImageResource(R.drawable.yablona)
            tvTree.text = getString(R.string.apple)
        }
        else if(text == "пихта"){
            ivTree.setImageResource(R.drawable.pihta)
            tvTree.text = getString(R.string.pihta)
        }
        else if(text == "вяз"){
            ivTree.setImageResource(R.drawable.vas)
            tvTree.text = getString(R.string.vas)
        }
        else if(text == "кипарис"){
            ivTree.setImageResource(R.drawable.kiparis)
            tvTree.text = getString(R.string.kiparis)
        }
        else if(text == "тополь"){
            ivTree.setImageResource(R.drawable.topol)
            tvTree.text = getString(R.string.topol)
        }
        else if(text == "кедр"){
            ivTree.setImageResource(R.drawable.kedr)
            tvTree.text = getString(R.string.kedr)
        }
        else if(text == "сосна"){
            ivTree.setImageResource(R.drawable.sosna)
            tvTree.text = getString(R.string.sosna)
        }
        else if(text == "ива"){
            ivTree.setImageResource(R.drawable.iva)
            tvTree.text = getString(R.string.iva)
        }
        else if(text == "липа"){
            ivTree.setImageResource(R.drawable.lipa)
            tvTree.text = getString(R.string.lipa)
        }
        else if(text == "орешник"){
            ivTree.setImageResource(R.drawable.oreshnik)
            tvTree.text = getString(R.string.oreshnik)
        }
        else if(text == "рябина"){
            ivTree.setImageResource(R.drawable.rabina)
            tvTree.text = getString(R.string.rabina)
        }
        else if(text == "клен"){
            ivTree.setImageResource(R.drawable.klen)
            tvTree.text = getString(R.string.klen)
        }
        else if(text == "орех"){
            ivTree.setImageResource(R.drawable.oreh)
            tvTree.text = getString(R.string.oreh)
        }
        else if(text == "жасмин"){
            ivTree.setImageResource(R.drawable.jasmin)
            tvTree.text = getString(R.string.jasmin)
        }
        else if(text == "каштан"){
            ivTree.setImageResource(R.drawable.kashtan)
            tvTree.text = getString(R.string.kashtan)
        }
        else if(text == "ясень"){
            ivTree.setImageResource(R.drawable.asen)
            tvTree.text = getString(R.string.asen)
        }
        else if(text == "граб"){
            ivTree.setImageResource(R.drawable.grab)
            tvTree.text = getString(R.string.grab)
        }
        else if(text == "инжир"){
            ivTree.setImageResource(R.drawable.injir)
            tvTree.text = getString(R.string.injir)
        }
        else if(text == "дуб"){
            ivTree.setImageResource(R.drawable.dub)
            tvTree.text = getString(R.string.dub)
        }
        else if(text == "береза"){
            ivTree.setImageResource(R.drawable.bereza)
            tvTree.text = getString(R.string.bereza)
        }
        else  if(text == "маслина"){
            ivTree.setImageResource(R.drawable.maslina)
            tvTree.text = getString(R.string.maslina)
        }
        else if(text == "бук"){
            ivTree.setImageResource(R.drawable.buk)
            tvTree.text = getString(R.string.buk)
        }
        else {
            ivTree.setImageResource(R.drawable.logo)
            tvTree.text = "Некорректная дата"
        }


    }
}