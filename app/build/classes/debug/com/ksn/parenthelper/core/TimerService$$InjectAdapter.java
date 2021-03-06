// Code generated by dagger-compiler.  Do not edit.
package com.ksn.parenthelper.core;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<TimerService>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code TimerService} and its
 * dependencies.
 * 
 * Being a {@code Provider<TimerService>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<TimerService>} and handling injection
 * of annotated fields.
 */
public final class TimerService$$InjectAdapter extends Binding<TimerService>
    implements Provider<TimerService>, MembersInjector<TimerService> {
  private Binding<com.squareup.otto.Bus> eventBus;
  private Binding<android.app.NotificationManager> notificationManager;

  public TimerService$$InjectAdapter() {
    super("com.ksn.parenthelper.core.TimerService", "members/com.ksn.parenthelper.core.TimerService", NOT_SINGLETON, TimerService.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    eventBus = (Binding<com.squareup.otto.Bus>) linker.requestBinding("com.squareup.otto.Bus", TimerService.class);
    notificationManager = (Binding<android.app.NotificationManager>) linker.requestBinding("android.app.NotificationManager", TimerService.class);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(eventBus);
    injectMembersBindings.add(notificationManager);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<TimerService>}.
   */
  @Override
  public TimerService get() {
    TimerService result = new TimerService();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<TimerService>}.
   */
  @Override
  public void injectMembers(TimerService object) {
    object.eventBus = eventBus.get();
    object.notificationManager = notificationManager.get();
  }
}
