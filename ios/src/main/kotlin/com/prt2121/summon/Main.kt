package com.prt2121.summon

import org.robovm.apple.foundation.NSAutoreleasePool
import org.robovm.apple.uikit.UIApplication
import org.robovm.apple.uikit.UIApplicationDelegateAdapter
import org.robovm.apple.uikit.UIApplicationLaunchOptions

class Main : UIApplicationDelegateAdapter() {

  override fun didFinishLaunching(application: UIApplication?, launchOptions: UIApplicationLaunchOptions?): Boolean {
    println("didFinishLaunching")
    return true
  }

  companion object {
    @JvmStatic fun main(args: Array<String>) {
      val pool = NSAutoreleasePool()
      UIApplication.main<UIApplication, Main>(args, null, Main::class.java)
      pool.release()
    }
  }
}

