// Code generated by dagger-compiler.  Do not edit.
package com.ksn.parenthelper.ui;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<MainActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code MainActivity} and its
 * dependencies.
 * 
 * Being a {@code Provider<MainActivity>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<MainActivity>} and handling injection
 * of annotated fields.
 */
public final class MainActivity$$InjectAdapter extends Binding<MainActivity>
    implements Provider<MainActivity>, MembersInjector<MainActivity> {
  private Binding<com.ksn.parenthelper.BootstrapServiceProvider> serviceProvider;
  private Binding<BootstrapFragmentActivity> supertype;

  public MainActivity$$InjectAdapter() {
    super("com.ksn.parenthelper.ui.MainActivity", "members/com.ksn.parenthelper.ui.MainActivity", NOT_SINGLETON, MainActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    serviceProvider = (Binding<com.ksn.parenthelper.BootstrapServiceProvider>) linker.requestBinding("com.ksn.parenthelper.BootstrapServiceProvider", MainActivity.class);
    supertype = (Binding<BootstrapFragmentActivity>) linker.requestBinding("members/com.ksn.parenthelper.ui.BootstrapFragmentActivity", MainActivity.class, false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(serviceProvider);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<MainActivity>}.
   */
  @Override
  public MainActivity get() {
    MainActivity result = new MainActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<MainActivity>}.
   */
  @Override
  public void injectMembers(MainActivity object) {
    object.serviceProvider = serviceProvider.get();
    supertype.injectMembers(object);
  }
}
