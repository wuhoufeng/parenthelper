package com.ksn.parenthelper;

import android.accounts.AccountManager;
import android.content.Context;

import com.ksn.parenthelper.authenticator.ApiKeyProvider;
import com.ksn.parenthelper.authenticator.BootstrapAuthenticatorActivity;
import com.ksn.parenthelper.authenticator.LogoutService;
import com.ksn.parenthelper.core.BootstrapService;
import com.ksn.parenthelper.core.Constants;
import com.ksn.parenthelper.core.PostFromAnyThreadBus;
import com.ksn.parenthelper.core.RestAdapterRequestInterceptor;
import com.ksn.parenthelper.core.RestErrorHandler;
import com.ksn.parenthelper.core.TimerService;
import com.ksn.parenthelper.core.UserAgentProvider;
import com.ksn.parenthelper.ui.BootstrapTimerActivity;
import com.ksn.parenthelper.ui.CheckInsListFragment;
import com.ksn.parenthelper.ui.HomeWorkActivity;
import com.ksn.parenthelper.ui.MainActivity;
import com.ksn.parenthelper.ui.MessageActivity;
import com.ksn.parenthelper.ui.NavigationDrawerFragment;
import com.ksn.parenthelper.ui.NewsActivity;
import com.ksn.parenthelper.ui.NewsListFragment;
import com.ksn.parenthelper.ui.SecurityActivity;
import com.ksn.parenthelper.ui.UserActivity;
import com.ksn.parenthelper.ui.UserListFragment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module(
        complete = false,

        injects = {
                BootstrapApplication.class,
                BootstrapAuthenticatorActivity.class,
                MainActivity.class,
                BootstrapTimerActivity.class,
                CheckInsListFragment.class,
                NavigationDrawerFragment.class,
                NewsActivity.class,
                NewsListFragment.class,
                UserActivity.class,
                UserListFragment.class,
                TimerService.class,
                HomeWorkActivity.class,
                SecurityActivity.class,
                MessageActivity.class,


        }
)
public class BootstrapModule {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new PostFromAnyThreadBus();
    }

    @Provides
    @Singleton
    LogoutService provideLogoutService(final Context context, final AccountManager accountManager) {
        return new LogoutService(context, accountManager);
    }

    @Provides
    BootstrapService provideBootstrapService(RestAdapter restAdapter) {
        return new BootstrapService(restAdapter);
    }

    @Provides
    BootstrapServiceProvider provideBootstrapServiceProvider(RestAdapter restAdapter, ApiKeyProvider apiKeyProvider) {
        return new BootstrapServiceProvider(restAdapter, apiKeyProvider);
    }

    @Provides
    ApiKeyProvider provideApiKeyProvider(AccountManager accountManager) {
        return new ApiKeyProvider(accountManager);
    }

    @Provides
    Gson provideGson() {
        /**
         * GSON instance to use for all request  with date format set up for proper parsing.
         * <p/>
         * You can also configure GSON with different naming policies for your API.
         * Maybe your API is Rails API and all json values are lower case with an underscore,
         * like this "first_name" instead of "firstName".
         * You can configure GSON as such below.
         * <p/>
         *
         * public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd")
         *         .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES).create();
         */
        return new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    }

    @Provides
    RestErrorHandler provideRestErrorHandler(Bus bus) {
        return new RestErrorHandler(bus);
    }

    @Provides
    RestAdapterRequestInterceptor provideRestAdapterRequestInterceptor(UserAgentProvider userAgentProvider) {
        return new RestAdapterRequestInterceptor(userAgentProvider);
    }

    @Provides
    RestAdapter provideRestAdapter(RestErrorHandler restErrorHandler, RestAdapterRequestInterceptor restRequestInterceptor, Gson gson) {
        return new RestAdapter.Builder()
                .setEndpoint(Constants.Http.URL_BASE)
                .setErrorHandler(restErrorHandler)
                .setRequestInterceptor(restRequestInterceptor)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setConverter(new GsonConverter(gson))
                .build();
    }

}
