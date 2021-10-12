package com.mat.paris.mar.com.servicesturin.utilturin

import android.content.Context
import android.util.Base64
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener

fun String.decodeFromBase64Turin(): String = String(Base64.decode(this, Base64.DEFAULT))

fun initializationErrorTurin(propertyNameTurin: String): Nothing =
  throw IllegalStateException("$propertyNameTurin has not been initialized yet")

fun Context.checkForPermissionsTurin() {
  Dexter.withContext(this)
    .withPermissions(android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.CAMERA)
    .withListener(object : MultiplePermissionsListener {
      override fun onPermissionsChecked(multiplePermissionsReport: MultiplePermissionsReport) {}

      override fun onPermissionRationaleShouldBeShown(
        list: List<PermissionRequest>,
        permissionToken: PermissionToken,
      ) {
      }
    }).check()
}
