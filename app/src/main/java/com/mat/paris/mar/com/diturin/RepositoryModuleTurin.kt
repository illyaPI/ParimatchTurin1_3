package com.mat.paris.mar.com.diturin

import android.content.Context
import com.google.gson.Gson
import com.mat.paris.mar.com.importantturin.RepositoryTurin
import com.mat.paris.mar.com.repositoryturin.WebViewRepositoryTurin
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModuleTurin(
  private val appContextTurin: Context,
) {

  @Provides
  fun provideAppContextTurin(): Context = appContextTurin

  @Provides
  fun provideGsonTurin(): Gson = Gson()

  @Singleton
  @Provides
  fun provideRepositoryTurin(appContextTurin: Context, gsonTurin: Gson): RepositoryTurin =
    WebViewRepositoryTurin(appContextTurin, gsonTurin)
}