package com.example.reelblocker

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.widget.Toast

class ReelBlockerService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        if (event?.packageName == "com.instagram.android") {
            performGlobalAction(GLOBAL_ACTION_HOME)
            Toast.makeText(this, "Reel Blocked", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onInterrupt() {}
}
