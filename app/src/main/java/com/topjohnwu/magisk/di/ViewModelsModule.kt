package com.topjohnwu.magisk.di

import com.topjohnwu.magisk.legacy.flash.FlashViewModel
import com.topjohnwu.magisk.legacy.surequest.SuRequestViewModel
import com.topjohnwu.magisk.ui.MainViewModel
import com.topjohnwu.magisk.ui.hide.HideViewModel
import com.topjohnwu.magisk.ui.home.HomeViewModel
import com.topjohnwu.magisk.ui.install.InstallViewModel
import com.topjohnwu.magisk.ui.log.LogViewModel
import com.topjohnwu.magisk.ui.module.ModuleViewModel
import com.topjohnwu.magisk.ui.request.RequestViewModel
import com.topjohnwu.magisk.ui.safetynet.SafetynetViewModel
import com.topjohnwu.magisk.ui.settings.SettingsViewModel
import com.topjohnwu.magisk.ui.superuser.SuperuserViewModel
import com.topjohnwu.magisk.ui.theme.ThemeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModules = module {
    viewModel { HideViewModel(get()) }
    viewModel { HomeViewModel(get()) }
    viewModel { LogViewModel(get()) }
    viewModel { ModuleViewModel(get(), get(), get()) }
    viewModel { RequestViewModel() }
    viewModel { SafetynetViewModel(get()) }
    viewModel { SettingsViewModel(get()) }
    viewModel { SuperuserViewModel(get(), get(), get()) }
    viewModel { ThemeViewModel() }
    viewModel { InstallViewModel() }
    viewModel { MainViewModel() }

    // Legacy
    viewModel { FlashViewModel(get()) }
    viewModel { SuRequestViewModel(get(), get(), get(SUTimeout), get()) }
}
