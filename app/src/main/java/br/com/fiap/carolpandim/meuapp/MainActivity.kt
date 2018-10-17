package br.com.fiap.carolpandim.meuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.fiap.carolpandim.canivetesuico.demo.calculadora
import br.com.fiap.carolpandim.canivetesuico.toast.CustomToast
import br.com.fiap.carolpandim.canivetesuico.toast.CustomToastType

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calculadora = calculadora()

        calculadora.somar(1,2)

        val customToast = CustomToast(this,layoutInflater)

        if(BuildConfig.REPORT_CRASH){
            //Toast.makeText(this,"Crash Ligado", Toast.LENGTH_SHORT).show()
            customToast.showToast("Crash Ligado",CustomToastType.ERROR)
        }
        else{
            customToast.showToast("Crash Desligado",CustomToastType.INFO)
        }
    }
}
