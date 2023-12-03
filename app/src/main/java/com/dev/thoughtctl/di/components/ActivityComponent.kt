package com.dev.thoughtctl.di.components

import com.dev.thoughtctl.di.scopes.ActivityScope
import com.dev.thoughtctl.ui.HomeActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class])
interface ActivityComponent {

    fun inject(homeActivity: HomeActivity)
}