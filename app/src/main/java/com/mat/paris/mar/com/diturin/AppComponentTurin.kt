package com.mat.paris.mar.com.diturin

import com.mat.paris.mar.com.importantturin.applicationturin.WebViewApplicationTurin
import com.mat.paris.mar.com.repositoryturin.activitiesturin.LoadingActivityTurin
import com.mat.paris.mar.com.repositoryturin.activitiesturin.WebViewActivityTurin
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModuleTurin::class])
interface AppComponentTurin {

  fun injectTurin(applicationTurin: WebViewApplicationTurin)
  fun injectTurin(activityTurin: LoadingActivityTurin)
  fun injectTurin(activityTurin: WebViewActivityTurin)
}