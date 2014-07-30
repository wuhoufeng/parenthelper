// Code generated by dagger-compiler.  Do not edit.
package com.ksn.parenthelper.ui;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<BootstrapFragmentActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code BootstrapFragmentActivity} and its
 * dependencies.
 * 
 * Being a {@code Provider<BootstrapFragmentActivity>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<BootstrapFragmentActivity>} and handling injection
 * of annotated fields.
 */
public final class BootstrapFragmentActivity$$InjectAdapter extends Binding<BootstrapFragmentActivity>
    implements Provider<BootstrapFragmentActivity>, MembersInjector<BootstrapFragmentActivity> {
  private Binding<com.squareup.otto.Bus> eventBus;

  public BootstrapFragmentActivity$$InjectAdapter() {
    super("com.ksn.parenthelper.ui.BootstrapFragmentActivity", "members/com.ksn.parenthelper.ui.BootstrapFragmentActivity", NOT_SINGLETON, BootstrapFragmentActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    eventBus = (Binding<com.squareup.otto.Bus>) linker.requestBinding("com.squareup.otto.Bus", BootstrapFragmentActivity.class);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(eventBus);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<BootstrapFragmentActivity>}.
   */
  @Override
  public BootstrapFragmentActivity get() {
    BootstrapFragmentActivity result = new BootstrapFragmentActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<BootstrapFragmentActivity>}.
   */
  @Override
  public void injectMembers(BootstrapFragmentActivity object) {
    object.eventBus = eventBus.get();
  }
}
