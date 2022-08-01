package id.indocyber.jmo

import android.app.Application
import id.indocyber.jmo.module.networkServiceLogin
import id.indocyber.jmo.module.usecaseModule
import id.indocyber.jmo.module.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class JMOApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@JMOApp)
            modules(listOf(vmModule, networkServiceLogin, usecaseModule))
        }
    }
}